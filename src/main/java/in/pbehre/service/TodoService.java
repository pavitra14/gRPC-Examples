package in.pbehre.service;

import com.google.protobuf.Empty;
import in.pbehre.exceptions.TodoAlreadyExists;
import in.pbehre.exceptions.TodoNotFoundException;
import in.pbehre.proto.*;
import in.pbehre.proto.TodoServiceGrpc.TodoServiceImplBase;
import in.pbehre.store.TodoStore;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.logging.Logger;

public class TodoService extends TodoServiceImplBase{
    private final TodoStore store;

    public static final Logger logger = Logger.getLogger(TodoService.class.getName());
    public TodoService()
    {
        store = new TodoStore();
    }

    @Override
    public void addTodo(TodoAddRequest request, StreamObserver<TodoAddResponse> responseObserver) {
        try {
            logger.info("Received Request(addTodo): " + request.toString());
            int id = store.add(request);
            TodoAddResponse response = TodoAddResponse.newBuilder()
                    .setId(id)
                    .setTodo(request.getTodo())
                    .setStatus(true)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (TodoAlreadyExists todoAlreadyExists) {
            responseObserver.onError(
                    Status.ALREADY_EXISTS
                    .withDescription(todoAlreadyExists.getMessage())
                    .asRuntimeException()
            );
        }
    }

    @Override
    public void getTodo(GetTodoRequest request, StreamObserver<GetTodoResponse> responseObserver) {
        try{
            logger.info("Received Request(getTodo): " + request.toString());
            GetTodoResponse resp = store.getTodo(request);
            responseObserver.onNext(resp);
            responseObserver.onCompleted();
        } catch (TodoNotFoundException e)
        {
            responseObserver.onError(
                    Status.NOT_FOUND
                    .withDescription(e.getMessage())
                    .asRuntimeException()
            );
        }
    }

    @Override
    public StreamObserver<TodoAddRequest> addAll(final StreamObserver<GenericStatus> responseObserver) {
        return new StreamObserver<TodoAddRequest>() {
            private int count=0;
            @Override
            public void onNext(TodoAddRequest todoAddRequest) {
                try{
                    int id = store.add(todoAddRequest);
                    count++;
                } catch (TodoAlreadyExists e)
                {
                    responseObserver.onError(
                            Status.ALREADY_EXISTS
                                    .withDescription("Todo Already Exists with ID: " + todoAddRequest.toString())
                                    .asRuntimeException()
                    );
                }
            }

            @Override
            public void onError(Throwable throwable) {
                logger.warning("Encountered error in recordRoute" + throwable);
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(GenericStatus.newBuilder()
                        .setStatus(true)
                        .setMessage("Added Todo(s): " + count)
                        .build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getAll(Empty request, StreamObserver<GetTodoResponse> responseObserver) {
        logger.info("Received Request(getAll)");
        for(GetTodoResponse r: store.GetAll())
        {
            responseObserver.onNext(r);
        }
        responseObserver.onCompleted();
    }


    @Override
    public StreamObserver<TodoAddRequest> syncOp(final StreamObserver<TodoAddResponse> responseObserver) {
        logger.info("Received Request(syncOp)");
        return new StreamObserver<TodoAddRequest>() {
            @Override
            public void onNext(TodoAddRequest todoAddRequest) {

                int id = store.add(todoAddRequest);
                TodoAddResponse response = TodoAddResponse.newBuilder()
                        .setId(id)
                        .setTodo(todoAddRequest.getTodo())
                        .setStatus(true)
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {
                logger.severe(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
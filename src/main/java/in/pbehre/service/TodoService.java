package in.pbehre.service;

import in.pbehre.exceptions.TodoAlreadyExists;
import in.pbehre.exceptions.TodoNotFoundException;
import in.pbehre.proto.GetTodoRequest;
import in.pbehre.proto.GetTodoResponse;
import in.pbehre.proto.TodoAddRequest;
import in.pbehre.proto.TodoAddResponse;
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
}
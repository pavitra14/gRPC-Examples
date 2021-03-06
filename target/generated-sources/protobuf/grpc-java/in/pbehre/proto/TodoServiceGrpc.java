package in.pbehre.proto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: TodoService.proto")
public final class TodoServiceGrpc {

  private TodoServiceGrpc() {}

  public static final String SERVICE_NAME = "in.pbehre.TodoService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<in.pbehre.proto.TodoAddRequest,
      in.pbehre.proto.TodoAddResponse> METHOD_ADD_TODO =
      io.grpc.MethodDescriptor.<in.pbehre.proto.TodoAddRequest, in.pbehre.proto.TodoAddResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "in.pbehre.TodoService", "AddTodo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              in.pbehre.proto.TodoAddRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              in.pbehre.proto.TodoAddResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<in.pbehre.proto.GetTodoRequest,
      in.pbehre.proto.GetTodoResponse> METHOD_GET_TODO =
      io.grpc.MethodDescriptor.<in.pbehre.proto.GetTodoRequest, in.pbehre.proto.GetTodoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "in.pbehre.TodoService", "GetTodo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              in.pbehre.proto.GetTodoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              in.pbehre.proto.GetTodoResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<in.pbehre.proto.TodoAddRequest,
      in.pbehre.proto.GenericStatus> METHOD_ADD_ALL =
      io.grpc.MethodDescriptor.<in.pbehre.proto.TodoAddRequest, in.pbehre.proto.GenericStatus>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "in.pbehre.TodoService", "AddAll"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              in.pbehre.proto.TodoAddRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              in.pbehre.proto.GenericStatus.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      in.pbehre.proto.GetTodoResponse> METHOD_GET_ALL =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, in.pbehre.proto.GetTodoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "in.pbehre.TodoService", "GetAll"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              in.pbehre.proto.GetTodoResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<in.pbehre.proto.TodoAddRequest,
      in.pbehre.proto.TodoAddResponse> METHOD_SYNC_OP =
      io.grpc.MethodDescriptor.<in.pbehre.proto.TodoAddRequest, in.pbehre.proto.TodoAddResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "in.pbehre.TodoService", "SyncOp"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              in.pbehre.proto.TodoAddRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              in.pbehre.proto.TodoAddResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TodoServiceStub newStub(io.grpc.Channel channel) {
    return new TodoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TodoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TodoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TodoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TodoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TodoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *  Unary Requests
     * </pre>
     */
    public void addTodo(in.pbehre.proto.TodoAddRequest request,
        io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_TODO, responseObserver);
    }

    /**
     */
    public void getTodo(in.pbehre.proto.GetTodoRequest request,
        io.grpc.stub.StreamObserver<in.pbehre.proto.GetTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TODO, responseObserver);
    }

    /**
     * <pre>
     *Client Side Streaming - Unidirectional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddRequest> addAll(
        io.grpc.stub.StreamObserver<in.pbehre.proto.GenericStatus> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ADD_ALL, responseObserver);
    }

    /**
     * <pre>
     *Server Side Streaming - Unidirectional
     * </pre>
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<in.pbehre.proto.GetTodoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL, responseObserver);
    }

    /**
     * <pre>
     *Synchronised Streaming - Bidirectional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddRequest> syncOp(
        io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_SYNC_OP, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD_TODO,
            asyncUnaryCall(
              new MethodHandlers<
                in.pbehre.proto.TodoAddRequest,
                in.pbehre.proto.TodoAddResponse>(
                  this, METHODID_ADD_TODO)))
          .addMethod(
            METHOD_GET_TODO,
            asyncUnaryCall(
              new MethodHandlers<
                in.pbehre.proto.GetTodoRequest,
                in.pbehre.proto.GetTodoResponse>(
                  this, METHODID_GET_TODO)))
          .addMethod(
            METHOD_ADD_ALL,
            asyncClientStreamingCall(
              new MethodHandlers<
                in.pbehre.proto.TodoAddRequest,
                in.pbehre.proto.GenericStatus>(
                  this, METHODID_ADD_ALL)))
          .addMethod(
            METHOD_GET_ALL,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                in.pbehre.proto.GetTodoResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            METHOD_SYNC_OP,
            asyncBidiStreamingCall(
              new MethodHandlers<
                in.pbehre.proto.TodoAddRequest,
                in.pbehre.proto.TodoAddResponse>(
                  this, METHODID_SYNC_OP)))
          .build();
    }
  }

  /**
   */
  public static final class TodoServiceStub extends io.grpc.stub.AbstractStub<TodoServiceStub> {
    private TodoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TodoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TodoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *  Unary Requests
     * </pre>
     */
    public void addTodo(in.pbehre.proto.TodoAddRequest request,
        io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_TODO, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTodo(in.pbehre.proto.GetTodoRequest request,
        io.grpc.stub.StreamObserver<in.pbehre.proto.GetTodoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TODO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client Side Streaming - Unidirectional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddRequest> addAll(
        io.grpc.stub.StreamObserver<in.pbehre.proto.GenericStatus> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_ADD_ALL, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Server Side Streaming - Unidirectional
     * </pre>
     */
    public void getAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<in.pbehre.proto.GetTodoResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_ALL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Synchronised Streaming - Bidirectional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddRequest> syncOp(
        io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_SYNC_OP, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TodoServiceBlockingStub extends io.grpc.stub.AbstractStub<TodoServiceBlockingStub> {
    private TodoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TodoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TodoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  Unary Requests
     * </pre>
     */
    public in.pbehre.proto.TodoAddResponse addTodo(in.pbehre.proto.TodoAddRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_TODO, getCallOptions(), request);
    }

    /**
     */
    public in.pbehre.proto.GetTodoResponse getTodo(in.pbehre.proto.GetTodoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TODO, getCallOptions(), request);
    }

    /**
     * <pre>
     *Server Side Streaming - Unidirectional
     * </pre>
     */
    public java.util.Iterator<in.pbehre.proto.GetTodoResponse> getAll(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_ALL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TodoServiceFutureStub extends io.grpc.stub.AbstractStub<TodoServiceFutureStub> {
    private TodoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TodoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TodoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  Unary Requests
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<in.pbehre.proto.TodoAddResponse> addTodo(
        in.pbehre.proto.TodoAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_TODO, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<in.pbehre.proto.GetTodoResponse> getTodo(
        in.pbehre.proto.GetTodoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TODO, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_TODO = 0;
  private static final int METHODID_GET_TODO = 1;
  private static final int METHODID_GET_ALL = 2;
  private static final int METHODID_ADD_ALL = 3;
  private static final int METHODID_SYNC_OP = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TodoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TodoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_TODO:
          serviceImpl.addTodo((in.pbehre.proto.TodoAddRequest) request,
              (io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddResponse>) responseObserver);
          break;
        case METHODID_GET_TODO:
          serviceImpl.getTodo((in.pbehre.proto.GetTodoRequest) request,
              (io.grpc.stub.StreamObserver<in.pbehre.proto.GetTodoResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<in.pbehre.proto.GetTodoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addAll(
              (io.grpc.stub.StreamObserver<in.pbehre.proto.GenericStatus>) responseObserver);
        case METHODID_SYNC_OP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.syncOp(
              (io.grpc.stub.StreamObserver<in.pbehre.proto.TodoAddResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class TodoServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return in.pbehre.proto.TodoRPCService.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TodoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TodoServiceDescriptorSupplier())
              .addMethod(METHOD_ADD_TODO)
              .addMethod(METHOD_GET_TODO)
              .addMethod(METHOD_ADD_ALL)
              .addMethod(METHOD_GET_ALL)
              .addMethod(METHOD_SYNC_OP)
              .build();
        }
      }
    }
    return result;
  }
}

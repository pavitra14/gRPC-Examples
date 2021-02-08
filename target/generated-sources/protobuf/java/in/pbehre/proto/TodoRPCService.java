// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TodoService.proto

package in.pbehre.proto;

public final class TodoRPCService {
  private TodoRPCService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_in_pbehre_TodoAddRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_in_pbehre_TodoAddRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_in_pbehre_TodoAddResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_in_pbehre_TodoAddResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_in_pbehre_GetTodoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_in_pbehre_GetTodoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_in_pbehre_GetTodoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_in_pbehre_GetTodoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_in_pbehre_GenericStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_in_pbehre_GenericStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021TodoService.proto\022\tin.pbehre\032\033google/p" +
      "rotobuf/empty.proto\"*\n\016TodoAddRequest\022\n\n" +
      "\002id\030\001 \001(\005\022\014\n\004todo\030\002 \001(\t\";\n\017TodoAddRespon" +
      "se\022\n\n\002id\030\001 \001(\005\022\014\n\004todo\030\002 \001(\t\022\016\n\006status\030\003" +
      " \001(\010\"\034\n\016GetTodoRequest\022\n\n\002id\030\001 \001(\005\"+\n\017Ge" +
      "tTodoResponse\022\n\n\002id\030\001 \001(\005\022\014\n\004todo\030\002 \001(\t\"" +
      "0\n\rGenericStatus\022\016\n\006status\030\001 \001(\010\022\017\n\007mess" +
      "age\030\002 \001(\t2\327\002\n\013TodoService\022@\n\007AddTodo\022\031.i" +
      "n.pbehre.TodoAddRequest\032\032.in.pbehre.Todo" +
      "AddResponse\022@\n\007GetTodo\022\031.in.pbehre.GetTo",
      "doRequest\032\032.in.pbehre.GetTodoResponse\022?\n" +
      "\006AddAll\022\031.in.pbehre.TodoAddRequest\032\030.in." +
      "pbehre.GenericStatus(\001\022>\n\006GetAll\022\026.googl" +
      "e.protobuf.Empty\032\032.in.pbehre.GetTodoResp" +
      "onse0\001\022C\n\006SyncOp\022\031.in.pbehre.TodoAddRequ" +
      "est\032\032.in.pbehre.TodoAddResponse(\0010\001B#\n\017i" +
      "n.pbehre.protoB\016TodoRPCServiceP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_in_pbehre_TodoAddRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_in_pbehre_TodoAddRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_in_pbehre_TodoAddRequest_descriptor,
        new java.lang.String[] { "Id", "Todo", });
    internal_static_in_pbehre_TodoAddResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_in_pbehre_TodoAddResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_in_pbehre_TodoAddResponse_descriptor,
        new java.lang.String[] { "Id", "Todo", "Status", });
    internal_static_in_pbehre_GetTodoRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_in_pbehre_GetTodoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_in_pbehre_GetTodoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_in_pbehre_GetTodoResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_in_pbehre_GetTodoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_in_pbehre_GetTodoResponse_descriptor,
        new java.lang.String[] { "Id", "Todo", });
    internal_static_in_pbehre_GenericStatus_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_in_pbehre_GenericStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_in_pbehre_GenericStatus_descriptor,
        new java.lang.String[] { "Status", "Message", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

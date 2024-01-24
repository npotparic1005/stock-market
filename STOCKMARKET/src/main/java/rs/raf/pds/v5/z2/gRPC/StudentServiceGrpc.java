package rs.raf.pds.v5.z2.gRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: student_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.StudentUpit,
      rs.raf.pds.v5.z2.gRPC.Student> getGetStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudent",
      requestType = rs.raf.pds.v5.z2.gRPC.StudentUpit.class,
      responseType = rs.raf.pds.v5.z2.gRPC.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.StudentUpit,
      rs.raf.pds.v5.z2.gRPC.Student> getGetStudentMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.StudentUpit, rs.raf.pds.v5.z2.gRPC.Student> getGetStudentMethod;
    if ((getGetStudentMethod = StudentServiceGrpc.getGetStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentMethod = StudentServiceGrpc.getGetStudentMethod) == null) {
          StudentServiceGrpc.getGetStudentMethod = getGetStudentMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.StudentUpit, rs.raf.pds.v5.z2.gRPC.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.StudentUpit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudent"))
              .build();
        }
      }
    }
    return getGetStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Ispit,
      rs.raf.pds.v5.z2.gRPC.Student> getGetAllStudentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStudents",
      requestType = rs.raf.pds.v5.z2.gRPC.Ispit.class,
      responseType = rs.raf.pds.v5.z2.gRPC.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Ispit,
      rs.raf.pds.v5.z2.gRPC.Student> getGetAllStudentsMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Ispit, rs.raf.pds.v5.z2.gRPC.Student> getGetAllStudentsMethod;
    if ((getGetAllStudentsMethod = StudentServiceGrpc.getGetAllStudentsMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetAllStudentsMethod = StudentServiceGrpc.getGetAllStudentsMethod) == null) {
          StudentServiceGrpc.getGetAllStudentsMethod = getGetAllStudentsMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.Ispit, rs.raf.pds.v5.z2.gRPC.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllStudents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Ispit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Student.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetAllStudents"))
              .build();
        }
      }
    }
    return getGetAllStudentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Ocena,
      rs.raf.pds.v5.z2.gRPC.IspitIzvestaj> getUnosOcenaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnosOcena",
      requestType = rs.raf.pds.v5.z2.gRPC.Ocena.class,
      responseType = rs.raf.pds.v5.z2.gRPC.IspitIzvestaj.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Ocena,
      rs.raf.pds.v5.z2.gRPC.IspitIzvestaj> getUnosOcenaMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Ocena, rs.raf.pds.v5.z2.gRPC.IspitIzvestaj> getUnosOcenaMethod;
    if ((getUnosOcenaMethod = StudentServiceGrpc.getUnosOcenaMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getUnosOcenaMethod = StudentServiceGrpc.getUnosOcenaMethod) == null) {
          StudentServiceGrpc.getUnosOcenaMethod = getUnosOcenaMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.Ocena, rs.raf.pds.v5.z2.gRPC.IspitIzvestaj>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnosOcena"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Ocena.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.IspitIzvestaj.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("UnosOcena"))
              .build();
        }
      }
    }
    return getUnosOcenaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub>() {
        @java.lang.Override
        public StudentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceStub(channel, callOptions);
        }
      };
    return StudentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub>() {
        @java.lang.Override
        public StudentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceBlockingStub(channel, callOptions);
        }
      };
    return StudentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub>() {
        @java.lang.Override
        public StudentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceFutureStub(channel, callOptions);
        }
      };
    return StudentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStudent(rs.raf.pds.v5.z2.gRPC.StudentUpit request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentMethod(), responseObserver);
    }

    /**
     */
    default void getAllStudents(rs.raf.pds.v5.z2.gRPC.Ispit request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStudentsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Ocena> unosOcena(
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.IspitIzvestaj> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUnosOcenaMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StudentService.
   */
  public static abstract class StudentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StudentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StudentService.
   */
  public static final class StudentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StudentServiceStub> {
    private StudentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStudent(rs.raf.pds.v5.z2.gRPC.StudentUpit request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllStudents(rs.raf.pds.v5.z2.gRPC.Ispit request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllStudentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Ocena> unosOcena(
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.IspitIzvestaj> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUnosOcenaMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StudentService.
   */
  public static final class StudentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.Student getStudent(rs.raf.pds.v5.z2.gRPC.StudentUpit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<rs.raf.pds.v5.z2.gRPC.Student> getAllStudents(
        rs.raf.pds.v5.z2.gRPC.Ispit request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllStudentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StudentService.
   */
  public static final class StudentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.Student> getStudent(
        rs.raf.pds.v5.z2.gRPC.StudentUpit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STUDENT = 0;
  private static final int METHODID_GET_ALL_STUDENTS = 1;
  private static final int METHODID_UNOS_OCENA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT:
          serviceImpl.getStudent((rs.raf.pds.v5.z2.gRPC.StudentUpit) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Student>) responseObserver);
          break;
        case METHODID_GET_ALL_STUDENTS:
          serviceImpl.getAllStudents((rs.raf.pds.v5.z2.gRPC.Ispit) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Student>) responseObserver);
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
        case METHODID_UNOS_OCENA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.unosOcena(
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.IspitIzvestaj>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.StudentUpit,
              rs.raf.pds.v5.z2.gRPC.Student>(
                service, METHODID_GET_STUDENT)))
        .addMethod(
          getGetAllStudentsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.Ispit,
              rs.raf.pds.v5.z2.gRPC.Student>(
                service, METHODID_GET_ALL_STUDENTS)))
        .addMethod(
          getUnosOcenaMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.Ocena,
              rs.raf.pds.v5.z2.gRPC.IspitIzvestaj>(
                service, METHODID_UNOS_OCENA)))
        .build();
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rs.raf.pds.v5.z2.gRPC.StudentServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getGetStudentMethod())
              .addMethod(getGetAllStudentsMethod())
              .addMethod(getUnosOcenaMethod())
              .build();
        }
      }
    }
    return result;
  }
}

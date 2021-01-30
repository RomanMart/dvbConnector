package dvbinterface;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0)",
    comments = "Source: dvbinterface.proto")
public final class dataConnectionGrpc {

  private dataConnectionGrpc() {}

  public static final String SERVICE_NAME = "dvbinterface.dataConnection";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getConnectionRequest,
      dvbinterface.Dvbinterface.getConnectionResult> getGetConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getConnection",
      requestType = dvbinterface.Dvbinterface.getConnectionRequest.class,
      responseType = dvbinterface.Dvbinterface.getConnectionResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getConnectionRequest,
      dvbinterface.Dvbinterface.getConnectionResult> getGetConnectionMethod() {
    io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getConnectionRequest, dvbinterface.Dvbinterface.getConnectionResult> getGetConnectionMethod;
    if ((getGetConnectionMethod = dataConnectionGrpc.getGetConnectionMethod) == null) {
      synchronized (dataConnectionGrpc.class) {
        if ((getGetConnectionMethod = dataConnectionGrpc.getGetConnectionMethod) == null) {
          dataConnectionGrpc.getGetConnectionMethod = getGetConnectionMethod =
              io.grpc.MethodDescriptor.<dvbinterface.Dvbinterface.getConnectionRequest, dvbinterface.Dvbinterface.getConnectionResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getConnectionResult.getDefaultInstance()))
              .setSchemaDescriptor(new dataConnectionMethodDescriptorSupplier("getConnection"))
              .build();
        }
      }
    }
    return getGetConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getCatalogsRequest,
      dvbinterface.Dvbinterface.getCatalogsResult> getGetCatalogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCatalogs",
      requestType = dvbinterface.Dvbinterface.getCatalogsRequest.class,
      responseType = dvbinterface.Dvbinterface.getCatalogsResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getCatalogsRequest,
      dvbinterface.Dvbinterface.getCatalogsResult> getGetCatalogsMethod() {
    io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getCatalogsRequest, dvbinterface.Dvbinterface.getCatalogsResult> getGetCatalogsMethod;
    if ((getGetCatalogsMethod = dataConnectionGrpc.getGetCatalogsMethod) == null) {
      synchronized (dataConnectionGrpc.class) {
        if ((getGetCatalogsMethod = dataConnectionGrpc.getGetCatalogsMethod) == null) {
          dataConnectionGrpc.getGetCatalogsMethod = getGetCatalogsMethod =
              io.grpc.MethodDescriptor.<dvbinterface.Dvbinterface.getCatalogsRequest, dvbinterface.Dvbinterface.getCatalogsResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCatalogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getCatalogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getCatalogsResult.getDefaultInstance()))
              .setSchemaDescriptor(new dataConnectionMethodDescriptorSupplier("getCatalogs"))
              .build();
        }
      }
    }
    return getGetCatalogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getSchemasRequest,
      dvbinterface.Dvbinterface.getSchemasResult> getGetSchemasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSchemas",
      requestType = dvbinterface.Dvbinterface.getSchemasRequest.class,
      responseType = dvbinterface.Dvbinterface.getSchemasResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getSchemasRequest,
      dvbinterface.Dvbinterface.getSchemasResult> getGetSchemasMethod() {
    io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getSchemasRequest, dvbinterface.Dvbinterface.getSchemasResult> getGetSchemasMethod;
    if ((getGetSchemasMethod = dataConnectionGrpc.getGetSchemasMethod) == null) {
      synchronized (dataConnectionGrpc.class) {
        if ((getGetSchemasMethod = dataConnectionGrpc.getGetSchemasMethod) == null) {
          dataConnectionGrpc.getGetSchemasMethod = getGetSchemasMethod =
              io.grpc.MethodDescriptor.<dvbinterface.Dvbinterface.getSchemasRequest, dvbinterface.Dvbinterface.getSchemasResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSchemas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getSchemasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getSchemasResult.getDefaultInstance()))
              .setSchemaDescriptor(new dataConnectionMethodDescriptorSupplier("getSchemas"))
              .build();
        }
      }
    }
    return getGetSchemasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getTablesRequest,
      dvbinterface.Dvbinterface.getTablesResult> getGetTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTables",
      requestType = dvbinterface.Dvbinterface.getTablesRequest.class,
      responseType = dvbinterface.Dvbinterface.getTablesResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getTablesRequest,
      dvbinterface.Dvbinterface.getTablesResult> getGetTablesMethod() {
    io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getTablesRequest, dvbinterface.Dvbinterface.getTablesResult> getGetTablesMethod;
    if ((getGetTablesMethod = dataConnectionGrpc.getGetTablesMethod) == null) {
      synchronized (dataConnectionGrpc.class) {
        if ((getGetTablesMethod = dataConnectionGrpc.getGetTablesMethod) == null) {
          dataConnectionGrpc.getGetTablesMethod = getGetTablesMethod =
              io.grpc.MethodDescriptor.<dvbinterface.Dvbinterface.getTablesRequest, dvbinterface.Dvbinterface.getTablesResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getTablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getTablesResult.getDefaultInstance()))
              .setSchemaDescriptor(new dataConnectionMethodDescriptorSupplier("getTables"))
              .build();
        }
      }
    }
    return getGetTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getColumnsRequest,
      dvbinterface.Dvbinterface.getColumnsResult> getGetColumnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getColumns",
      requestType = dvbinterface.Dvbinterface.getColumnsRequest.class,
      responseType = dvbinterface.Dvbinterface.getColumnsResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getColumnsRequest,
      dvbinterface.Dvbinterface.getColumnsResult> getGetColumnsMethod() {
    io.grpc.MethodDescriptor<dvbinterface.Dvbinterface.getColumnsRequest, dvbinterface.Dvbinterface.getColumnsResult> getGetColumnsMethod;
    if ((getGetColumnsMethod = dataConnectionGrpc.getGetColumnsMethod) == null) {
      synchronized (dataConnectionGrpc.class) {
        if ((getGetColumnsMethod = dataConnectionGrpc.getGetColumnsMethod) == null) {
          dataConnectionGrpc.getGetColumnsMethod = getGetColumnsMethod =
              io.grpc.MethodDescriptor.<dvbinterface.Dvbinterface.getColumnsRequest, dvbinterface.Dvbinterface.getColumnsResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getColumns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getColumnsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dvbinterface.Dvbinterface.getColumnsResult.getDefaultInstance()))
              .setSchemaDescriptor(new dataConnectionMethodDescriptorSupplier("getColumns"))
              .build();
        }
      }
    }
    return getGetColumnsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static dataConnectionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<dataConnectionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<dataConnectionStub>() {
        @java.lang.Override
        public dataConnectionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new dataConnectionStub(channel, callOptions);
        }
      };
    return dataConnectionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static dataConnectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<dataConnectionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<dataConnectionBlockingStub>() {
        @java.lang.Override
        public dataConnectionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new dataConnectionBlockingStub(channel, callOptions);
        }
      };
    return dataConnectionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static dataConnectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<dataConnectionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<dataConnectionFutureStub>() {
        @java.lang.Override
        public dataConnectionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new dataConnectionFutureStub(channel, callOptions);
        }
      };
    return dataConnectionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class dataConnectionImplBase implements io.grpc.BindableService {

    /**
     */
    public void getConnection(dvbinterface.Dvbinterface.getConnectionRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getConnectionResult> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConnectionMethod(), responseObserver);
    }

    /**
     */
    public void getCatalogs(dvbinterface.Dvbinterface.getCatalogsRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getCatalogsResult> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCatalogsMethod(), responseObserver);
    }

    /**
     */
    public void getSchemas(dvbinterface.Dvbinterface.getSchemasRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getSchemasResult> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSchemasMethod(), responseObserver);
    }

    /**
     */
    public void getTables(dvbinterface.Dvbinterface.getTablesRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getTablesResult> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTablesMethod(), responseObserver);
    }

    /**
     */
    public void getColumns(dvbinterface.Dvbinterface.getColumnsRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getColumnsResult> responseObserver) {
      asyncUnimplementedUnaryCall(getGetColumnsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetConnectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dvbinterface.Dvbinterface.getConnectionRequest,
                dvbinterface.Dvbinterface.getConnectionResult>(
                  this, METHODID_GET_CONNECTION)))
          .addMethod(
            getGetCatalogsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dvbinterface.Dvbinterface.getCatalogsRequest,
                dvbinterface.Dvbinterface.getCatalogsResult>(
                  this, METHODID_GET_CATALOGS)))
          .addMethod(
            getGetSchemasMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dvbinterface.Dvbinterface.getSchemasRequest,
                dvbinterface.Dvbinterface.getSchemasResult>(
                  this, METHODID_GET_SCHEMAS)))
          .addMethod(
            getGetTablesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dvbinterface.Dvbinterface.getTablesRequest,
                dvbinterface.Dvbinterface.getTablesResult>(
                  this, METHODID_GET_TABLES)))
          .addMethod(
            getGetColumnsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dvbinterface.Dvbinterface.getColumnsRequest,
                dvbinterface.Dvbinterface.getColumnsResult>(
                  this, METHODID_GET_COLUMNS)))
          .build();
    }
  }

  /**
   */
  public static final class dataConnectionStub extends io.grpc.stub.AbstractAsyncStub<dataConnectionStub> {
    private dataConnectionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dataConnectionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new dataConnectionStub(channel, callOptions);
    }

    /**
     */
    public void getConnection(dvbinterface.Dvbinterface.getConnectionRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getConnectionResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCatalogs(dvbinterface.Dvbinterface.getCatalogsRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getCatalogsResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCatalogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSchemas(dvbinterface.Dvbinterface.getSchemasRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getSchemasResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSchemasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTables(dvbinterface.Dvbinterface.getTablesRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getTablesResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getColumns(dvbinterface.Dvbinterface.getColumnsRequest request,
        io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getColumnsResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetColumnsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class dataConnectionBlockingStub extends io.grpc.stub.AbstractBlockingStub<dataConnectionBlockingStub> {
    private dataConnectionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dataConnectionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new dataConnectionBlockingStub(channel, callOptions);
    }

    /**
     */
    public dvbinterface.Dvbinterface.getConnectionResult getConnection(dvbinterface.Dvbinterface.getConnectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dvbinterface.Dvbinterface.getCatalogsResult getCatalogs(dvbinterface.Dvbinterface.getCatalogsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCatalogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dvbinterface.Dvbinterface.getSchemasResult getSchemas(dvbinterface.Dvbinterface.getSchemasRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSchemasMethod(), getCallOptions(), request);
    }

    /**
     */
    public dvbinterface.Dvbinterface.getTablesResult getTables(dvbinterface.Dvbinterface.getTablesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTablesMethod(), getCallOptions(), request);
    }

    /**
     */
    public dvbinterface.Dvbinterface.getColumnsResult getColumns(dvbinterface.Dvbinterface.getColumnsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetColumnsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class dataConnectionFutureStub extends io.grpc.stub.AbstractFutureStub<dataConnectionFutureStub> {
    private dataConnectionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dataConnectionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new dataConnectionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dvbinterface.Dvbinterface.getConnectionResult> getConnection(
        dvbinterface.Dvbinterface.getConnectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dvbinterface.Dvbinterface.getCatalogsResult> getCatalogs(
        dvbinterface.Dvbinterface.getCatalogsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCatalogsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dvbinterface.Dvbinterface.getSchemasResult> getSchemas(
        dvbinterface.Dvbinterface.getSchemasRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSchemasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dvbinterface.Dvbinterface.getTablesResult> getTables(
        dvbinterface.Dvbinterface.getTablesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTablesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dvbinterface.Dvbinterface.getColumnsResult> getColumns(
        dvbinterface.Dvbinterface.getColumnsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetColumnsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONNECTION = 0;
  private static final int METHODID_GET_CATALOGS = 1;
  private static final int METHODID_GET_SCHEMAS = 2;
  private static final int METHODID_GET_TABLES = 3;
  private static final int METHODID_GET_COLUMNS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final dataConnectionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(dataConnectionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONNECTION:
          serviceImpl.getConnection((dvbinterface.Dvbinterface.getConnectionRequest) request,
              (io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getConnectionResult>) responseObserver);
          break;
        case METHODID_GET_CATALOGS:
          serviceImpl.getCatalogs((dvbinterface.Dvbinterface.getCatalogsRequest) request,
              (io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getCatalogsResult>) responseObserver);
          break;
        case METHODID_GET_SCHEMAS:
          serviceImpl.getSchemas((dvbinterface.Dvbinterface.getSchemasRequest) request,
              (io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getSchemasResult>) responseObserver);
          break;
        case METHODID_GET_TABLES:
          serviceImpl.getTables((dvbinterface.Dvbinterface.getTablesRequest) request,
              (io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getTablesResult>) responseObserver);
          break;
        case METHODID_GET_COLUMNS:
          serviceImpl.getColumns((dvbinterface.Dvbinterface.getColumnsRequest) request,
              (io.grpc.stub.StreamObserver<dvbinterface.Dvbinterface.getColumnsResult>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class dataConnectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    dataConnectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dvbinterface.Dvbinterface.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("dataConnection");
    }
  }

  private static final class dataConnectionFileDescriptorSupplier
      extends dataConnectionBaseDescriptorSupplier {
    dataConnectionFileDescriptorSupplier() {}
  }

  private static final class dataConnectionMethodDescriptorSupplier
      extends dataConnectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    dataConnectionMethodDescriptorSupplier(String methodName) {
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
      synchronized (dataConnectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new dataConnectionFileDescriptorSupplier())
              .addMethod(getGetConnectionMethod())
              .addMethod(getGetCatalogsMethod())
              .addMethod(getGetSchemasMethod())
              .addMethod(getGetTablesMethod())
              .addMethod(getGetColumnsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package rs.raf.pds.v5.z2.gRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: student_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StockExchangeServiceGrpc {

  private StockExchangeServiceGrpc() {}

  public static final String SERVICE_NAME = "StockExchangeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.StockRequest,
      rs.raf.pds.v5.z2.gRPC.StockData> getGetStockDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStockData",
      requestType = rs.raf.pds.v5.z2.gRPC.StockRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.StockData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.StockRequest,
      rs.raf.pds.v5.z2.gRPC.StockData> getGetStockDataMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.StockRequest, rs.raf.pds.v5.z2.gRPC.StockData> getGetStockDataMethod;
    if ((getGetStockDataMethod = StockExchangeServiceGrpc.getGetStockDataMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetStockDataMethod = StockExchangeServiceGrpc.getGetStockDataMethod) == null) {
          StockExchangeServiceGrpc.getGetStockDataMethod = getGetStockDataMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.StockRequest, rs.raf.pds.v5.z2.gRPC.StockData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStockData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.StockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.StockData.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetStockData"))
              .build();
        }
      }
    }
    return getGetStockDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.EmptyMessage,
      rs.raf.pds.v5.z2.gRPC.StockData> getGetAllStockDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStockData",
      requestType = rs.raf.pds.v5.z2.gRPC.EmptyMessage.class,
      responseType = rs.raf.pds.v5.z2.gRPC.StockData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.EmptyMessage,
      rs.raf.pds.v5.z2.gRPC.StockData> getGetAllStockDataMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.EmptyMessage, rs.raf.pds.v5.z2.gRPC.StockData> getGetAllStockDataMethod;
    if ((getGetAllStockDataMethod = StockExchangeServiceGrpc.getGetAllStockDataMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetAllStockDataMethod = StockExchangeServiceGrpc.getGetAllStockDataMethod) == null) {
          StockExchangeServiceGrpc.getGetAllStockDataMethod = getGetAllStockDataMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.EmptyMessage, rs.raf.pds.v5.z2.gRPC.StockData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllStockData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.StockData.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetAllStockData"))
              .build();
        }
      }
    }
    return getGetAllStockDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.AskRequest,
      rs.raf.pds.v5.z2.gRPC.OrderList> getGetAskOffersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAskOffers",
      requestType = rs.raf.pds.v5.z2.gRPC.AskRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.OrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.AskRequest,
      rs.raf.pds.v5.z2.gRPC.OrderList> getGetAskOffersMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.AskRequest, rs.raf.pds.v5.z2.gRPC.OrderList> getGetAskOffersMethod;
    if ((getGetAskOffersMethod = StockExchangeServiceGrpc.getGetAskOffersMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetAskOffersMethod = StockExchangeServiceGrpc.getGetAskOffersMethod) == null) {
          StockExchangeServiceGrpc.getGetAskOffersMethod = getGetAskOffersMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.AskRequest, rs.raf.pds.v5.z2.gRPC.OrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAskOffers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.AskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.OrderList.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetAskOffers"))
              .build();
        }
      }
    }
    return getGetAskOffersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.BidRequest,
      rs.raf.pds.v5.z2.gRPC.OrderList> getGetBidOffersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBidOffers",
      requestType = rs.raf.pds.v5.z2.gRPC.BidRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.OrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.BidRequest,
      rs.raf.pds.v5.z2.gRPC.OrderList> getGetBidOffersMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.BidRequest, rs.raf.pds.v5.z2.gRPC.OrderList> getGetBidOffersMethod;
    if ((getGetBidOffersMethod = StockExchangeServiceGrpc.getGetBidOffersMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetBidOffersMethod = StockExchangeServiceGrpc.getGetBidOffersMethod) == null) {
          StockExchangeServiceGrpc.getGetBidOffersMethod = getGetBidOffersMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.BidRequest, rs.raf.pds.v5.z2.gRPC.OrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBidOffers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.BidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.OrderList.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetBidOffers"))
              .build();
        }
      }
    }
    return getGetBidOffersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Client,
      rs.raf.pds.v5.z2.gRPC.RegisterResponse> getRegisterClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterClient",
      requestType = rs.raf.pds.v5.z2.gRPC.Client.class,
      responseType = rs.raf.pds.v5.z2.gRPC.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Client,
      rs.raf.pds.v5.z2.gRPC.RegisterResponse> getRegisterClientMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Client, rs.raf.pds.v5.z2.gRPC.RegisterResponse> getRegisterClientMethod;
    if ((getRegisterClientMethod = StockExchangeServiceGrpc.getRegisterClientMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getRegisterClientMethod = StockExchangeServiceGrpc.getRegisterClientMethod) == null) {
          StockExchangeServiceGrpc.getRegisterClientMethod = getRegisterClientMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.Client, rs.raf.pds.v5.z2.gRPC.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Client.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("RegisterClient"))
              .build();
        }
      }
    }
    return getRegisterClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.SubscriptionRequest,
      rs.raf.pds.v5.z2.gRPC.SubscribeResponse> getAddSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSubscriber",
      requestType = rs.raf.pds.v5.z2.gRPC.SubscriptionRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.SubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.SubscriptionRequest,
      rs.raf.pds.v5.z2.gRPC.SubscribeResponse> getAddSubscriberMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.SubscriptionRequest, rs.raf.pds.v5.z2.gRPC.SubscribeResponse> getAddSubscriberMethod;
    if ((getAddSubscriberMethod = StockExchangeServiceGrpc.getAddSubscriberMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getAddSubscriberMethod = StockExchangeServiceGrpc.getAddSubscriberMethod) == null) {
          StockExchangeServiceGrpc.getAddSubscriberMethod = getAddSubscriberMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.SubscriptionRequest, rs.raf.pds.v5.z2.gRPC.SubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.SubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.SubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("AddSubscriber"))
              .build();
        }
      }
    }
    return getAddSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Order,
      rs.raf.pds.v5.z2.gRPC.OrderResponse> getPlaceOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaceOrder",
      requestType = rs.raf.pds.v5.z2.gRPC.Order.class,
      responseType = rs.raf.pds.v5.z2.gRPC.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Order,
      rs.raf.pds.v5.z2.gRPC.OrderResponse> getPlaceOrderMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Order, rs.raf.pds.v5.z2.gRPC.OrderResponse> getPlaceOrderMethod;
    if ((getPlaceOrderMethod = StockExchangeServiceGrpc.getPlaceOrderMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getPlaceOrderMethod = StockExchangeServiceGrpc.getPlaceOrderMethod) == null) {
          StockExchangeServiceGrpc.getPlaceOrderMethod = getPlaceOrderMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.Order, rs.raf.pds.v5.z2.gRPC.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaceOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Order.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.OrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("PlaceOrder"))
              .build();
        }
      }
    }
    return getPlaceOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.TradesRequest,
      rs.raf.pds.v5.z2.gRPC.OrderList> getGetTradesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrades",
      requestType = rs.raf.pds.v5.z2.gRPC.TradesRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.OrderList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.TradesRequest,
      rs.raf.pds.v5.z2.gRPC.OrderList> getGetTradesMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.TradesRequest, rs.raf.pds.v5.z2.gRPC.OrderList> getGetTradesMethod;
    if ((getGetTradesMethod = StockExchangeServiceGrpc.getGetTradesMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetTradesMethod = StockExchangeServiceGrpc.getGetTradesMethod) == null) {
          StockExchangeServiceGrpc.getGetTradesMethod = getGetTradesMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.TradesRequest, rs.raf.pds.v5.z2.gRPC.OrderList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.TradesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.OrderList.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetTrades"))
              .build();
        }
      }
    }
    return getGetTradesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StockExchangeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceStub>() {
        @java.lang.Override
        public StockExchangeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockExchangeServiceStub(channel, callOptions);
        }
      };
    return StockExchangeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StockExchangeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceBlockingStub>() {
        @java.lang.Override
        public StockExchangeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockExchangeServiceBlockingStub(channel, callOptions);
        }
      };
    return StockExchangeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StockExchangeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceFutureStub>() {
        @java.lang.Override
        public StockExchangeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockExchangeServiceFutureStub(channel, callOptions);
        }
      };
    return StockExchangeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStockData(rs.raf.pds.v5.z2.gRPC.StockRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStockDataMethod(), responseObserver);
    }

    /**
     */
    default void getAllStockData(rs.raf.pds.v5.z2.gRPC.EmptyMessage request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStockDataMethod(), responseObserver);
    }

    /**
     */
    default void getAskOffers(rs.raf.pds.v5.z2.gRPC.AskRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAskOffersMethod(), responseObserver);
    }

    /**
     */
    default void getBidOffers(rs.raf.pds.v5.z2.gRPC.BidRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBidOffersMethod(), responseObserver);
    }

    /**
     */
    default void registerClient(rs.raf.pds.v5.z2.gRPC.Client request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterClientMethod(), responseObserver);
    }

    /**
     */
    default void addSubscriber(rs.raf.pds.v5.z2.gRPC.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.SubscribeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSubscriberMethod(), responseObserver);
    }

    /**
     */
    default void placeOrder(rs.raf.pds.v5.z2.gRPC.Order request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaceOrderMethod(), responseObserver);
    }

    /**
     */
    default void getTrades(rs.raf.pds.v5.z2.gRPC.TradesRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTradesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StockExchangeService.
   */
  public static abstract class StockExchangeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StockExchangeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StockExchangeService.
   */
  public static final class StockExchangeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StockExchangeServiceStub> {
    private StockExchangeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockExchangeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockExchangeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStockData(rs.raf.pds.v5.z2.gRPC.StockRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStockDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllStockData(rs.raf.pds.v5.z2.gRPC.EmptyMessage request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllStockDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAskOffers(rs.raf.pds.v5.z2.gRPC.AskRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAskOffersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBidOffers(rs.raf.pds.v5.z2.gRPC.BidRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBidOffersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerClient(rs.raf.pds.v5.z2.gRPC.Client request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSubscriber(rs.raf.pds.v5.z2.gRPC.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.SubscribeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void placeOrder(rs.raf.pds.v5.z2.gRPC.Order request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTrades(rs.raf.pds.v5.z2.gRPC.TradesRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTradesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StockExchangeService.
   */
  public static final class StockExchangeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StockExchangeServiceBlockingStub> {
    private StockExchangeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockExchangeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockExchangeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.StockData getStockData(rs.raf.pds.v5.z2.gRPC.StockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStockDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<rs.raf.pds.v5.z2.gRPC.StockData> getAllStockData(
        rs.raf.pds.v5.z2.gRPC.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllStockDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.OrderList getAskOffers(rs.raf.pds.v5.z2.gRPC.AskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAskOffersMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.OrderList getBidOffers(rs.raf.pds.v5.z2.gRPC.BidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBidOffersMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.RegisterResponse registerClient(rs.raf.pds.v5.z2.gRPC.Client request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.SubscribeResponse addSubscriber(rs.raf.pds.v5.z2.gRPC.SubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSubscriberMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.OrderResponse placeOrder(rs.raf.pds.v5.z2.gRPC.Order request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaceOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.OrderList getTrades(rs.raf.pds.v5.z2.gRPC.TradesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTradesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StockExchangeService.
   */
  public static final class StockExchangeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StockExchangeServiceFutureStub> {
    private StockExchangeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockExchangeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockExchangeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.StockData> getStockData(
        rs.raf.pds.v5.z2.gRPC.StockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStockDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.OrderList> getAskOffers(
        rs.raf.pds.v5.z2.gRPC.AskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAskOffersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.OrderList> getBidOffers(
        rs.raf.pds.v5.z2.gRPC.BidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBidOffersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.RegisterResponse> registerClient(
        rs.raf.pds.v5.z2.gRPC.Client request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.SubscribeResponse> addSubscriber(
        rs.raf.pds.v5.z2.gRPC.SubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSubscriberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.OrderResponse> placeOrder(
        rs.raf.pds.v5.z2.gRPC.Order request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.OrderList> getTrades(
        rs.raf.pds.v5.z2.gRPC.TradesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTradesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STOCK_DATA = 0;
  private static final int METHODID_GET_ALL_STOCK_DATA = 1;
  private static final int METHODID_GET_ASK_OFFERS = 2;
  private static final int METHODID_GET_BID_OFFERS = 3;
  private static final int METHODID_REGISTER_CLIENT = 4;
  private static final int METHODID_ADD_SUBSCRIBER = 5;
  private static final int METHODID_PLACE_ORDER = 6;
  private static final int METHODID_GET_TRADES = 7;

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
        case METHODID_GET_STOCK_DATA:
          serviceImpl.getStockData((rs.raf.pds.v5.z2.gRPC.StockRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockData>) responseObserver);
          break;
        case METHODID_GET_ALL_STOCK_DATA:
          serviceImpl.getAllStockData((rs.raf.pds.v5.z2.gRPC.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockData>) responseObserver);
          break;
        case METHODID_GET_ASK_OFFERS:
          serviceImpl.getAskOffers((rs.raf.pds.v5.z2.gRPC.AskRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderList>) responseObserver);
          break;
        case METHODID_GET_BID_OFFERS:
          serviceImpl.getBidOffers((rs.raf.pds.v5.z2.gRPC.BidRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderList>) responseObserver);
          break;
        case METHODID_REGISTER_CLIENT:
          serviceImpl.registerClient((rs.raf.pds.v5.z2.gRPC.Client) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.RegisterResponse>) responseObserver);
          break;
        case METHODID_ADD_SUBSCRIBER:
          serviceImpl.addSubscriber((rs.raf.pds.v5.z2.gRPC.SubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.SubscribeResponse>) responseObserver);
          break;
        case METHODID_PLACE_ORDER:
          serviceImpl.placeOrder((rs.raf.pds.v5.z2.gRPC.Order) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderResponse>) responseObserver);
          break;
        case METHODID_GET_TRADES:
          serviceImpl.getTrades((rs.raf.pds.v5.z2.gRPC.TradesRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderList>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetStockDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.StockRequest,
              rs.raf.pds.v5.z2.gRPC.StockData>(
                service, METHODID_GET_STOCK_DATA)))
        .addMethod(
          getGetAllStockDataMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.EmptyMessage,
              rs.raf.pds.v5.z2.gRPC.StockData>(
                service, METHODID_GET_ALL_STOCK_DATA)))
        .addMethod(
          getGetAskOffersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.AskRequest,
              rs.raf.pds.v5.z2.gRPC.OrderList>(
                service, METHODID_GET_ASK_OFFERS)))
        .addMethod(
          getGetBidOffersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.BidRequest,
              rs.raf.pds.v5.z2.gRPC.OrderList>(
                service, METHODID_GET_BID_OFFERS)))
        .addMethod(
          getRegisterClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.Client,
              rs.raf.pds.v5.z2.gRPC.RegisterResponse>(
                service, METHODID_REGISTER_CLIENT)))
        .addMethod(
          getAddSubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.SubscriptionRequest,
              rs.raf.pds.v5.z2.gRPC.SubscribeResponse>(
                service, METHODID_ADD_SUBSCRIBER)))
        .addMethod(
          getPlaceOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.Order,
              rs.raf.pds.v5.z2.gRPC.OrderResponse>(
                service, METHODID_PLACE_ORDER)))
        .addMethod(
          getGetTradesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.TradesRequest,
              rs.raf.pds.v5.z2.gRPC.OrderList>(
                service, METHODID_GET_TRADES)))
        .build();
  }

  private static abstract class StockExchangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StockExchangeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rs.raf.pds.v5.z2.gRPC.StudentService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StockExchangeService");
    }
  }

  private static final class StockExchangeServiceFileDescriptorSupplier
      extends StockExchangeServiceBaseDescriptorSupplier {
    StockExchangeServiceFileDescriptorSupplier() {}
  }

  private static final class StockExchangeServiceMethodDescriptorSupplier
      extends StockExchangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StockExchangeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StockExchangeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StockExchangeServiceFileDescriptorSupplier())
              .addMethod(getGetStockDataMethod())
              .addMethod(getGetAllStockDataMethod())
              .addMethod(getGetAskOffersMethod())
              .addMethod(getGetBidOffersMethod())
              .addMethod(getRegisterClientMethod())
              .addMethod(getAddSubscriberMethod())
              .addMethod(getPlaceOrderMethod())
              .addMethod(getGetTradesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

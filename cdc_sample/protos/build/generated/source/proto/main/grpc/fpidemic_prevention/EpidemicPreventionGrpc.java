package fpidemic_prevention;

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
 * <pre>
 *              旅客相关                   
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.2)",
    comments = "Source: service.proto")
public final class EpidemicPreventionGrpc {

  private EpidemicPreventionGrpc() {}

  public static final String SERVICE_NAME = "fpidemic_prevention.EpidemicPrevention";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<fpidemic_prevention.PassengerOuterClass.GetPassengerReq,
      fpidemic_prevention.PassengerOuterClass.GetPassengerRsp> getGetPassengerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPassenger",
      requestType = fpidemic_prevention.PassengerOuterClass.GetPassengerReq.class,
      responseType = fpidemic_prevention.PassengerOuterClass.GetPassengerRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fpidemic_prevention.PassengerOuterClass.GetPassengerReq,
      fpidemic_prevention.PassengerOuterClass.GetPassengerRsp> getGetPassengerMethod() {
    io.grpc.MethodDescriptor<fpidemic_prevention.PassengerOuterClass.GetPassengerReq, fpidemic_prevention.PassengerOuterClass.GetPassengerRsp> getGetPassengerMethod;
    if ((getGetPassengerMethod = EpidemicPreventionGrpc.getGetPassengerMethod) == null) {
      synchronized (EpidemicPreventionGrpc.class) {
        if ((getGetPassengerMethod = EpidemicPreventionGrpc.getGetPassengerMethod) == null) {
          EpidemicPreventionGrpc.getGetPassengerMethod = getGetPassengerMethod =
              io.grpc.MethodDescriptor.<fpidemic_prevention.PassengerOuterClass.GetPassengerReq, fpidemic_prevention.PassengerOuterClass.GetPassengerRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPassenger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpidemic_prevention.PassengerOuterClass.GetPassengerReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpidemic_prevention.PassengerOuterClass.GetPassengerRsp.getDefaultInstance()))
              .setSchemaDescriptor(new EpidemicPreventionMethodDescriptorSupplier("GetPassenger"))
              .build();
        }
      }
    }
    return getGetPassengerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq,
      fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp> getGetPassengerPrivacyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPassengerPrivacy",
      requestType = fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq.class,
      responseType = fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq,
      fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp> getGetPassengerPrivacyMethod() {
    io.grpc.MethodDescriptor<fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq, fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp> getGetPassengerPrivacyMethod;
    if ((getGetPassengerPrivacyMethod = EpidemicPreventionGrpc.getGetPassengerPrivacyMethod) == null) {
      synchronized (EpidemicPreventionGrpc.class) {
        if ((getGetPassengerPrivacyMethod = EpidemicPreventionGrpc.getGetPassengerPrivacyMethod) == null) {
          EpidemicPreventionGrpc.getGetPassengerPrivacyMethod = getGetPassengerPrivacyMethod =
              io.grpc.MethodDescriptor.<fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq, fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPassengerPrivacy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp.getDefaultInstance()))
              .setSchemaDescriptor(new EpidemicPreventionMethodDescriptorSupplier("GetPassengerPrivacy"))
              .build();
        }
      }
    }
    return getGetPassengerPrivacyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fpidemic_prevention.Report.SyncReportDataReq,
      fpidemic_prevention.Common.RspHead> getSyncReportDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncReportData",
      requestType = fpidemic_prevention.Report.SyncReportDataReq.class,
      responseType = fpidemic_prevention.Common.RspHead.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fpidemic_prevention.Report.SyncReportDataReq,
      fpidemic_prevention.Common.RspHead> getSyncReportDataMethod() {
    io.grpc.MethodDescriptor<fpidemic_prevention.Report.SyncReportDataReq, fpidemic_prevention.Common.RspHead> getSyncReportDataMethod;
    if ((getSyncReportDataMethod = EpidemicPreventionGrpc.getSyncReportDataMethod) == null) {
      synchronized (EpidemicPreventionGrpc.class) {
        if ((getSyncReportDataMethod = EpidemicPreventionGrpc.getSyncReportDataMethod) == null) {
          EpidemicPreventionGrpc.getSyncReportDataMethod = getSyncReportDataMethod =
              io.grpc.MethodDescriptor.<fpidemic_prevention.Report.SyncReportDataReq, fpidemic_prevention.Common.RspHead>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncReportData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpidemic_prevention.Report.SyncReportDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpidemic_prevention.Common.RspHead.getDefaultInstance()))
              .setSchemaDescriptor(new EpidemicPreventionMethodDescriptorSupplier("SyncReportData"))
              .build();
        }
      }
    }
    return getSyncReportDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EpidemicPreventionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EpidemicPreventionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EpidemicPreventionStub>() {
        @java.lang.Override
        public EpidemicPreventionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EpidemicPreventionStub(channel, callOptions);
        }
      };
    return EpidemicPreventionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EpidemicPreventionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EpidemicPreventionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EpidemicPreventionBlockingStub>() {
        @java.lang.Override
        public EpidemicPreventionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EpidemicPreventionBlockingStub(channel, callOptions);
        }
      };
    return EpidemicPreventionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EpidemicPreventionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EpidemicPreventionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EpidemicPreventionFutureStub>() {
        @java.lang.Override
        public EpidemicPreventionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EpidemicPreventionFutureStub(channel, callOptions);
        }
      };
    return EpidemicPreventionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *              旅客相关                   
   * </pre>
   */
  public static abstract class EpidemicPreventionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取用户信息
     * </pre>
     */
    public void getPassenger(fpidemic_prevention.PassengerOuterClass.GetPassengerReq request,
        io.grpc.stub.StreamObserver<fpidemic_prevention.PassengerOuterClass.GetPassengerRsp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPassengerMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取用户的隐私信息
     * </pre>
     */
    public void getPassengerPrivacy(fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq request,
        io.grpc.stub.StreamObserver<fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPassengerPrivacyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 同步用户上报信息
     * </pre>
     */
    public void syncReportData(fpidemic_prevention.Report.SyncReportDataReq request,
        io.grpc.stub.StreamObserver<fpidemic_prevention.Common.RspHead> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncReportDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPassengerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fpidemic_prevention.PassengerOuterClass.GetPassengerReq,
                fpidemic_prevention.PassengerOuterClass.GetPassengerRsp>(
                  this, METHODID_GET_PASSENGER)))
          .addMethod(
            getGetPassengerPrivacyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq,
                fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp>(
                  this, METHODID_GET_PASSENGER_PRIVACY)))
          .addMethod(
            getSyncReportDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fpidemic_prevention.Report.SyncReportDataReq,
                fpidemic_prevention.Common.RspHead>(
                  this, METHODID_SYNC_REPORT_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   *              旅客相关                   
   * </pre>
   */
  public static final class EpidemicPreventionStub extends io.grpc.stub.AbstractAsyncStub<EpidemicPreventionStub> {
    private EpidemicPreventionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EpidemicPreventionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EpidemicPreventionStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取用户信息
     * </pre>
     */
    public void getPassenger(fpidemic_prevention.PassengerOuterClass.GetPassengerReq request,
        io.grpc.stub.StreamObserver<fpidemic_prevention.PassengerOuterClass.GetPassengerRsp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPassengerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取用户的隐私信息
     * </pre>
     */
    public void getPassengerPrivacy(fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq request,
        io.grpc.stub.StreamObserver<fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPassengerPrivacyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 同步用户上报信息
     * </pre>
     */
    public void syncReportData(fpidemic_prevention.Report.SyncReportDataReq request,
        io.grpc.stub.StreamObserver<fpidemic_prevention.Common.RspHead> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncReportDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *              旅客相关                   
   * </pre>
   */
  public static final class EpidemicPreventionBlockingStub extends io.grpc.stub.AbstractBlockingStub<EpidemicPreventionBlockingStub> {
    private EpidemicPreventionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EpidemicPreventionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EpidemicPreventionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取用户信息
     * </pre>
     */
    public fpidemic_prevention.PassengerOuterClass.GetPassengerRsp getPassenger(fpidemic_prevention.PassengerOuterClass.GetPassengerReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPassengerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取用户的隐私信息
     * </pre>
     */
    public fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp getPassengerPrivacy(fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPassengerPrivacyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 同步用户上报信息
     * </pre>
     */
    public fpidemic_prevention.Common.RspHead syncReportData(fpidemic_prevention.Report.SyncReportDataReq request) {
      return blockingUnaryCall(
          getChannel(), getSyncReportDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *              旅客相关                   
   * </pre>
   */
  public static final class EpidemicPreventionFutureStub extends io.grpc.stub.AbstractFutureStub<EpidemicPreventionFutureStub> {
    private EpidemicPreventionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EpidemicPreventionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EpidemicPreventionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取用户信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<fpidemic_prevention.PassengerOuterClass.GetPassengerRsp> getPassenger(
        fpidemic_prevention.PassengerOuterClass.GetPassengerReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPassengerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取用户的隐私信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp> getPassengerPrivacy(
        fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPassengerPrivacyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 同步用户上报信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<fpidemic_prevention.Common.RspHead> syncReportData(
        fpidemic_prevention.Report.SyncReportDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncReportDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PASSENGER = 0;
  private static final int METHODID_GET_PASSENGER_PRIVACY = 1;
  private static final int METHODID_SYNC_REPORT_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EpidemicPreventionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EpidemicPreventionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PASSENGER:
          serviceImpl.getPassenger((fpidemic_prevention.PassengerOuterClass.GetPassengerReq) request,
              (io.grpc.stub.StreamObserver<fpidemic_prevention.PassengerOuterClass.GetPassengerRsp>) responseObserver);
          break;
        case METHODID_GET_PASSENGER_PRIVACY:
          serviceImpl.getPassengerPrivacy((fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyReq) request,
              (io.grpc.stub.StreamObserver<fpidemic_prevention.PassengerOuterClass.GetPassengerPrivacyRsp>) responseObserver);
          break;
        case METHODID_SYNC_REPORT_DATA:
          serviceImpl.syncReportData((fpidemic_prevention.Report.SyncReportDataReq) request,
              (io.grpc.stub.StreamObserver<fpidemic_prevention.Common.RspHead>) responseObserver);
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

  private static abstract class EpidemicPreventionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EpidemicPreventionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return fpidemic_prevention.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EpidemicPrevention");
    }
  }

  private static final class EpidemicPreventionFileDescriptorSupplier
      extends EpidemicPreventionBaseDescriptorSupplier {
    EpidemicPreventionFileDescriptorSupplier() {}
  }

  private static final class EpidemicPreventionMethodDescriptorSupplier
      extends EpidemicPreventionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EpidemicPreventionMethodDescriptorSupplier(String methodName) {
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
      synchronized (EpidemicPreventionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EpidemicPreventionFileDescriptorSupplier())
              .addMethod(getGetPassengerMethod())
              .addMethod(getGetPassengerPrivacyMethod())
              .addMethod(getSyncReportDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}

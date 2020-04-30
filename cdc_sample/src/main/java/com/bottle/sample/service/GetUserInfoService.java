package com.bottle.sample.service;

import fpidemic_prevention.EpidemicPreventionGrpc;
import fpidemic_prevention.PassengerOuterClass;
import fpidemic_prevention.Report;
import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GetUserInfoService {
    @Value("${grpc.client.api.host}")
    private String host;
    @Value("${grpc.client.api.port}")
    private String port;
    @Value("${grpc.client.api.staffId}")
    private String staffId;

    public Map<String, Object> getUserInfo(String personKey){
        int port= Integer.parseInt(this.port);
        Map<String, Object> info=new HashMap<>();
        //io.grpc.Channel
                ManagedChannel channel = NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT).build();
        fpidemic_prevention.Common.ReqHead reqHead=fpidemic_prevention.Common.ReqHead.newBuilder().setStaffId(staffId).build();
        PassengerOuterClass.GetPassengerPrivacyReq req=PassengerOuterClass.GetPassengerPrivacyReq.newBuilder().setHead(reqHead).setPersonKey(personKey).build();

        PassengerOuterClass.GetPassengerPrivacyRsp rsp=EpidemicPreventionGrpc.newBlockingStub(channel).getPassengerPrivacy(req);
        String itp="";
        switch (rsp.getInfo().getIdTypeValue()) {
            case 1:itp = "居民身份证"; break;
            case 2:itp = "港澳居民往来内地通行证"; break;
            case 3:itp = "台湾居民来往大陆通行证"; break;
            case 4:itp = "护照"; break;
            case 5:itp = "临时身份证"; break;
            case 6:itp = "军官证"; break;
            case 7:itp = "其他"; break;
        }
        info.put("userId",rsp.getInfo().getPersonKey());
        info.put("username",rsp.getInfo().getName());
        info.put("identityType",itp);
        info.put("identity",rsp.getInfo().getIdNo());
        info.put("birthday",rsp.getInfo().getBirthday());
        info.put("gender",rsp.getInfo().getSex());
        info.put("phone",rsp.getInfo().getPhone());
        info.put("oid",rsp.getInfo().getOid());
        info.put("id",rsp.getInfo().getId());
        info.put("address",rsp.getInfo().getAddress());
        channel.shutdown();
        return info;
    }

    //同步
    public boolean synUser(Map<String, Object> reportparam){
        try {

            int port = Integer.parseInt(this.port);
            Map<String, Object> info = new HashMap<>();
            //io.grpc.Channel
            ManagedChannel channel = NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT).build();
            fpidemic_prevention.Common.ReqHead reqHead = fpidemic_prevention.Common.ReqHead.newBuilder().setStaffId(staffId).build();
            Report.ReportInfo reportInfo = Report.ReportInfo.newBuilder().setPersonKey((String) reportparam.get("personkey"))
                    .setIdentity((String) reportparam.get("identity"))
                    .setIdentityType(Integer.parseInt((String)reportparam.get("identityType")))
                    .setBirthday((String) reportparam.get("birthday"))
                    .setGender((String) reportparam.get("gender"))
                    .setPhone((String) reportparam.get("phone"))
                    .setUsername((String) reportparam.get("username")).build();


            Report.SyncReportDataReq sy = Report.SyncReportDataReq.newBuilder().setHead(reqHead).setReportInfo(reportInfo).build();


            EpidemicPreventionGrpc.newBlockingStub(channel).syncReportData(sy);
            channel.shutdown();
        }catch (Exception e){
            e.printStackTrace();
            return false;}
        return true;
    }
}

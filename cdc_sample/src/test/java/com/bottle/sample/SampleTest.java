package com.bottle.sample;

import com.alibaba.fastjson.JSON;
import com.bottle.sample.common.util.AESECBUtil;
import com.bottle.sample.common.util.HttpUtil;
import com.bottle.sample.common.util.SecurityCore;
import com.bottle.sample.service.GetUserInfoService;
import com.bottle.sample.vo.TSampleInfoListReq;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.Map;
import java.util.zip.CRC32;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SampleTest {

    @Autowired
    private GetUserInfoService getUserInfoService;
//    @Test
//    public void samplePageList(){
//        TSampleInfoListReq tSampleInfoListReq=new TSampleInfoListReq();
//        tSampleInfoListReq.setName("");
//        tSampleInfoListReq.setIdentityType(0);
//        tSampleInfoListReq.setIdentity("416494616611");
//        tSampleInfoListReq.setSampleCode("");
//        tSampleInfoListReq.setSampleInstitution("");
//        tSampleInfoListReq.setSampleTime(new Date());
//        tSampleInfoListReq.setSampleType(0);
//        tSampleInfoListReq.setTestResult(0);
//        tSampleInfoListReq.setPageNo(1);
//        tSampleInfoListReq.setPageSize(10);
//        ResponseEntity<String> stringResponseEntity = HttpUtil.httpPost("http://localhost:8812/samplePageList" , JSON.toJSONString(tSampleInfoListReq));
//        String body = stringResponseEntity.getBody();
//        Map<String,Object> map = JSON.parseObject(body);
//        System.out.println(map.toString());
//    }

    @Test
    public void batchUpdNegative(){
        SecurityCore securityCore = SecurityCore.getInstance();
        String s = "ebf491e9ecbb464d9d5c8332b610ac33";
        try {
            String decrypt = securityCore.decrypt(s);
            String pisnyMyZYXuCNcRd = AESECBUtil.decryptData(s, "pisnyMyZYXuCNcRd");
            String pisnyMyZYXuCNcRd1 = AESECBUtil.decryptData(s, "LNFAPQrcPYpuipj2");
            System.out.println(decrypt);
            System.out.println(pisnyMyZYXuCNcRd);
            System.out.println(pisnyMyZYXuCNcRd1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateSample(){
        Map<String, Object> userInfo = getUserInfoService.getUserInfo("0ZZ46A9VGZobZyzDbhPeHp9D87eDALEUB3LEJzRX21IGZXSF6W2XaMX5ZNvCtZr2");
        Object userId = userInfo.get("userId");
        try {
            String personkey = AESECBUtil.decryptData(userId.toString(), "pisnyMyZYXuCNcRd");
            personkey = AESECBUtil.decryptData(personkey, "LNFAPQrcPYpuipj2");
            System.out.println(personkey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(userInfo.toString());
    }

    @Test
    public void sampleDetails(){
        CRC32 c = new CRC32();
        c.update("420322199511182138".getBytes());
        long a=c.getValue()>> 16 & 0x7fff;
        a=a%100;
        System.out.println(a);

    }
}

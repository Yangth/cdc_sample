package com.bottle.sample.common.util;







import javax.crypto.Cipher;


import javax.crypto.spec.SecretKeySpec;



import java.util.Base64;



/**

 * AES加解密

 *

 * Created by yyh on 2015/10/9.

 */


public class AESECBUtil {



    /**

     * 密钥算法

     */

    private static final String ALGORITHM = "AES";

    /**

     * 加解密算法/工作模式/填充方式

     */

    private static final String ALGORITHM_STR = "AES/ECB/PKCS5Padding";



    public static String webSafeBase64StringEncoding(byte[] sSrc,boolean padded) throws Exception {
        String encodeString=Base64.getEncoder().encodeToString(sSrc);// 此处使用BASE64做转码。

        //websafe base64
        encodeString=encodeString.replace("+","-");
        encodeString=encodeString.replace("/","_");
        //nopadding base64
//        if (!padded) {
//            if (encodeString.endsWith("=")) {
//                encodeString = encodeString.substring(0, encodeString.length() - 1);
//                if (encodeString.endsWith("=")) {
//                    encodeString = encodeString.substring(0, encodeString.length() - 1);
//                }
//            }
//        }
        return encodeString;
    }
    public static byte[] webSafeBase64StringDecoding(String sSrc) throws Exception {        //websafe base64
        sSrc=sSrc.replace("-","+");
        sSrc=sSrc.replace("_","/");
        return Base64.getDecoder().decode(sSrc);
    }

    /**

     * AES加密

     * @param

     * @return

     * @throws Exception

     */
    public static byte[] AES128ECBStringEncoding(String encData ,String secretKey) throws Exception {


        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        byte[] raw = secretKey.getBytes();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(encData.getBytes("utf-8"));
        return encrypted;
    }

    public static String encryptData(String data,String key) throws Exception {

        try {
            String encodeString=webSafeBase64StringEncoding(AES128ECBStringEncoding(data,key),false);
            return encodeString;
        } catch (Exception ex) {
            return null;
        }

    }



    /**

     * AES解密

     * @param

     * @return

     * @throws Exception

     */
    public static String AES128ECBStringDecoding(byte[] sSrc,String key) throws Exception {
        try {


            byte[] raw = key.getBytes("ASCII");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] original = cipher.doFinal(sSrc);
            String originalString = new String(original, "utf-8");
            return originalString;
        } catch (Exception ex) {
            return null;
        }
    }
    public static String decryptData(String base64Data,String key) throws Exception{


         try {
            String decodeString= AES128ECBStringDecoding(webSafeBase64StringDecoding(base64Data),key);
            return decodeString;
        } catch (Exception ex) {
             return null;
        }

    }



    /**

     * hex字符串 转 byte数组

     * @param s

     * @return

     */

    private static byte[] hex2byte(String s) {

        if (s.length() % 2 == 0) {

            return hex2byte (s.getBytes(), 0, s.length() >> 1);

        } else {

            return hex2byte("0"+s);

        }

    }



    private static byte[] hex2byte (byte[] b, int offset, int len) {

        byte[] d = new byte[len];

        for (int i=0; i<len*2; i++) {

            int shift = i%2 == 1 ? 0 : 4;

            d[i>>1] |= Character.digit((char) b[offset+i], 16) << shift;

        }

        return d;

    }



//    public static void main(String[] args) throws Exception {
//        String s="1++"+"431127199602183498";
//
//     System.out.println(s=AESECBUtil.encryptData(s,"LNFAPQrcPYpuipj2"));
//     System.out.println(s=AESECBUtil.encryptData(s,"pisnyMyZYXuCNcRd"));
//     System.out.println(s=AESECBUtil.decryptData(s,"pisnyMyZYXuCNcRd"));
//     System.out.println(AESECBUtil.decryptData(s,"LNFAPQrcPYpuipj2"));
//
//     System.out.println(AESECBUtil.decryptData("Lq_4329tVkfOfOGwyu03RD8bNllJM5ywLaLW9jvrGo01US8TVvEzoWrWY5ld8wTi","pisnyMyZYXuCNcRd"));
//     System.out.println(AESECBUtil.decryptData("vFtZppUyqZrLcfstt9604RRLCMGm6_4h4EPbMnOUo0I=","LNFAPQrcPYpuipj2"));
//
//    }


}

package com.jw.utils;

import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * Created by Pang fei on 2015/11/23.
 */
public class AesUtils {
    /**
     * AES加密为base 64 code
     * @param content 待加密的内容
     * @param "1234567" 加密密钥
     * @return 加密后的base 64 code
     * @throws Exception
     */
    public static String  aesEncrypt(String content,String key){
        String str="";
        try {
            str= base64Encode(aesEncryptToBytes(content,key));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
    /**
     * base 64 encode
     * @param bytes 待编码的byte[]
     * @return 编码后的base 64 code
     */
    public static String  base64Encode(byte[] bytes){
        return new BASE64Encoder().encode(bytes);
    }
    /**
     * AES加密
     * @param content 待加密的内容
     * @param "1234567" 加密密钥
     * @return 加密后的byte[]
     * @throws Exception
     */
    public  static byte[] aesEncryptToBytes(String content,String key) throws Exception {
        //返回一个指定的算法生成密钥 ->KeyGenerator对象。
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        //根据秘钥"1234567"生成一个密码强随机数字生成器，和指的 128得长度初始化秘钥kgen
        kgen.init(128, new SecureRandom(key.getBytes()));
        //通过指定的转换返回一个密码对象。
        Cipher cipher = Cipher.getInstance("AES");
        //根据一个key 初始化密码对象
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));
        //加密或解密在一个单独部分操作的数据,或者完成一个系列的操作的数据。
        return cipher.doFinal(content.getBytes("utf-8"));
      /*  KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128, new SecureRandom("1234567".getBytes()));

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));

        return cipher.doFinal(content.getBytes("gbk"));*/
    }
}

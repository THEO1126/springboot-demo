package cn.edu.guet.springbootdemo;

/**
 * @Author 李冰冰
 * @Date 2023/02/14
 * @Version 17.0.5
 */

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

/**
 * 登陆密码加密
 */

@Slf4j
public class AesUtil {

    private static final String ALGORITHMS = "AES/ECB/PKCS5Padding";

    /**
     * 加密
     *
     * @param content 内容
     * @param key     key
     * @return java.lang.String
     */
    public static String encrypt(String content, String key) {
        try {
            //获得密码的字节数组
            byte[] raw = key.getBytes();
            //根据密码生成AES密钥
            SecretKeySpec skey = new SecretKeySpec(raw, "AES");
            //根据指定算法ALGORITHM自成密码器
            Cipher cipher = Cipher.getInstance(ALGORITHMS);
            //初始化密码器，第一个参数为加密(ENCRYPT_MODE)或者解密(DECRYPT_MODE)操作，第二个参数为生成的AES密钥
            cipher.init(Cipher.ENCRYPT_MODE, skey);
            //获取加密内容的字节数组(设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
            byte[] byteContent = content.getBytes(StandardCharsets.UTF_8);
            //密码器加密数据
            byte[] encodeContent = cipher.doFinal(byteContent);
            //将加密后的数据转换为字符串返回
            return Base64.encodeBase64String(encodeContent);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解密
     *
     * @param encryptStr 加密后的内容
     * @param decryptKey 解密key
     * @return java.lang.String
     */
    public static String decrypt(String encryptStr, String decryptKey) {
        try {
            //获得密码的字节数组
            byte[] raw = decryptKey.getBytes();
            //根据密码生成AES密钥
            SecretKeySpec skey = new SecretKeySpec(raw, "AES");
            //根据指定算法ALGORITHM自成密码器
            Cipher cipher = Cipher.getInstance(ALGORITHMS);
            //初始化密码器，第一个参数为加密(ENCRYPT_MODE)或者解密(DECRYPT_MODE)操作，第二个参数为生成的AES密钥
            cipher.init(Cipher.DECRYPT_MODE, skey);
            //把密文字符串转回密文字节数组
            byte[] encodeContent = Base64.decodeBase64(encryptStr);
            //密码器解密数据
            byte[] byteContent = cipher.doFinal(encodeContent);
            //将解密后的数据转换为字符串返回
            return new String(byteContent, StandardCharsets.UTF_8);
        } catch (Exception e) {
            log.error("String : {} aes decrypt error", encryptStr);
            return null;
        }
    }

    public static void main(String[] args) {
        AesUtil aesUtil =new AesUtil();

        System.out.println(aesUtil.encrypt("123456","1234123412341234"));
        System.out.println(aesUtil.decrypt("mrovLsuaNQjjwMcDRukeDQ==","1234123412341234"));
    }
}


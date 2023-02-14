package cn.edu.guet.springbootdemo.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.util.Random;

/**
 * @Author 李冰冰
 * @Date 2023/02/14
 * @Version 17.0.5
 * MD5 实现登入加密
 */

public class MD5Utils {
    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
            "e", "f"};

    private final static String MD5 = "MD5";
    private final static String SHA = "SHA";

    private Object salt;
    private String algorithm;

    //  生成随机盐
    public static String getRandomSalt(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 20; i++){
            String aChar = hexDigits[new Random().nextInt(hexDigits.length)];
            sb.append(aChar);
        }
        return sb.toString();
    }

    public MD5Utils(Object salt) {
        this(salt, MD5);
    }

    public MD5Utils(Object salt, String algorithm) {
        this.salt = salt;
        this.algorithm = algorithm;
    }

    /**
     * 密码加密
     *
     * @param rawPass
     * @return
     */
    public String encode(String rawPass) {
        String result = null;
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            // 加密后的字符串
            result = byteArrayToHexString(md.digest(mergePasswordAndSalt(rawPass).getBytes("utf-8")));
        } catch (Exception ex) {
        }
        return result;
    }

    /**
     * 密码匹配验证
     *
     * @param encPass 密文
     * @param rawPass 明文
     * @return
     */
    public boolean matches(String encPass, String rawPass) {
        String pass1 = "" + encPass;
        String pass2 = encode(rawPass);
        return pass1.equals(pass2);
    }

    /**
     * MD5加密之方法一
     *
     * @param str 待加密字符串
     * @return 16进制加密字符串
     * @explain 借助apache工具类DigestUtils实现
     */
    public static String encryptToMD5(String str) {
        return DigestUtils.md5Hex(str);
    }

    private String mergePasswordAndSalt(String password) {
        if (password == null) {
            password = "";
        }
        if ((salt == null) || "".equals(salt)) {
            return password;
        } else {
            return password + "{" + salt.toString() + "}";
        }
    }

    /**
     * 转换字节数组为16进制字串
     *
     * @param b 字节数组
     * @return 16进制字串
     */
    private String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    /**
     * 将字节转换为16进制
     *
     * @param b
     * @return
     */
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    public static void main(String[] args) {

        //  使用了加密盐的MD5码
        String salt="672dee439511fe73c900";
        MD5Utils encoderMd5 = new MD5Utils(salt);
        String rawPass="123456";

        String encPass= encoderMd5.encode(rawPass);

        System.out.println("密文:"+encPass);

        System.out.println(encoderMd5.matches(encPass,rawPass));

    }
}

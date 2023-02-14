package cn.edu.guet.springbootdemo;

/**
 * @Author 李冰冰
 * @Date 2023/02/14
 * @Version 17.0.5
 */

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;

public class MD5Utils {

    //  生成随机盐
    public static String getSalt(int n){
        char[] chars = ("abcdef1234567890").toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 20; i++){
            char aChar = chars[new Random().nextInt(chars.length)];
            sb.append(aChar);
        }
        return sb.toString();
    }

    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    private static final String salt = "53caae756e414182914a";

    public static String inputPassToFormPass(String inputPass) {
        String str=""+salt.charAt(0)+salt.charAt(2) + inputPass +salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    public static String formPassToDBPass(String formPass, String salt) {
        String str = ""+salt.charAt(0)+salt.charAt(2) + formPass +salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    public static String inputPassToDbPass(String inputPass, String saltDB) {
        String formPass = inputPassToFormPass(inputPass);
        String dbPass = formPassToDBPass(formPass, saltDB);
        return dbPass;
    }
    //编写主类进行测试
    public static void main(String args[]) {
        String s = "123456";
        System.out.println("原始：" + s);

        String salt=MD5Utils.getSalt(20);
        System.out.println("盐:"+salt);

        System.out.println("加密后："+MD5Utils.inputPassToDbPass(s,salt));

    }
}

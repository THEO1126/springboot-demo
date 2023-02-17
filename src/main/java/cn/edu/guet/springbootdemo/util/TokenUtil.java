package cn.edu.guet.springbootdemo.util;

/**
 * @Author 李冰冰
 * @Date 2023/02/15
 * @Version 17.0.5
 * token生成工具类
 */

import cn.edu.guet.springbootdemo.bean.LoginVo;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TokenUtil {

    private static final long EXPIRE_TIME= 1000*60*60*24;   // 以毫秒为单位  一天
    private static final String TOKEN_SECRET="txdy";  //密钥盐

    /**
     * 签名生成
     * @param loginVo
     * @return
     */
    public static String sign(LoginVo loginVo){
        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("username", loginVo.getUsername())
                    .withExpiresAt(expiresAt)
                    // 使用了HMAC256加密算法。
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (Exception e){
            e.printStackTrace();
        }
        return token;
    }

    /**
     * 签名验证
     * @param token
     * @return
     */
    public static boolean verify(String token){
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println("token 认证通过 ！");
            System.out.println("username: " + jwt.getClaim("username").asString());
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("过期时间:" + f.format(jwt.getExpiresAt()));
            return true;
        } catch (Exception e){
            System.out.println("认证失败 ！token 过期或失效");
            return false;
        }
    }
}

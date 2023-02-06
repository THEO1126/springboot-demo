package cn.edu.guet.springbootdemo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Author 李冰冰
 * @Date 2023/02/05
 * @Version 17.0.5
 *
 *  数据库的时间格式化工具类
 */

public class DateUtil {
    SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy, h:m:s aa", Locale.ENGLISH); // 原始的格式
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 要转成的格式
    public String format(){
        Date date=null;
        try {
            date = dateFormat.parse("Sep 1, 2021, 6:07:52 PM");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sdf.format(date);
    }
}

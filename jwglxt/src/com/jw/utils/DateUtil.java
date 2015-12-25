package com.jw.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * Created by 53803 on 2015/8/24.
 */
public class DateUtil {
    //按指定格式将字符串转成日期
    public static Date stringToDate2(String s) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.parse(s);
    }

    //将字符串转换成完整的日期
    public static Date stringToFullDate(String s) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(s);
    }

    //将字符串转成日期格式
    public static Date stringToDate(String s) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.parse(s);
    }
    //将字符串转成完整日期格式
    public static Date stringToFullDateformat(String s) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(s);
    }
    //将日期格式转成字符串
    public static String dateToString(Date date) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(date);
    }
    //将完整日期格式转成字符串
    public static String dateToFullString(Date date) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        return sdf.format(date);
    }
    //将完整日期格式转成字符串
    public static String dateToFullString2(Date date) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * 日期格式转成字符串
     * @param date
     * @param pattern
     * @return
     * @throws Exception
     */
    public static String dateToString(Date date,String pattern) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 时间相减
     * @param d1
     * @param d2
     * @return
     */
    public static Date dateDiff(Date d1,Date d2){
        Date d = new Date(0);
        Calendar c = Calendar.getInstance();
        c.setTime(d);

        c.add(Calendar.YEAR, d1.getYear());
        c.add(Calendar.MONTH, d1.getMonth());
        c.add(Calendar.DAY_OF_YEAR, d1.getDate());
        c.add(Calendar.HOUR_OF_DAY, d1.getHours());
        c.add(Calendar.MINUTE,d1.getMinutes());
        c.add(Calendar.SECOND, d1.getSeconds());

        c.add(Calendar.YEAR, 0 - d2.getYear());
        c.add(Calendar.MONTH, 0 - d2.getMonth());
        c.add(Calendar.DAY_OF_YEAR, 0-d2.getDate());
        c.add(Calendar.HOUR_OF_DAY, 0 - d2.getHours());
        c.add(Calendar.MINUTE,0-d2.getMinutes());
        c.add(Calendar.SECOND,0-d2.getSeconds());
        return c.getTime();
    }

    /**
     * 时间转换成时间段
     * @param d
     * @return
     */
    public static String dateToTimeSpan(Date d){
        return (int)Math.floor(d.getTime()/(60*60*1000)) + ":" + d.getMinutes()+":"+ d.getSeconds();
    }

    /**
     * 时间相差的分钟数
     * @param t1
     * @param t2
     * @return
     */
    public static long dateSub(String t1, String t2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        long days;
        long hours = 0;
        long minutes = 0;
        try {
            Date d1 =  sdf.parse(t1);
            Date d2 =  sdf.parse(t2);
            long diff = d2.getTime() - d1.getTime();// 这样得到的差值是微秒级别
            days = diff / (1000 * 60 * 60 * 24);

            hours = (diff - days * (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
            minutes = (diff - days * (1000 * 60 * 60 * 24) - hours
                    * (1000 * 60 * 60))
                    / (1000 * 60);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return hours * 60 + minutes;
    }

    /**
     * 根据日期判断是星期几
     * @param d
     * @return
     */
    public static String getWeekday(Date d){
            String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
            if (w < 0)
                w = 0;
            return weekDays[w];
        }
    public static String dateAddMinutes(String datestr,int minutes) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(datestr);
        Date afterDate = new Date(date.getTime()+minutes*60*1000);
        return sdf.format(afterDate);
    }

}

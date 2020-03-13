package miniprogram.server.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Description: 日期处理类
 * @Author: mashaochuan/马少川
 * @Date: 2017/11/21 9:55
 */
public class DateUtil {

    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);

    /**
     * 获得当前日期
     *
     * @param pattern
     * @return
     */
    public static String getCurrentDate(String pattern) {
        if (null == pattern) {
            return null;
        }
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * 日期转字符串
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String getDate(Date date, String pattern) {
        if (null == date) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 字符串转日期
     *
     * @param str
     * @param pattern
     * @return
     */
    public static Date toDate(String str, String pattern) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.parse(str);
        } catch (Exception e) {
            logger.error("convert string to date error. str=" + str + "; pattern=" + pattern, e);
        }
        return null;
    }

    /**
     * 获取时间
     *
     * @param date
     * @return
     */
    public static Integer getTime(Date date) {
        if (null == date) {
            return null;
        }
        return Integer.parseInt(getDate(date, "HHmm"));
    }

    /**
     * 获取周
     *
     * @param date
     * @return
     */
    public static Integer getWeek(Date date) {
        if (null == date) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_WEEK);
    }


    /**
     * 获取年
     *
     * @return
     */
    public static int getCurrentYear() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR);
    }

    /**
     * 获取月
     *
     * @param date
     * @return int
     */
    public static int getDateMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH);
    }

    /**
     * 获取年
     *
     * @param date
     * @return int
     */
    public static int getDateYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.YEAR);
    }


    /**
     * 判断date是否在time1和time2之间
     *
     * @param date
     * @param time1
     * @param time2
     * @return
     */
    public static boolean isInTimes(Date date, int time1, int time2) {
        int time = Integer.parseInt(getDate(date, "HHmm"));
        return time >= time1 && time <= time2;
    }

    /**
     * 判断date是否在time之后
     *
     * @param date
     * @param time
     * @return
     */
    public static boolean isAfterTime(Date date, int time) {
        return (Integer.parseInt(getDate(date, "HHmm")) - time) >= 0;
    }

    /**
     * 获取date1到date2之间的小时数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int getBetweenHours(Date date1, Date date2) {
        return (int) ((date1.getTime() - date2.getTime()) / (1000 * 60 * 60));
    }


    /**
     * 计算两个时间之间的小时数
     *
     * @param startTime
     * @param endTime
     * @return
     */
    public static float getHours(Date startTime, Date endTime) {
        long hourTimes = 60 * 60 * 1000;//1小时
        long minuteTimes = 60 * 1000;//1分钟
        long times = endTime.getTime() - startTime.getTime();//总时长
        Long hours = times / hourTimes;//小时数
        Long minute = (times - hours * hourTimes) / minuteTimes;//剩余分钟数
        float hour = hours.floatValue();
        if (minute > 0 && minute <= 15) {
            hour += 0.25f;
        } else if (minute > 15 && minute <= 30) {
            hour += 0.5f;
        } else if (minute > 30 && minute <= 45) {
            hour += 0.75f;
        } else if (minute > 45 && minute <= 60) {
            hour += 1f;
        }
        return hour;
    }

    /**
     * 获取某天所在月的最后一天
     *
     * @param date
     * @return java.util.Date
     * @author ningkuilong
     * @date 2018/3/1
     */
    public static Date getLastDayOfMonth(Date date) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate localDate  = date.toInstant().atZone(zoneId).toLocalDate();
        // 获取当前日期所在月的最后一天
        LocalDate firstDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
        // LocalDateTime 转为 将Date
        return Date.from(firstDayOfMonth.atStartOfDay(zoneId).toInstant());
    }

    /**
     * 获取某天所在月的第一天
     *
     * @param date
     * @return java.util.Date
     * @author ningkuilong
     * @date 2018/3/1
     */
    public static Date getFristDayOfMonth(Date date) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate localDate  = date.toInstant().atZone(zoneId).toLocalDate();
        // 获取当前日期所在月的第一天
        LocalDate firstDayOfMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());
        // LocalDateTime 转为 将Date
        return Date.from(firstDayOfMonth.atStartOfDay(zoneId).toInstant());
    }

    /**
     * 对所给日期进行月份加减
     *
     * @param date
     * @param amount 添加或减去月份的数量
     * @return java.util.Date
     * @author ningkuilong
     * @date 2018/09/20
     */
    public static Date getOtherMonthOfCurrentDate(Date date, int amount){
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, amount);
        return calendar.getTime();
    }

    /**
     * 根据所给日期获取其他月份的第一天
     * @param date
     * @param amount
     * @return
     */
    public static Date getFristDayOfOtherMonth(Date date, int amount){
        return getFristDayOfMonth(getOtherMonthOfCurrentDate(date, amount));
    }

    /**
     * 根据所给日期获取其他月份的最后一天
     * @param date
     * @param amount
     * @return
     */
    public static Date getLastDayOfOtherMonth(Date date, int amount){
        return getLastDayOfMonth(getOtherMonthOfCurrentDate(date, amount));
    }

    /**
     * 对所给日期进行天数加减
     *
     * @param date
     * @param amount 添加或减去天的数量
     * @return java.util.Date
     * @author ningkuilong
     * @date 2018/09/20
     */
    public static Date getOtherDayOfCurrentDate(Date date, int amount){
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, amount);
        return calendar.getTime();
    }

    /**
     * java.util.Date --> java.time.LocalDate
     * @return
     */
    public static LocalDate dateToLocalDate(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        LocalDate localDate = localDateTime.toLocalDate();
        return localDate;
    }

	/**
     * 根据出生日期 获取 年龄(周岁)
     *
     * @param birthDay
     * @return
     */
    public static int getAge(Date birthDay) {
        Calendar cal = Calendar.getInstance();

        if (cal.before(birthDay)) {
            throw new IllegalArgumentException("生日不能超过当前日期");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            } else {
                age--;
            }
        }
        return age;
    }

    /**
     * 判断年龄是否16岁以下
     * @param birthdayDate
     * @return
     */
    public static Boolean checkChildLabor(Date birthdayDate){
        LocalDate birthdayLocalDate = DateUtil.dateToLocalDate(birthdayDate);
        Boolean flag = birthdayLocalDate.plusYears(16).isAfter(LocalDate.now());
        return flag;
    }

    /**
     *  获取两个日期相差的月数
     * @param d1    较大的日期
     * @param d2    较小的日期
     * @return  如果d1>d2返回 月数差 否则返回0
     */
    public static int getMonthDiff(Date d1, Date d2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        if(c1.getTimeInMillis() < c2.getTimeInMillis()) {return 0;}
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        // 获取年的差值 假设 d1 = 2015-8-16  d2 = 2011-9-30
        int yearInterval = year1 - year2;
        // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if(month1 < month2 || month1 == month2 && day1 < day2) {yearInterval --;}
        // 获取月数差值
        int monthInterval =  (month1 + 12) - month2  ;
        if(day1 < day2) {monthInterval --;}
        monthInterval %= 12;
        return yearInterval * 12 + monthInterval;
    }

}

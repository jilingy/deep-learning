package com.jilingy.deep.learning.common.constants;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-10-23
 */
public class DateConstants {
    public static final String DAY_UPPER_CASE = "D";
    public static final String MONTH_UPPER_CASE = "M";
    public static final String YEAR_UPPER_CASE = "Y";
    public static final String DATE_YMD_HMS = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_YMD_HMS_CN = "yyyy年MM月dd日 HH时mm分ss秒";
    public static final String DATE_YMD_HMS_UNSIGNED = "yyyyMMddHHmmss";
    public static final String DATE_YMD_HM = "yyyy-MM-dd HH:mm";
    public static final String DATE_YMD_HM_CN = "yyyy年MM月dd日 HH时mm分";
    public static final String DATE_YMD_H = "yyyy-MM-dd HH";
    public static final String DATE_YMD_H_CN = "yyyy年MM月dd日 HH时";
    public static final String DATE_YMD = "yyyy-MM-dd";
    public static final String DATE_YMD_UNSIGNED = "yyyyMMdd";
    public static final String DATE_YMD_CN = "yyyy年MM月dd日";
    public static final String DATE_YM = "yyyy-MM";
    public static final String DATE_YM_UNSIGNED = "yyyyMM";
    public static final String DATE_YM_CN = "yyyy年MM月";
    public static final String DATE_MD = "MM-dd";
    public static final String DATE_MD_UNSIGNED = "MMdd";
    public static final String DATE_MD_CN = "MM月dd日";
    public static final String DATE_HMS = "HH:mm:ss";
    public static final String DATE_HMS_CN = "HH时mm分ss秒";
    public static final String DATE_HM = "HH:mm";
    public static final String DATE_HM_CN = "HH时mm分";
    public static final String DATE_MS = "mm:ss";
    public static final String DATE_Y = "yyyy";
    public static final String DATE_Y_CN = "yyyy年";
    public static final String DATE_Y_NUMBER = "Y";
    public static final String DATE_M = "MM";
    public static final String DATE_M_CN = "MM月";
    public static final String DATE_M_NUMBER = "M";
    public static final String DATE_D = "dd";
    public static final String DATE_D_CN = "dd日";
    public static final String DATE_D_NUMBER = "d";
    public static final String DATE_D_CAPITAL_NUMBER = "D";
    public static final String DATE_H = "HH";
    public static final String DATE_H_CN = "HH时";
    public static final String DATE_H_NUMBER = "H";
    public static final String BEGIN_DAY = " 00:00:00";
    public static final String END_DAY = " 23:59:59";
    public static final Long MILLISECOND = 1000L;
    public static final Long SECOND = 1L;
    public static final Long MINUTE = 60L;
    public static final Long HOUR = 3600L;
    public static final Long DAY = 86400L;
    public static final Long MONTH;
    public static final Long YEAR;
    public static final int ONE_SECOND = 1;
    public static final int ONE_MINUTE = 1;
    public static final int ONE_HOUR = 1;
    public static final int ONE_DAY = 1;
    public static final int ONE_MONTH = 1;
    public static final int ONE_YEAR = 1;
    public static final String ZONE_OFFSET_CN = "+8";
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;
    public static final String IDX_HOUR_OF_DAY = "0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23";
    public static final String HOUR_OF_DAY = "01:00,02:00,03:00,04:00,05:00,06:00,07:00,08:00,09:00,10:00,11:00,12:00,13:00,14:00,15:00,16:00,17:00,18:00,19:00,20:00,21:00,22:00,23:00,24:00";
    public static final String DESC_YESTERDAY = "昨日";
    public static final String DESC_TODAY = "今日";
    public static final String DESC_TOMORROW = "明日";
    public static final String DESC_CURRENT_MONTH = "本月";
    public static final String DESC_LAST_MONTH = "上月";

    private DateConstants() {
        throw new IllegalStateException("Utility Class");
    }

    static {
        MONTH = 30L * DAY;
        YEAR = 365L * DAY;
    }
}

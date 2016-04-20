package com.liangbx.java.practice.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Title: <／p>
 * <p>Description: <／p>
 * <p>Copyright: Copyright (c) 2016<／p>
 * <p>Company: <／p>
 * @author liangbx
 * @version 1.0
 * @data 2016/4/20.
 */
public class DatePractice {

    public static final String YYYY_MM_DD_T_HH_MM_SS = "yyyy-MM-dd'T'HH:mm:ss";

    public static void main(String[] args) {
        String yyyyMMddTHHmmss = "2015-01-01T00:00:00";
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YYYY_MM_DD_T_HH_MM_SS);
            Date date = simpleDateFormat.parse(yyyyMMddTHHmmss);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

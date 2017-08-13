package com.hhx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtil {

	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * 根据标准时间字符串获取时间long
	 * @param dateTime
	 * @return
	 * @throws ParseException 
	 */
	public static long getTime(String dateTime) throws ParseException{
		return sdf.parse(dateTime).getTime();
	}
	/**
	 * 根据标准时间字符串逆向生成Date
	 * @param dateTime
	 * @return
	 * @throws ParseException 
	 */
	public static Date getDate(String dateTime) throws ParseException{
		return sdf.parse(dateTime);
	}
	/**
	 * 根据毫秒数生成时间
	 * @param time
	 * @return
	 */
	public static Date getDate(long time){
		return new Date(time);
	}
	/**
	 * 根据毫秒数获取时间字符串
	 * @param time
	 * @return
	 */
	public static String getString(long time){
		return sdf.format(getDate(time));
	}
	/**
	 * 获取标准当前时间字符串
	 * @return
	 */
	public static String getNow(){
		return sdf.format(new Date());
	}
	/**
	 * 将Date用字符串表示
	 * @param date
	 * @return
	 */
	public static String getString(Date date){
		return sdf.format(date);
	}

	
	
}

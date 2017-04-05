package com.autism.baselibs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间日期工具类
 *
 * Created by lhd on 2015/09/26.
 */
public class DateFormatUtil {

	public static final String FORMAT_1 = "yyyy-MM-dd HH:mm:ss";

	public static final String FORMAT_2 = "yyyyMMdd";

	public static String format() {
		return format(FORMAT_1);
	}

	public static String format(String format, Date date) {
		String formatDate = new SimpleDateFormat(format).format(new Date());
		return formatDate;
	}

	public static String format(String format, long ms) {
		return format(format, new Date(ms));
	}

	public static String format(String format) {
		return format(format, new Date());
	}
}

package com.tartarust.aop.jdk;

import java.util.Date;

/**
 * 日志类
 * @author LF
 *
 */
public class Logger {

	/**
	 * 记录日志
	 * @param level
	 * @param context
	 */
	@SuppressWarnings("deprecation")
	public static void logging(Level level, String context) {   
        if (level.equals(Level.INFO)) {   
            System.out.println(new Date().toGMTString() + " " + context);   
        }   
        if (level.equals(Level.DEBUGE)) {   
            System.err.println(new Date() + " " + context);   
        }   
    }

}

package com.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtils {
	/**
	 * 獲取業務日誌logger
	 *
	 * @return
	 */
	public static Logger getBussinessLogger() {
		return LoggerFactory.getLogger(LogEnum.BUSSINESS.getCategory());
	}

	/**
	 * 獲取平臺日誌logger
	 *
	 * @return
	 */
	public static Logger getPlatformLogger() {
		return LoggerFactory.getLogger(LogEnum.PLATFORM.getCategory());
	}

	/**
	 * 獲取資料庫日誌logger
	 *
	 * @return
	 */
	public static Logger getDBLogger() {
		return LoggerFactory.getLogger(LogEnum.DB.getCategory());
	}

	/**
	 * 獲取異常日誌logger
	 *
	 * @return
	 */
	public static Logger getExceptionLogger() {
		return LoggerFactory.getLogger(LogEnum.EXCEPTION.getCategory());
	}
}

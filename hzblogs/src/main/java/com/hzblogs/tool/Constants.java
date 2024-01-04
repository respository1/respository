package com.hzblogs.tool;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class Constants {
	//	用户保存的session
	public final static String USER_SESSION = "userSession";
	//	保存cookie时间为14天
	public final static int USER_COOKIE_TIME=3 * 24 * 60 * 60;
	//消息
	public final static String SYS_MESSAGE = "message";

	public final static String ADMIN_SESSION = "adminSession";
	
	/**
	 * MD5Base64加密方法
	 * 
	 * @param str
	 *            密码
	 * @return String
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static String EncodeByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 确定计算方法
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		// 加密字符串
		String newstr = base64en.encode(md5.digest(str.getBytes("UTF-8")));
		return newstr;
	}
	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		System.out.println(EncodeByMd5("123456"));
	}
}

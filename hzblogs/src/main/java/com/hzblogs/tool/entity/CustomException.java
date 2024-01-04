package com.hzblogs.tool.entity;
/**
* @author zzke
* @version 创建时间：2019年8月23日 下午5:18:27
* @ClassName 
* @Description  系统自定义异常类
*/
public class CustomException extends Exception {
	 //异常信息
    public String message;
    public CustomException(String message){
        super(message);
        this.message = message;
    }
 
    @Override
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }

}

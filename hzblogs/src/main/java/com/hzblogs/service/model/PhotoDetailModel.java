package com.hzblogs.service.model;

import java.util.Date;

/**
* @author zzke
* @version 创建时间：2021年7月21日 上午10:11:14
* @ClassName 
* @Description 	相册图片模型
*/
public class PhotoDetailModel {
	 //图片id
	 private Integer pdId;
	 //所属相册id
	 private Integer pdPaid;
	 //上传图片时间
	 private Date pdUploaddate;
	 //图片URL
	 private String pdImgurl;
	 //图片的描述信息
	 private String pdDescription;
	public Integer getPdId() {
		return pdId;
	}
	public void setPdId(Integer pdId) {
		this.pdId = pdId;
	}
	public Integer getPdPaid() {
		return pdPaid;
	}
	public void setPdPaid(Integer pdPaid) {
		this.pdPaid = pdPaid;
	}
	public Date getPdUploaddate() {
		return pdUploaddate;
	}
	public void setPdUploaddate(Date pdUploaddate) {
		this.pdUploaddate = pdUploaddate;
	}
	public String getPdImgurl() {
		return pdImgurl;
	}
	public void setPdImgurl(String pdImgurl) {
		this.pdImgurl = pdImgurl;
	}
	public String getPdDescription() {
		return pdDescription;
	}
	public void setPdDescription(String pdDescription) {
		this.pdDescription = pdDescription;
	}
	 
	 
}

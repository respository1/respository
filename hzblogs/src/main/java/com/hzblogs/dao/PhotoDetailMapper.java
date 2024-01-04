package com.hzblogs.dao;

import java.util.List;

import com.hzblogs.bean.PhotoDetail;

public interface PhotoDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photodetail_info
     *
     * @mbg.generated Sun Jul 21 10:19:03 CST 2021
     */
    int deleteByPrimaryKey(Integer pdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photodetail_info
     *
     * @mbg.generated Sun Jul 21 10:19:03 CST 2021
     */
    int insert(PhotoDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photodetail_info
     *
     * @mbg.generated Sun Jul 21 10:19:03 CST 2021
     */
    int insertSelective(PhotoDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photodetail_info
     *
     * @mbg.generated Sun Jul 21 10:19:03 CST 2021
     */
    PhotoDetail selectByPrimaryKey(Integer pdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photodetail_info
     *
     * @mbg.generated Sun Jul 21 10:19:03 CST 2021
     */
    int updateByPrimaryKeySelective(PhotoDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photodetail_info
     *
     * @mbg.generated Sun Jul 21 10:19:03 CST 2021
     */
    int updateByPrimaryKey(PhotoDetail record);
    /**
     * 根据相册id 查询图片
     * @param pdPaid
     * @return List<PhotoDetail>
     */
	List<PhotoDetail> selectByPdPaid(Integer pdPaid);
	/**
	 * 根据相册id 删除图片
	 * @param pdPaid
	 * @return int
	 */
	int deleteByPdPaid(Integer pdPaid);
	/**
	 * 根据图片id ，修改图片描述
	 * @param photoDetail
	 * @return int
	 */
	int updatePdDescriptionBypdId(PhotoDetail photoDetail);
}
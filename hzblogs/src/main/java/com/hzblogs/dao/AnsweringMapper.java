package com.hzblogs.dao;

import java.util.List;

import com.hzblogs.bean.Answering;

public interface AnsweringMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answering_info
     *
     * @mbg.generated Sun Jul 28 08:59:57 CST 2021
     */
    int deleteByPrimaryKey(Integer anId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answering_info
     *
     * @mbg.generated Sun Jul 28 08:59:57 CST 2021
     */
    int insert(Answering record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answering_info
     *
     * @mbg.generated Sun Jul 28 08:59:57 CST 2021
     */
    int insertSelective(Answering record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answering_info
     *
     * @mbg.generated Sun Jul 28 08:59:57 CST 2021
     */
    Answering selectByPrimaryKey(Integer anId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answering_info
     *
     * @mbg.generated Sun Jul 28 08:59:57 CST 2021
     */
    int updateByPrimaryKeySelective(Answering record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answering_info
     *
     * @mbg.generated Sun Jul 28 08:59:57 CST 2021
     */
    int updateByPrimaryKeyWithBLOBs(Answering record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answering_info
     *
     * @mbg.generated Sun Jul 28 08:59:57 CST 2021
     */
    int updateByPrimaryKey(Answering record);
    /**
     * 根据留言回复id 查询 留言回复信息
     * @param anId
     * @return Answering
     */
	Answering selectByAnId(Integer anId);
	/**
	 * 根据留言id 查询留言回复信息
	 * @param anMessageid
	 * @return List<Answering>
	 */
	List<Answering> selectByAnMessageId(Integer anMessageid);
	/**
	 * 根据留言id 删除留言回复信息
	 * @param anMessageid
	 * @return int
	 */
	int deleteByAnMessageid(Integer anMessageid);
}
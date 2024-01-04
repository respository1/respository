package com.hzblogs.service.commentback;

import java.util.List;

import com.hzblogs.service.model.CommentBackModel;

/**
* @author zzke
* @version 创建时间：2021年7月31日 上午10:18:16
* @ClassName 
* @Description //文章评论回复的接口
*/
public interface CommentBackService {
	/**
	 * 添加评论回复信息
	 * @param commentBackModel
	 * @return boolean
	 */
	boolean addBack(CommentBackModel commentBackModel);
	/**
	 * 根据评论id 查询回复信息
	 * @param coId
	 * @return List<CommentBackModel>
	 */
	List<CommentBackModel> selectByCbCommentid(Integer coId);

}

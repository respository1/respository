package com.hzblogs.service.comment;

import com.hzblogs.service.model.CommentModel;
import com.hzblogs.tool.PageSupport;

/**
* @author zzke
* @version 创建时间：2021年7月31日 上午10:15:30
* @ClassName 
* @Description //文章评论的业务接口
*/
public interface CommentService {
	/**
	 * 添加文章评论信息
	 * @param commentModel 
	 * @return CommentModel
	 */
	boolean addCommentInfo(CommentModel commentModel);
	/**
	 * 根据文章id 查询评论信息，带分页
	 * @param coArticleid 文章id
	 * @param userid 登录用户id
	 * @param page  当前页
	 * @return PageSupport
	 */
	PageSupport<CommentModel> selectByCoArticleid(Integer coArticleid, Integer userid, Integer page);

}

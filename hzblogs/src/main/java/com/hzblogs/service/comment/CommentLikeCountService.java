package com.hzblogs.service.comment;
/**
* @author zzke
* @version 创建时间：2021年7月31日 上午10:20:22
* @ClassName 
* @Description 	//文章评论点赞的业务接口
*/
public interface CommentLikeCountService {
	/**
	 * 点赞和取消点赞
	 * @param clCommentid
	 * @param clDianzanid
	 * @return boolean
	 */
	boolean onLike(Integer clCommentid, Integer clDianzanid);
	/**
	 * 判断是否点赞了
	 * @param coId 评论id
	 * @param userid 点赞人id
	 * @return boolean
	 */
	boolean exLike(Integer clCommentid, Integer clDianzanid);

}

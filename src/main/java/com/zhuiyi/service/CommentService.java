package com.zhuiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.Comment;
import com.zhuiyi.dto.CommentDTO;

import java.util.List;

/**
 * <p>
 * 博客文章表 服务类
 * </p>
 */
public interface CommentService extends IService<Comment> {

    ResponseResult listComment(String keywords);

    ResponseResult deleteBatch(List<Integer> ids);



//    ------web端方法开始------
    ResponseResult comments(Long articleId);

    ResponseResult addComment(CommentDTO comment);

    ResponseResult repliesByComId(Integer commentId);

}

package com.zhuiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuiyi.entity.Tags;
import com.zhuiyi.common.ResponseResult;

import java.util.List;

/**
 * <p>
 * 博客标签表 服务类
 * </p>
 */
public interface TagsService extends IService<Tags> {

    ResponseResult listTags(String name);

    ResponseResult insertTag(Tags tags);

    ResponseResult updateTag(Tags tags);

    ResponseResult deleteById(Long id);

    ResponseResult deleteBatch(List<Long> ids);

    ResponseResult getTagsById(Long id);

    ResponseResult top(Long id);


    //    -----web端方法开始-----
    ResponseResult webList();

}

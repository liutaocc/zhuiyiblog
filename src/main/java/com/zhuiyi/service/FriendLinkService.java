package com.zhuiyi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.FriendLink;

import java.util.List;

/**
 * <p>
 * 友情链接表 服务类
 * </p>
 */
public interface FriendLinkService extends IService<FriendLink> {

    ResponseResult listFriendLink(String name, Integer status);

    ResponseResult insertFriendLink(FriendLink friendLink);

    ResponseResult updateFriendLink(FriendLink friendLink);

    ResponseResult deleteBatch(List<Integer> ids);

    ResponseResult top(Integer id);


    //    ----web端开始-----
    ResponseResult webFriendLinkList();

    ResponseResult applyFriendLink(FriendLink friendLink);


}

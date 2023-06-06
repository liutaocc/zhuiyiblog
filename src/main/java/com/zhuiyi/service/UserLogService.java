package com.zhuiyi.service;

import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.UserLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 日志表 服务类
 * </p>
 */
public interface UserLogService extends IService<UserLog> {

    ResponseResult listUserLog();

    ResponseResult deleteBatch(List<Long> ids);
}

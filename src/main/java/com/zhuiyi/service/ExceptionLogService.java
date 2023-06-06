package com.zhuiyi.service;

import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.ExceptionLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface ExceptionLogService extends IService<ExceptionLog> {

    ResponseResult listExceptionLog();

    ResponseResult deleteBatch(List<Long> ids);
}

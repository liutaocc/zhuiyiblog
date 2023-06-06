package com.zhuiyi.service;

import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.WebConfig;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 网站配置表 服务类
 * </p>
 */
public interface WebConfigService extends IService<WebConfig> {

    ResponseResult listWebConfig();

    ResponseResult updateWebConfig(WebConfig webConfig);
}

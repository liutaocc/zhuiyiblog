package com.zhuiyi.service;

import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.SystemConfig;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统配置表 服务类
 * </p>
 */
public interface SystemConfigService extends IService<SystemConfig> {

    ResponseResult getConfig();

    ResponseResult updateConfig(SystemConfig systemConfig);

    SystemConfig getCustomizeOne();
}

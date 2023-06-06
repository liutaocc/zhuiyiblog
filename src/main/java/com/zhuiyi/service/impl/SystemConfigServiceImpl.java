package com.zhuiyi.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.SystemConfig;
import com.zhuiyi.entity.User;
import com.zhuiyi.mapper.SystemConfigMapper;
import com.zhuiyi.service.SystemConfigService;
import com.zhuiyi.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.zhuiyi.common.Constants.USER_ROLE_ID;
import static com.zhuiyi.common.FieldConstants.ID;
import static com.zhuiyi.common.FieldConstants.LIMIT_ONE;

/**
 * <p>
 * 系统配置表 服务实现类
 * </p>
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SystemConfigServiceImpl extends ServiceImpl<SystemConfigMapper, SystemConfig> implements SystemConfigService {


    private final UserService userService;

    /**
     * 获取系统配置
     * @return
     */
    @Override
    public ResponseResult getConfig() {
        QueryWrapper<SystemConfig> queryWrapper = new QueryWrapper<>();
        User user = userService.getById(StpUtil.getLoginIdAsInt());
        if (user.getRoleId() > USER_ROLE_ID) queryWrapper.orderByDesc(ID);
        queryWrapper.last(LIMIT_ONE);
        SystemConfig systemConfig = baseMapper.selectOne(queryWrapper);
        return ResponseResult.success(systemConfig);
    }

    /**
     * 修改系统配置
     * @param systemConfig
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult updateConfig(SystemConfig systemConfig) {
        baseMapper.updateById(systemConfig);
        return ResponseResult.success();
    }

    //---------自定义方法----------
    @Override
    public SystemConfig getCustomizeOne() {
        System.out.println("********"+baseMapper.selectOne(new QueryWrapper<SystemConfig>().last(LIMIT_ONE)));
        return baseMapper.selectOne(new QueryWrapper<SystemConfig>().last(LIMIT_ONE));
    }
}

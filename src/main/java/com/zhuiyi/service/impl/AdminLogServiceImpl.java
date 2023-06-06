package com.zhuiyi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.common.FieldConstants;
import com.zhuiyi.entity.AdminLog;
import com.zhuiyi.mapper.AdminLogMapper;
import com.zhuiyi.service.AdminLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhuiyi.util.PageUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 */
@Service
public class AdminLogServiceImpl extends ServiceImpl<AdminLogMapper, AdminLog> implements AdminLogService {

    /**
     * 分页查询操作日志
     * @return
     */
    @Override
    public ResponseResult listAdminLog() {
        Page<AdminLog> sysLogPage = baseMapper.selectPage(new Page<>(PageUtils.getPageNo(), PageUtils.getPageSize()),
                new QueryWrapper<AdminLog>().orderByDesc(FieldConstants.CREATE_TIME));
        return ResponseResult.success(sysLogPage);
    }

    /**
     * 批量删除操作日志
     * @param ids 操作日志id集合
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult deleteAdminLog(List<Long> ids) {
        int rows = baseMapper.deleteBatchIds(ids);
        return rows > 0 ? ResponseResult.success(): ResponseResult.error("批量删除操作日志失败");
    }
}

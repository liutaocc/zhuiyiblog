package com.zhuiyi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.common.FieldConstants;
import com.zhuiyi.entity.ExceptionLog;
import com.zhuiyi.mapper.ExceptionLogMapper;
import com.zhuiyi.service.ExceptionLogService;
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
public class ExceptionLogServiceImpl extends ServiceImpl<ExceptionLogMapper, ExceptionLog> implements ExceptionLogService {

    @Override
    public ResponseResult listExceptionLog() {
        QueryWrapper<ExceptionLog> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc(FieldConstants.CREATE_TIME);
        Page<ExceptionLog> pg = new Page<>(PageUtils.getPageNo(), PageUtils.getPageSize());
        Page<ExceptionLog> sysLogPage = baseMapper.selectPage(pg, queryWrapper);
        return ResponseResult.success(sysLogPage);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult deleteBatch(List<Long> ids) {
        int rows = baseMapper.deleteBatchIds(ids);
        return rows > 0 ? ResponseResult.success(): ResponseResult.error("批量删除操作日志失败");
    }
}

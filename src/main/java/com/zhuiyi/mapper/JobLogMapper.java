package com.zhuiyi.mapper;

import com.zhuiyi.entity.JobLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 定时任务调度日志表 Mapper 接口
 * </p>
 */
@Repository
public interface JobLogMapper extends BaseMapper<JobLog> {

    void clean();

}

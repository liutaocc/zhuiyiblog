package com.zhuiyi.mapper;

import com.zhuiyi.entity.Job;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 定时任务调度表 Mapper 接口
 * </p>
 */
@Repository
public interface JobMapper extends BaseMapper<Job> {

}

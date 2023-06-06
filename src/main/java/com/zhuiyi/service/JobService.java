package com.zhuiyi.service;

import com.zhuiyi.entity.Job;
import com.zhuiyi.common.ResponseResult;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuiyi.enums.TaskException;
import org.quartz.SchedulerException;

import java.util.List;

/**
 * <p>
 * 定时任务调度表 服务类
 * </p>
 */
public interface JobService extends IService<Job> {

    ResponseResult listJob(String jobName, String jobGroup, String status);

    ResponseResult getJobById(Long jobId);

    ResponseResult insertJob(Job job) throws SchedulerException, TaskException;

    ResponseResult updateJob(Job job) throws SchedulerException, TaskException;

    ResponseResult deleteJob(Long jobId) throws SchedulerException;

    ResponseResult deleteBatch(List<Long> ids);

    ResponseResult pauseJob(Job job) throws SchedulerException ;

    ResponseResult run(Job job);

    ResponseResult changeStatus(Job job) throws SchedulerException;

}

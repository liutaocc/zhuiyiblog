package com.zhuiyi.quartz;

import com.zhuiyi.entity.Job;
import org.quartz.JobExecutionContext;

/**
 * @apiNote 定时任务处理（允许并发执行）
 */
public class QuartzJobExecution extends AbstractQuartzJob {
    @Override
    protected void doExecute(JobExecutionContext context, Job job) throws Exception {
        JobInvokeUtil.invokeMethod(job);
    }
}

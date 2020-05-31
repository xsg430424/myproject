package com.sfc.xxljobexecutor.executor.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

@JobHandler(value="hellowWardJobHandler")
@Component
public class HellowWardJobHandler  extends IJobHandler {
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("helloword start job");
        return SUCCESS;
    }
}

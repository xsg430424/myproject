package com.sfc.xxljobexecutor.executor.jobhandler;

import com.sfc.xxljobexecutor.entity.po.Product;
import com.sfc.xxljobexecutor.service.IProductService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @author ：李振伟(zhenwei.li)
 * @date ：Created in 2019/1/29 18:25
 * @description：测试
 * @modified By：
 * @version: 1.0$
 */
@JobHandler(value = "SyncUserJob")
@Component
@Slf4j
public class SyncUserJob extends IJobHandler implements Serializable {

    @Resource
    private IProductService productService;

    @Override
    public ReturnT<String> execute(String s){
        log.info("parameter:{}",s);
        XxlJobLogger.log("SyncUserJob--start");
        log.info("SyncUserJob--start");
        long id = 1;
        Product product = productService.get(id);
        log.info("query mysql success job-content:"+product.getName());
        log.info("SyncUserJob--end");
        XxlJobLogger.log("SyncUserJob--end");
        return ReturnT.SUCCESS;
    }
}

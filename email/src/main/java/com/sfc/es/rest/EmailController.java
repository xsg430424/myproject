package com.sfc.es.rest;

import com.sfc.es.entity.param.AlertSearchParam;
import com.sfc.es.entity.po.Alert;
import com.sfc.es.service.AlertService;
import com.sfc.es.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.List;

/**
 * @des TODO
 * @date 2019/6/30 10:47
 * @auther xiaoshuigeng
 */
@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private MailService mailService;
    @Autowired
    private AlertService alertService;

    @Autowired
    private TemplateEngine templateEngine;

    @RequestMapping("/send")
    public void sendTemplateMail(AlertSearchParam alertSearchParam) {
        List<Alert> alerts= alertService.findAll();
        alerts.stream().forEach(alert -> {
            if (alert.getAlertType()==alertSearchParam.getAlertType()){
                //创建邮件正文
                Context context = new Context();
                context.setVariable("id", "006");
                String emailContent = templateEngine.process("emailTemplate", context);
                mailService.sendHtmlMail("1005524324@qq.com"," ["+alert.getAlertName()+"]提醒",emailContent);
            }
        });
    }
}

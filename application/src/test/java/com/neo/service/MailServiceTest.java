//package com.neo.service;
//
//import com.sfc.es.service.MailService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.thymeleaf.TemplateEngine;
//import org.thymeleaf.context.Context;
//
///**
// * Created by summer on 2017/5/4.
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class MailServiceTest {
//
//    @Autowired
//    private MailService mailService;
//
//    @Autowired
//    private TemplateEngine templateEngine;
//
//    @Test
//    public void testSimpleMail() throws Exception {
//        mailService.sendSimpleMail("1005524324@qq.com","邮件测试（1）","嗨，这个来自肖水庚的邮件测试内容");
//    }
//
//    @Test
//    public void testHtmlMail() throws Exception {
//        String content="<html>\n" +
//                "<body>\n" +
//                "    <h3>嗨，这个来自肖水庚的邮件测试内容!</h3>\n" +
//                "</body>\n" +
//                "</html>";
//        mailService.sendHtmlMail("1005524324@qq.com","邮件测试（2）",content);
//    }
//
//    @Test
//    public void sendAttachmentsMail() {
//        String filePath="D:\\test.log";
//        mailService.sendAttachmentsMail("1005524324@qq.com", "邮件测试（3）-带附件的邮件", "有附件，请查收！", filePath);
//    }
//
//
//    @Test
//    public void sendInlineResourceMail() {
//        String rscId = "neo006";
//        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
//        String imgPath = "D:\\ddz.jpg";
//
//        mailService.sendInlineResourceMail("1005524324@qq.com", "邮件测试（4）-这是有图片的邮件", content, imgPath, rscId);
//    }
//
//
//    @Test
//    public void sendTemplateMail() {
//        //创建邮件正文
//        Context context = new Context();
//        context.setVariable("id", "006");
//        String emailContent = templateEngine.process("emailTemplate", context);
//
//        mailService.sendHtmlMail("1005524324@qq.com","邮件测试（5）-这是模板邮件",emailContent);
//    }
//
//    @Test
//    public void sendTemplateMail2() {
//        //创建邮件正文
//        Context context = new Context();
//        context.setVariable("id", "006");
//        String emailContent = templateEngine.process("template", context);
//
//        mailService.sendHtmlMail("1005524324@qq.com"," 您好,该喝水了",emailContent);
//    }
//}

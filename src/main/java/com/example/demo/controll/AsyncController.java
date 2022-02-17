package com.example.demo.controll;

import com.example.demo.async.AsyncService;
import com.example.demo.async.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;

@RestController
@RequestMapping("async")
@EnableAsync
@EnableScheduling
/*
    @author 123
 */
public class AsyncController {
    @Autowired
    AsyncService asyncService;

    @Autowired
    ScheduledService scheduledService;

    @Autowired
    JavaMailSenderImpl mailSender;

    @GetMapping("hello")
    public String hello(@PathVariable) {
        asyncService.hello();
        scheduledService.hello();
        return "触发+超时";
    }

    @GetMapping("mail1")
    public void sendMail1() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("邮件一");
        message.setText("文本内容");

        message.setTo("1846721817@qq.com");
        message.setFrom("1846721817@qq.com");
        mailSender.send(message);
    }

    @GetMapping("mail2")
    public void sendMail2() {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setSubject("邮件二");
            helper.setText("<b style='color:red'>文本内容2</b>", true);
            helper.setTo("1846721817@qq.com");
            helper.setFrom("1846721817@qq.com");
            mailSender.send(mimeMessage);
        } catch (Exception $e) {
            $e.printStackTrace();
        }
    }
}

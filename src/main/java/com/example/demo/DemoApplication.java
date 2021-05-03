package com.example.demo;

import com.example.demo.model.Mail;
import com.example.demo.service.MailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        Mail mail = new Mail();
//        mail.setMailFrom("vukieuanh.hnue@gmail.com");
//        mail.setMailTo("vukieuanh.hnue@gmail.com");
//        mail.setMailSubject("Spring Boot - Email Example");
//        mail.setMailContent("Learn How to send Email using Spring Boot!!!\n\nThanks\nwww.technicalkeeda.com");

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
//        MailService mailService = (MailService) ctx.getBean("mailService");
//        mailService.sendEmail(mail);
    }

}

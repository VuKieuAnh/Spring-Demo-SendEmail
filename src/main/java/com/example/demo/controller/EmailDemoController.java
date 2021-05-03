package com.example.demo.controller;

import com.example.demo.model.Mail;
import com.example.demo.service.MailService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailDemoController {
    @Autowired
    private MailService mailService;

    @GetMapping("/home")
    public String home(){
        Mail mail = new Mail();
        mail.setMailFrom("vukieuanh.hnue@gmail.com");
        mail.setMailTo("vtka.hip@gmail.com");
        mail.setMailSubject("Spring Boot - Email Example");
        mail.setMailContent("Learn How to send Email using Spring Boot!!!");

        mailService.sendEmail(mail);
        return "home";
    }
}

package com.spring.mail.sender.demo;

import com.spring.mail.sender.demo.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {
    @Autowired
    EmailService emailService;

    String receiverAddr = "Enter Receivers Address";
    String subject = "title - test";
    String body = "body - test";
    String pathToAttachment = "attachment/application.yml";

    @Test
    public void contextLoads() {
        Assert.assertNotNull(emailService);
        log.debug("[jujin] emailService : {}", emailService);
    }

    @Test
    public void sendSimpleMessageTest() {
        emailService.sendSimpleMessage(receiverAddr, subject, body);
    }

    @Test
    public void sendAttachedMessageTest() {
        emailService.sendMessageWithAttachment(receiverAddr, subject, body, pathToAttachment);
    }
}

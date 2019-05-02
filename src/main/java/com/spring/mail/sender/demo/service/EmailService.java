package com.spring.mail.sender.demo.service;

import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Created by Yoo Ju Jin(yjj@hanuritien.com)
 * Created Date : 2019-04-29
 */

public interface EmailService {
    void sendSimpleMessage(String to, String subject, String text);
    void sendMessageWithAttachment(String to, String subject, String text, String pathToAttachment);
    void sendMessageWithAttachment(String to, String subject, String text, File file);

}

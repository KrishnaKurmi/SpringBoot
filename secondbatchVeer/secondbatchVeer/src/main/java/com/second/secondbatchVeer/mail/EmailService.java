package com.vkr.SampleProject.mail;
//Frameworks
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    // Simple Mail
    public void sendMessage(String to, String subject, String body){
        SimpleMailMessage message =new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }

    //HTML Email
    public void htmlMail(String to, String subject, String body) throws MessagingException {
        MimeMessage m=mailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(m,true);
        helper.setFrom("Sam");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(body,true);

        mailSender.send(m);
    }
    //HTML Email with Attachments
    public void htmlMailWithAttachment(String to, String subject, String body, String path) throws MessagingException {
        MimeMessage m=mailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(m,true);
        helper.setFrom("Sam");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(body,true);

        FileSystemResource file = new FileSystemResource(new File(path));
        helper.addAttachment(file.getFileName(), file);

        mailSender.send(m);
    }
}

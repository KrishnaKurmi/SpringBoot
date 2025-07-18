package com.vkr.SampleProject.mail;
//Frameworks
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {
    @Autowired
    EmailService emailService;

    //Mapping to simple mail function
    @GetMapping("/send")
    @ResponseBody
    public String send(){
        System.out.println("Mail Sent");
        emailService.sendMessage(
                "your-mail@gmail.com",
                "Test Mail",
                "This is a test Mail, Have a Nice Day!"
        );
        return "Mail Sent";
    }

    // Mapping to HTML mail function
    @GetMapping("/send2")
    @ResponseBody
    public String htmlMail() throws MessagingException {
        System.out.println("Mail Sent");
        emailService.htmlMail(
                "your-mail@gmail.com",
                "Test Mail",
                "<h1>This is a test Mail, Have a Nice Day!</h1>" // HTML style
        );
        return "Mail Sent";
    }

    // Mapping to HTML mail with Attachments function
    @GetMapping("/send3")
    @ResponseBody
    public String htmlMailWithAttachment() throws MessagingException {
        System.out.println("Mail Sent");
        emailService.htmlMailWithAttachment(
                "your-mail@gmail.com",
                "Test Mail",
                "<h1>This is a test Mail, Have a Nice Day!</h1>", // HTML style
                "file-path" // file path with extension
        );
        return "Mail Sent";
    }

    // Mapping to HTML mail with Inline Image function
    @GetMapping("/send4")
    @ResponseBody
    public String htmlMailWithInlineImage() throws MessagingException {
        System.out.println("Mail Sent");
        emailService.htmlMailWithAttachment(
                "your-mail@gmail.com",
                "Test Mail",
                "<h1>This is a test Mail, Have a Nice Day!</h1>", // HTML style
                "image-path" // image path with extension
        );
        return "Mail Sent";
    }
}

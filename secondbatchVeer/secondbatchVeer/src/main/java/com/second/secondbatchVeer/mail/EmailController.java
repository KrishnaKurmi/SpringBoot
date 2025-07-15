package com.vkr.SampleProject.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String htmlMail(){
        System.out.println("Mail Sent");
        emailService.htmlMail(
                "your-mail@gmail.com",
                "Test Mail",
                "<h1>This is a test Mail, Have a Nice Day!</h1>" // HTML style
        );
        return "Mail Sent";
    }
}

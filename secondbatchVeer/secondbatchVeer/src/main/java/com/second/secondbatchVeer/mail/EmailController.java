package com.vkr.SampleProject.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {
    @Autowired
    EmailService emailService;

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
}

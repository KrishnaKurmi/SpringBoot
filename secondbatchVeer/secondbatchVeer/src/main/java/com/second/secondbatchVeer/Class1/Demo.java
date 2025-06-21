package com.second.secondbatchVeer.Class1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("/demo1")
public class Demo {

    @RequestMapping("/getmainpage")
    @ResponseBody
    public  String getPage(){
        return "veer";
    }

    @GetMapping("/getsagar")
    public String getHTMLPage(){
        return "sagar";
    }

    @GetMapping("/getdemo")
    @ResponseBody
    public String getDemoPage(){
        return "demo";
    }

    @GetMapping("/getfirstpage")
    public String getFirstPage(Model model){
        model.addAttribute("a",10);
        return "firstpage";
    }

    @GetMapping("/getsum")
    public String getSumPage(Model model){
        int a=10,b=20,c=30;
        model.addAttribute("x",a);
        model.addAttribute("y",b);
        model.addAttribute("z",c);
        model.addAttribute("age",15);
        return "firstpage";
    }

    @GetMapping("/abc")
    public String get(){
        return "redirect:/veer1";
    }

    @GetMapping("/veer1")
    public String get(Model model){
        model.addAttribute("name","veersinghlodhi");
        model.addAttribute("contact","9770225248");
        return "veer";
    }

    @GetMapping("/lang")
    public  String getHTMLPage(Model model){
        List<String>lst=List.of("C","C++","Java","Python","JS","R","PHP","RUBY");
        model.addAttribute("lang",lst);
        return "langpage";
    }
    @GetMapping("/child")
    public String frag(){
        return "test";
    }
    @GetMapping("/parent")
    public String frag2(){
        return "header";
    }

    @GetMapping("/test")
    public String getTest(){
        return  "a";
    }


    @GetMapping("/getdata")
    public String getValue(@RequestParam("name")String name){
        System.out.println("Name is "+name);
        return "confirmation";
    }






}

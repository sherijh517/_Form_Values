package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String LoadFormPage(){
        return "formtemplate";
    }


    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("login") String Login,
                               Model model){
        model.addAttribute("loginval", Login);
        return "confirm";
    }
}


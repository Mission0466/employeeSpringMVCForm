package com.example.demo.controllers;

//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class demoController {

    @RequestMapping(value="/home.html", method = RequestMethod.GET)
    public String home(){
        return "home.html";
    }
    
}

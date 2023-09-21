package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    private String message;

     @GetMapping("/view")
    public String showView(Model model) {
         this.message = "voilivoilou";

         model.addAttribute("message", this.message);

         return "view";
     }
}

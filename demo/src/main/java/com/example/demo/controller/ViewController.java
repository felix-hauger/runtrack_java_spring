package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class ViewController {
    private String welcomeMessage;

    private ArrayList<Message> messageList = new ArrayList<Message>();

     @GetMapping("/view")
    public String showView(Model model) {
         this.welcomeMessage = "voilivoilou";

//         Message message1 = new Message("toto", "Salut");
//         Message message2 = new Message("caca", "tu");
//         Message message3 = new Message("hmm", "vas");
//         Message message4 = new Message("oki", "bien");
//
//         this.messageList.add(message1);
//         this.messageList.add(message2);
//         this.messageList.add(message3);
//         this.messageList.add(message4);

         model.addAttribute("welcomeMessage", this.welcomeMessage);
         model.addAttribute("messageList", this.messageList);
         model.addAttribute("newMessage", new Message());

         return "view";
     }

     @PostMapping("/view")
    public String saveMessage(@ModelAttribute Message newMessage) {
         this.messageList.add(newMessage);

         return "redirect:view";
     }
}

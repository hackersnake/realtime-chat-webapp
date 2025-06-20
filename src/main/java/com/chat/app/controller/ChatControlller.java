package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatControlller {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendmessage(ChatMessage mesg){
        return mesg;
    }

    @GetMapping("chat")
    public String chat(){
        return "chat";
    }
}

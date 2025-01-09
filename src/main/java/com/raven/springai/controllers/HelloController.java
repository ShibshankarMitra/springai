package com.raven.springai.controllers;

import com.raven.springai.models.GptPrompt;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HelloController {

    private final ChatClient gptChatClient;

    @PostMapping("/prompt")
    public ResponseEntity<String> generateAnswer(
            @RequestBody GptPrompt gptPrompt){
        String response = gptChatClient.prompt(gptPrompt.getPrompt()).call().content();
       return ResponseEntity.ok(response);
    }
}

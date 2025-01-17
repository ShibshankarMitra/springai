package com.raven.springai.controllers;

import com.raven.springai.models.GptPrompt;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HelloController {

    private final ChatClient gptChatClient;

    @PostMapping("/prompt")
    public ResponseEntity<String> generateAnswer(
            @RequestBody GptPrompt gptPrompt){
        String response = gptChatClient.prompt(new Prompt( gptPrompt.getPrompt())).call().content();
       return ResponseEntity.ok(response);
    }

    @GetMapping("/youtube/popular")
    public ResponseEntity<String> generatePopularYoutuber(
            @RequestParam(value = "genre") String genre){
        String response = gptChatClient.prompt(new Prompt("Any")).call().content();
        return ResponseEntity.ok(response);
    }

}

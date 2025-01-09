package com.raven.springai.configs;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GptClientConfigs {

    @Bean
    @Primary
    public ChatClient gptChatClient(ChatClient.Builder builder){
        return builder.build();
    }
}

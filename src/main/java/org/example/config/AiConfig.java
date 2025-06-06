package org.example.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AiConfig {

    @Bean
    public ChatClient chatClient(OpenAiChatModel model) {
        return ChatClient
                .builder(model)
                .build();
    }

    @Bean
    public VectorStore vectorStore(EmbeddingModel embeddingModel) {
        VectorStore vectorStore = SimpleVectorStore.builder(embeddingModel).build();

        // 构建测试数据
        List<Document> documents =
                List.of(new Document("Hello Spring AI"),
                        new Document("Hello Spring Boot"));
        // 添加到向量数据库
        vectorStore.add(documents);

        return vectorStore;
    }
}
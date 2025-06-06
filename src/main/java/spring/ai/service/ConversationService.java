package spring.ai.service;

public interface ConversationService {
    /**
     * 进行对话
     * @param sessionId 会话ID
     * @param userMessage 用户消息
     * @return AI回复内容
     */
    String chat(String sessionId, String userMessage);
}
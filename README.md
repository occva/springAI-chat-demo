# spring-ai-demo

## 项目简介
本项目是一个基于 Spring Boot 和 Spring AI 的智能问答演示系统，集成了 OpenAI 能力，支持普通问答、会话问答和知识库问答三种模式，适合 AI 应用开发的入门和二次开发。

## 主要功能
- 普通问答：输入问题，AI 返回答案。
- 会话问答：支持多轮对话，基于 sessionId 维持上下文。
- 知识库问答：结合知识库内容进行智能问答。

## 技术栈
- Spring Boot 3.4.2
- Spring AI 1.0.0-M6
- OpenAI
- Lombok
- Hutool

## 快速开始

### 1. 克隆项目
```bash
git clone <your-repo-url>
cd spring-ai-demo
```

### 2. 配置 OpenAI Key
在 `application.properties` 或环境变量中配置你的 OpenAI API Key。

### 3. 构建并运行
```bash
mvn clean package
java -jar target/spring-ai-demo-1.0-SNAPSHOT.jar
```

### 4. 主要接口

#### 1. 普通问答
- `POST /api/qa/ask`
- 请求体：
  ```json
  {
    "question": "中国的首都是哪里？"
  }
  ```
- 返回体：
  ```json
  {
    "question": "中国的首都是哪里？",
    "answer": "北京。"
  }
  ```

#### 2. 会话问答
- `POST /api/qa/ask-session`
- 请求体：
  ```json
  {
    "question": "介绍一下爱因斯坦。",
    "sessionId": "your-session-id"
  }
  ```

#### 3. 知识库问答
- `POST /api/qa/ask-knowledge`
- 请求体同上。

## 目录结构
- `src/main/java/org/example/controller` —— 控制器层，提供 API 接口
- `src/main/java/org/example/service` —— 业务逻辑层，AI 问答实现
- `src/main/java/org/example/model` —— 数据模型
- `src/main/java/org/example/config` —— 配置类

## 许可证
MIT
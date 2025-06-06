# Spring AI Demo

这是一个基于Spring AI框架的智能对话应用示例项目，集成了OpenAI的GPT模型，提供了智能对话、文档处理等功能。

## 技术栈

- Java 21
- Spring Boot 3.4.2
- Spring AI 1.0.0-M6
- MongoDB
- SpringDoc OpenAPI 2.3.0
- Lombok
- Hutool 5.8.25

## 主要功能

- 智能对话：基于OpenAI GPT模型的对话功能
- 文档处理：支持文档的智能分析和处理
- RESTful API：提供标准的REST API接口
- API文档：集成Swagger UI，提供API文档和测试界面

## 项目结构

```
src/main/java/spring/ai/
├── config/         # 配置类
├── controller/     # 控制器层
├── entity/         # 实体类
├── model/          # 数据模型
├── repository/     # 数据访问层
├── service/        # 业务逻辑层
└── ChatApplication.java  # 应用程序入口
```

## 快速开始

### 环境要求

- JDK 21+
- Maven 3.8+
- MongoDB

### 配置说明

1. 在`application.yml`中配置必要的参数：
   - OpenAI API密钥
   - MongoDB连接信息
   - 其他自定义配置

### 运行项目

```bash
# 克隆项目
git clone [项目地址]

# 进入项目目录
cd spring-ai-demo

# 编译打包
mvn clean package

# 运行项目
java -jar target/spring-ai-demo-1.0-SNAPSHOT.jar
```

### API文档

启动项目后，访问以下地址查看API文档：
```
http://localhost:8080/swagger-ui.html
```

## 注意事项

- 本项目使用了Spring AI的里程碑版本(1.0.0-M6)，可能存在不稳定的情况
- 使用前请确保已正确配置OpenAI API密钥
- MongoDB服务需要提前启动并正确配置

## 许可证

[添加许可证信息]
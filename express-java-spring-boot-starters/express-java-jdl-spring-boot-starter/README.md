# express-java-jdl-spring-boot-starter
## 快速开始
1. 引入依赖
    ```xml
    <dependency>
        <groupId>club.mrxiao</groupId>
        <artifactId>express-java-jdl-spring-boot-starter</artifactId>
        <version>${version}</version>
    </dependency>
    ```
2. 添加配置(application.yml)

```yaml
    express:
      jdl:
        pro: 是否生产环境
        app-key: your appKey
        app-secret: your appSecret
        refresh-token: your refreshToken
        customer-code: 商家编码 青龙业主号
```

3. 自动注入的类型

- `JdlService`
- `JdlConfig`
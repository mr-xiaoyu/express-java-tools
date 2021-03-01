# express-java-sf-spring-boot-starter
## 快速开始
1. 引入依赖
    ```xml
    <dependency>
        <groupId>club.mrxiao</groupId>
        <artifactId>express-java-sf-spring-boot-starter</artifactId>
        <version>${version}</version>
    </dependency>
    ```
2. 添加配置(application.yml)

```yaml
    express:
      sf:
        pro: 是否生产环境
        code: 顾客编码
        check: 校验码
        card: 月结卡号
```

3. 自动注入的类型

- `SfService`
- `SfConfig`
1、H2数据库在Spring Boot + Maven中的应用
   <1>pom文件配置h2依赖
   <2>application.properties 配置
    spring.h2.console.enable = true
   <3>启动 spring boot项目后，可以在 http://localhost:{port}/h2-console  配置h2数据库
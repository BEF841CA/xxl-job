<p align="center" >
    <img src="https://www.xuxueli.com/doc/static/xxl-job/images/xxl-logo.jpg" width="150">
    <h3 align="center">XXL-JOB</h3>
</p>


## Introduction
XXL-JOB is a distributed task scheduling framework. 
It's core design goal is to develop quickly and learn simple, lightweight, and easy to expand. 
Now, it's already open source, and many companies use it in production environments, real "out-of-the-box".

XXL-JOB是一个分布式任务调度平台，其核心设计目标是开发迅速、学习简单、轻量级、易扩展。现已开放源代码并接入多家公司线上产品线，开箱即用。


## Documentation
- [中文文档](https://www.xuxueli.com/xxl-job/)
- [English Documentation](https://www.xuxueli.com/xxl-job/en/)


## Communication    
- [社区交流](https://www.xuxueli.com/page/community.html)


## Features
- 1、super()
- 2、数据库: 适配数据库 PostgreSQL
- 3、加密: 使用[Jasypt Spring Boot](https://github.com/ulisesbocchio/jasypt-spring-boot)对admin控制台中的属性源提供加密支持

## Docker image

Docker地址：https://ghcr.io/bef841ca/xxl-job
```Bash
docker pull ghcr.io/bef841ca/xxl-job
```

如需自定义 postgres 等配置，可通过 "-e PARAMS" 指定，参数格式 PARAMS="--key=value  --key2=value2" ；
配置项参考文件：/xxl-job/xxl-job-admin/src/main/resources/application.properties
如需自定义 JVM内存参数 等配置，可通过 "-e JAVA_OPTS" 指定，参数格式 JAVA_OPTS="-Xmx512m" ；
```Bash
docker run -e PARAMS="--spring.datasource.url=jdbc:postgres://127.0.0.1:5432/xxl_job --jasypt.encryptor.password=123456" -p 8080:8080 -v /tmp:/data/applogs --name xxl-job-admin  -d ghcr.io/bef841ca/xxl-job:latest
```


## Donate
No matter how much the donation amount is enough to express your thought, thank you very much ：）     [To donate](https://www.xuxueli.com/page/donate.html )

无论捐赠金额多少都足够表达您这份心意，非常感谢 ：）      [前往捐赠](https://www.xuxueli.com/page/donate.html )

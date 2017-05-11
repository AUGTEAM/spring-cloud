# [spring-cloud](http://projects.spring.io/spring-cloud/)
##### spring boot以及spring cloud的demo以及简单总结介绍
##### 更多介绍请参考官方文档: http://projects.spring.io/spring-cloud
##### spring cloud 中文网: https://springcloud.cc/
# modules 介绍
## boot-demo spring boot简单案例
##### 包括模板引擎、datasource、JPA、swagger2的使用。轻松简单的构建web应用
## cloud-config 配置服务器
##### 管理git上的配置文件
##### 管理本地配置文件
##### 将自身（配置服务器）注册到注册中心，供应用通过注册中心拉取配置，也可实现配置服务器的高可用
## cloud-config-client 配置获取客户端
##### 通过注册中心发现配置服务器拉取配置信息
## cloud-consumer 服务消费
##### RestTemplate实例通过Ribbon实现在客户端对服务调用的负载均衡(软负载)
##### Feign对服务的消费和调用,Spring Cloud为Feign增加了对Spring MVC注解的支持，还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现
##### Hystrix断路器在以上两种模式下的使用
##### spring cloud零配置,对服务接口零引用的消费
## cloud-provider 服务提供者
##### 通过指定注册中心地址,向注册中心注册服务
## cloud-registry 服务注册中心
##### EurekaServer充当注册中心的角色
##### EurekaServer高可用配置
## cloud-gateway 服务网关
##### 将Zuul注册到服务注册中心,实现对服务的映射
##### Zuul通过Ribbon的反向代理(负载均衡配置),类似于nginx
##### Zuul的过滤器实现我们对外服务的安全控制
        * pre：在请求被路由之前调用
        * routing：在路由请求时候被调用
        * post：在routing和error过滤器之后被调用
        * error：处理请求时发生错误时被调用
# spring cloud项目框架整理
>spring cloud
>> spring cloud netflix Netflix公司一系列开源产品的包装
>>> Eureka 服务发现
>>> Hystrix 断路器,服务的守护者
>>> Zuul 智能路由
>>> Ribbon 客户端负载均衡
    
    
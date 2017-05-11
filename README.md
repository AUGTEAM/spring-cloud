# spring-cloud
spring boot &amp; cloud simple code
# module 介绍
boot-demo spring boot简单案例
    包括模板引擎、datasource、JPA、swagger2的使用。轻松简单的构建web应用
cloud-config 配置服务器
    管理git上的配置文件
    管理本地配置文件
    将自身（配置服务器）注册到注册中心，供应用通过注册中心拉取配置，也可实现配置服务器的高可用
cloud-config-client 配置获取客户端
    通过注册中心发现配置服务器拉取配置信息
cloud-consumer 服务消费
    RestTemplate实例通过Ribbon实现在客户端对服务调用的负载均衡(软负载)
    Feign对服务的消费和调用,Spring Cloud为Feign增加了对Spring MVC注解的支持，还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现
    Hystrix断路由在以上两种模式下的使用
    spring cloud零配置,对服务接口零引用的消费
cloud-provider 服务提供者
    
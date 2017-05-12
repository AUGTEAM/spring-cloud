# [spring-cloud](http://projects.spring.io/spring-cloud/)
##### spring boot以及spring cloud的demo以及简单总结介绍
##### 更多介绍请参考官方文档: http://projects.spring.io/spring-cloud
##### spring cloud 中文网: https://springcloud.cc/
## spring boot
##### 为了简化产品及的spring应用和服务,简化了配置文件,使用嵌入式web服务器,诸多开箱即用的微服务功能
##### 4大特性:auto-configuration(零配置),starters(简化依赖),cli(Command Line Interface 快速构建),actuator(应用自省,监控,统计)
## spring cloud
##### 微服务架构,轻松实现分布式的服务架构.提供了分布式系统的
##### 配置管理(Spring Cloud Config)
##### 服务发现(Eureka)
##### 断路器(Hystrix)
##### 智能路由(Zuul)
##### 控制总线(Spring Cloud Bus)等等开发工具包
##### 和spring boot无缝衔接到一起.拥有spring boot的一切特性.
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
##### 将Zuul注册到服务注册中心,可实现对服务的映射
##### Zuul的过滤器实现我们对外服务的安全控制
        * pre：在请求被路由之前调用,比如身份验证，在集群中选择请求的Origin Server，记log等
        * routing：在路由请求时候被调用,发送给Origin Server的用户请求在这类过滤器中build
        * post：在routing和error过滤器之后被调用,比如在返回的response上面加response header，做各种统计等。并在该过滤器中把response返回给客户
        * error：处理请求时发生错误时被调用
        * 客户定制：比如我们可以定制一种STATIC类型的过滤器，用来模拟生成返回给客户的response
##### Zuul过滤器之后,路由给Ribbon的反向代理(负载均衡)配置,类似于nginx的功能,ribbon的配置参考ribbon-simple.properties
# spring cloud项目框架整理
>spring cloud
>> spring cloud netflix Netflix公司一系列开源产品的包装
>>> Eureka 服务发现
>>> Hystrix 断路器,服务的守护者
>>> Zuul 智能路由
>>> Ribbon 客户端负载均衡
    
    
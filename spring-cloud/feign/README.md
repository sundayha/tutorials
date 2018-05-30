# 工程说明
1. `consul-customer-feign` 为服务消费者
2. `consul-service-feign` 服务
3. `consul-service1-feign` 服务1

# 实现功能
1. `feign` 集成了 `ribbon` 客户端负载均衡，所以自带负载均衡
2. 使用 `feign` 进行 `GET POST` 调用注册中心中的服务
3. 使用熔断设置，如果请求超时或者出错，做些后续的操作
4. 使用 `feign` 对继承的支持

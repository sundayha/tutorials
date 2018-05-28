# 安装 consul
1. 去官网下载`consul`
2. 解压出来放在`/opt/`下，并加入环境变量
3. `consul agent -dev`启动`consul`服务。
   由于启动后`consul`提供服务发现页面，不需要像`eureka` 那样去设置只管启动就好，会自动发现服务
# 简介
1. consul-customer 为服务消费者
2. consul-service 服务
3. consul-service1 服务1

# 实现功能
1. `consul`服务注册
2. 心跳检测
3. 客户端负载均衡
4. `GET`和`POST`带参数请求
1.项目采用  springboot+springMvc+mybatis+layui+jquery构建

<h3>2.项目开发中问题总结：</h3>
    1.静态文件根路径配置
   
    静态文件请求匹配方式：spring.mvc.static-path-pattern=/**
    
    修改默认的静态寻址资源目录 多个使用逗号分隔
    
    spring.resources.static-locations = classpath:/META-INF/resources/
                                       ,classpath:/resources/
                                       ,classpath:/static/
                                       ,classpath:/public/
                                       ,classpath:/templates/


   2.layui.open页面跳转传参的问题
   
    layer.open({
        type: 2,
        title: '员工信息',
        shadeClose: true,
        shade: 0.8,
        area: ['750px', '500px'],
        content: 'editemployee.html?lng='+p.getLngLat().lng+'&lat='+p.getLngLat().lat //iframe的url
     })
     
     页面获取content传过来的参数
     
     var str = window.location.href;//获取到跳转后的地址，然后处理得到传过来的参数
     
   3.Redis整合版本问题：
    
     Lettuce 和 Jedis 的定位都是Redis的client，所以他们当然可以直接连接redis server。
     Jedis在实现上是直接连接的redis server，如果在多线程环境下是非线程安全的，这个时候只有使用连接池，
     为每个Jedis实例增加物理连接。
     Lettuce的连接是基于Netty的，连接实例（StatefulRedisConnection）可以在多个线程间并发访问，
     应为StatefulRedisConnection是线程安全的，所以一个连接实例（StatefulRedisConnection）就可以满足多线程环境下的并发访问，
     当然这个也是可伸缩的设计，一个连接实例不够的情况也可以按需增加连接实例。
     
     
   4.连接阿里云mysql：
        
        首先要在防火墙开3306端口，或者直接关闭防火墙，然后在出方向和入方向都创建mysql安全组，
        然后连接阿里云公网IP加3306端口号，即可连接成功。
        
        Linux服务器执行sql文件，在sql文件所在目录下，进入mysql，mysql>source name.sql;
     
     
     
     
     
     
     


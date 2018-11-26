1.项目采用  springboot+springMvc+mybatis构建

<h3>2.项目开发中问题总结：</h3>
    1.静态文件根路径配置
   
    静态文件请求匹配方式：spring.mvc.static-path-pattern=/**
    
    修改默认的静态寻址资源目录 多个使用逗号分隔
    
    spring.resources.static-locations = classpath:/META-INF/resources/
                                       ,classpath:/resources/
                                       ,classpath:/static/
                                       ,classpath:/public/
                                       ,classpath:/templates/





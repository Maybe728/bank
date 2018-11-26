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
     
     
     
     
     
     
     


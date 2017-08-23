package com.modao.order_consume.controller;


import com.modao.order_api.model.User;
import com.modao.order_consume.service.IHelloWorldHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldConsume {
    @Autowired
    IHelloWorldHelloService helloWorldHelloService;

    //测试方法
    @RequestMapping(value = "/helloWorldConsumer",method = RequestMethod.GET)
    public String helloWorldConsume(){
        StringBuilder sb=new StringBuilder();
        sb.append(helloWorldHelloService.hello()).append("\n");
        sb.append(helloWorldHelloService.hello("xp")).append("\n");
        sb.append(helloWorldHelloService.hello("xp",25)).append("\n");
        sb.append(helloWorldHelloService.hello(new User("xp",25))).append("\n");
        return sb.toString();
    }
}

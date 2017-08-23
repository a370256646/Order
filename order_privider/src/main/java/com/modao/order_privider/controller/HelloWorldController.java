package com.modao.order_privider.controller;


import com.modao.order_api.model.User;
import com.modao.order_api.service.IHelloService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController  implements IHelloService {

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String hello(String name) {
        return "hello,"+name;
    }

    @Override
    public String hello(String name, Integer age) {
        return "this is header param,name="+name+",age="+age;
    }

    @Override
    public String hello(User user) {
        return "this is  body param,name="+user.getName()+",age="+user.getAge();
    }
}

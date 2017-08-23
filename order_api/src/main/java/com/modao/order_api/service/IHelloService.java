package com.modao.order_api.service;


import com.modao.order_api.model.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/helloWorld")
public interface IHelloService {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    String hello();

    //feign绑定参数示例,不要求方法名和接口提供的方法名称一致
    @RequestMapping(value="/hello-param",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello-headerParam",method = RequestMethod.GET)
    String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello-bodyParam",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}

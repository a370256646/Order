package com.modao.order_consume.service;

import com.modao.order_api.service.IHelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "ORDER-PROVIDER")
public interface IHelloWorldHelloService extends IHelloService {
}

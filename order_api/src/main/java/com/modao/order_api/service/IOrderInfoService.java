package com.modao.order_api.service;

import com.modao.order_api.model.OrderInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * orderInfo接口类
 */
@RequestMapping("/orderInfo")
public interface IOrderInfoService {
    //提供方法   1.增加订单  2.查看订单  3.修改订单(暂不做)  4.删除订单(暂不做)

    /**
     * 增加订单
     * @param orderInfo 订单内容
     */
    @RequestMapping("/addOrder")
    public void addOrderInfo(@RequestParam OrderInfo orderInfo);

    /**
     * 查看订单,根据id或是用户id查看
     * @param orderId 订单id
     */
    @RequestMapping("/getOrder")
    public OrderInfo getOrderInfo(@RequestParam String orderId);
}

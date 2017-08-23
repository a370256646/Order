package com.modao.order_api.service;

import com.modao.order_api.model.OrderProductInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 订单购买页接口定义规范
 */
@RequestMapping("/OrderProductInfo")
public interface IOrderProductInfoService {
    //提供方法: 1.增加订购系统-版本关联数据   2.删除订购系统-版本关联数据  3.修改订购系统-版本关联数据  4.查看系统-版本关联数据

    /**
     * 根据传入的appcode定位一条订购系统-版本数据
     * @param app_code 系统标识,如TAOKE,ORDER等
     */
    @RequestMapping("/getOrderProductInfo")
    public OrderProductInfo getOrderProductInfo(@RequestParam String app_code);

    /**
     * 创建一条新的订购系统-版本数据
     * @param orderProductInfo 订购系统-版本数据
     */
    @RequestMapping("/addOrderProductInfo")
    public void addOrderProductInfo(@RequestParam OrderProductInfo orderProductInfo);

    /**
     * 修改一条订购系统-版本数据
     * @param orderProductInfo  修改之后的订购系统-版本数据
     */
    @RequestMapping("/mergeOrderProductInfo")
    public void mergeOrderProductInfo(@RequestParam OrderProductInfo orderProductInfo);
}

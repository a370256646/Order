package com.modao.order_api.repository;

import com.modao.order_api.model.OrderProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderProductInfoRepository extends JpaRepository<OrderProductInfo,String> {

}

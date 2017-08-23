package com.modao.order_api.repository;


import com.modao.order_api.model.OrderInfo;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderInfoRepository extends JpaRepository<OrderInfo,String> {
        @Query(value="select * from order_detail where account like '%?1%' limit ?2,?3",nativeQuery =true)
        public List<OrderInfo> getOrderDetailByAccount(String account, int startRow, int pageSize);

        public List<OrderInfo> getOrderDetailByAccountOrderByCreateTimeDesc(String account);

        //原生sql
        @Query(value ="select * from order_detail limit ?1,?2",nativeQuery =true)
        public List<OrderInfo> getOrderDetails(int startRow,int pageSize);
}

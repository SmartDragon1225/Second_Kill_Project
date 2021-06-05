package com.tian.second_project.dao;

import com.tian.second_project.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {
    //数据插入操作
    void createOrder(Order order);//创建订单信息
}

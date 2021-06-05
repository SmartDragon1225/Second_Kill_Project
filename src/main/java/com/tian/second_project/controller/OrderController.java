package com.tian.second_project.controller;

import com.tian.second_project.service.OrderSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderSrvice orderSrvice;
    @RequestMapping("/shop/{id}")
    public String kill(@PathVariable("id") int id){
        System.out.println("秒杀的商品id为"+id);
        try {
            int killId = orderSrvice.kill(id);
            return "秒杀成功，订单id为"+String.valueOf(killId);
        }catch (Exception e){
            e.getMessage();
            return e.getMessage();
        }
    }
}

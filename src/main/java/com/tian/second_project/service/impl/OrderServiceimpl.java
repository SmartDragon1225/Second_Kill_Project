package com.tian.second_project.service.impl;

import com.tian.second_project.dao.OrderDao;
import com.tian.second_project.dao.StockDao;
import com.tian.second_project.pojo.Order;
import com.tian.second_project.pojo.Stock;
import com.tian.second_project.service.OrderSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceimpl implements OrderSrvice {
    @Autowired
    StockDao stockDao;
    @Autowired
    OrderDao orderDao;
    @Override
    public int kill(int id) {
        //检验库存
        Stock stock = check(id);
        //更新库存
        updateSale(stock);
        //创建订单信息
        return createOrder(stock);
    }

    //检验库存
    private Stock check(int id){
        Stock stock = stockDao.checkStock(id);
        if(stock.getSale() == (stock.getCount())){
            throw new RuntimeException("库存不足！");
        }
        return stock;
    }

    //扣除库存
    private void updateSale(Stock stock){
        stock.setSale(stock.getSale()+1);
        stockDao.updateSale(stock);
    }

    //创建订单
    private int createOrder(Stock stock){
        Order order = new Order();
        //order.setId(stock.getId()+1);
        order.setSid(stock.getId());
        order.setName(stock.getName());
        order.setCreate_time(new Date());
        orderDao.createOrder(order);
        return order.getId();
    }
}

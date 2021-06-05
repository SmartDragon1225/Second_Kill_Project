package com.tian.second_project.dao;

import com.tian.second_project.pojo.Stock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockDao {

    Stock checkStock(int id);//校验库存

    int updateSale(Stock stock);//根据id扣除库存
}

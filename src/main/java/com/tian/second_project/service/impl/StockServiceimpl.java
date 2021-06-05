package com.tian.second_project.service.impl;

import com.tian.second_project.dao.StockDao;
import com.tian.second_project.pojo.Stock;
import com.tian.second_project.service.StockService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceimpl implements StockService {
    @Autowired
    StockDao stockDao;

    @Override
    public Stock checkStock(int id) {
        return stockDao.checkStock(id);
    }
}

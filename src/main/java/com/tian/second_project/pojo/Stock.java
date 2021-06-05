package com.tian.second_project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    private int id;
    private String name;
    private int count;
    private int sale;
    private int version;
}

package com.tian.second_project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private int id;
    private int sid;
    private String name;
    private Date create_time;
}

package com.southwind.entity;

import lombok.Data;

/**
 * Created by 小冯 on 2023/7/9 15:09
 */
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
}

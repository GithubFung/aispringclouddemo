package com.southwind.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by 小冯 on 2023/7/9 20:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {
    private int code;
    private String mgs;
    private int count;
    private List<Menu> data;
}

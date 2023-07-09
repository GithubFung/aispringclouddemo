package com.southwind.controller;

import com.southwind.entity.MenuVO;
import com.southwind.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 小冯 on 2023/7/9 0:16
 */
@RestController
@RequestMapping("/menu")
public class MenuHandler {
    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/index")
    public String index() {
        return "menu的端口：" + this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit) {
        return new MenuVO(0, "", 100, menuRepository.findAll(index, limit));
    }
}

package com.southwind.repository;

import com.southwind.entity.Menu;

import java.util.List;

/**
 * Created by 小冯 on 2023/7/9 15:12
 */
public interface MenuRepository {
    public List<Menu> findAll(int index, int limit);

    public int count();

    public Menu findById(long id);

    public void save(Menu menu);

    public void update(Menu menu);

    public void deleteById(long id);
}

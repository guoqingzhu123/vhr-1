package com.niit.vhr1.mapper;


import com.niit.vhr1.model.Menu;

import java.util.List;

/**
 * @Auther:zhugq
 * @Date: 2020/04/22/10:49
 */
public interface MenuMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrId(Integer id);
}
package com.niit.vhr1.mapper;

import com.niit.vhr1.model.MenuRole;

/**
 * @Auther:zhugq
 * @Date: 2020/04/22/10:50
 */
public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);
}

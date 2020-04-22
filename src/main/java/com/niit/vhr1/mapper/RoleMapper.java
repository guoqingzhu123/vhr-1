package com.niit.vhr1.mapper;

import com.niit.vhr1.model.Role;

/**
 * @Auther:zhugq
 * @Date: 2020/04/22/10:50
 */
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}

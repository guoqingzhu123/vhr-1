package com.niit.vhr1.mapper;

import com.niit.vhr1.model.HrRole;

/**
 * @Auther:zhugq
 * @Date: 2020/04/22/10:49
 */
public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);
}

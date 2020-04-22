package com.niit.vhr1.service;

import com.niit.vhr1.mapper.MenuMapper;
import com.niit.vhr1.model.Hr;
import com.niit.vhr1.model.Menu;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @Auther:zhugq
 * @Date: 2020/04/22/10:56
 */
@Service
public class MenuService{
    @Resource
    MenuMapper menuMapper;

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}

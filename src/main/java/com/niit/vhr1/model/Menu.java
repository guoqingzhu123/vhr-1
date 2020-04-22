package com.niit.vhr1.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther:zhugq
 * @Date: 2020/04/22/10:52
 */
@Data
public class Menu implements Serializable {
    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    private Integer parentId;

    private Boolean enabled;

    private Meta meta;

    private List<Menu> children;

    private List<Role> roles;
}

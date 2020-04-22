package com.niit.vhr1.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther:zhugq
 * @Date: 2020/04/22/10:52
 */
@Data
public class MenuRole implements Serializable {
    private Integer id;

    private Integer mid;

    private Integer rid;

    private static final long serialVersionUID = 1L;
}
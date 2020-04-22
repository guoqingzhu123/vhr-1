package com.niit.vhr1.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther:zhugq
 * @Date: 2020/04/22/10:51
 */
@Data
public class HrRole implements Serializable {
    private Integer id;

    private Integer hrid;

    private Integer rid;
}

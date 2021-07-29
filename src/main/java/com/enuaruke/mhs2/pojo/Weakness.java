package com.enuaruke.mhs2.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 弱点
 * @author 
 */
@Data
public class Weakness implements Serializable {
    private Integer 编号;

    private String 名称;

    private String 攻击属性;

    private String 属性弱点;

    private String 部位弱点;

    private String 招式弱点;

    private String 备注;

    private static final long serialVersionUID = 1L;
}
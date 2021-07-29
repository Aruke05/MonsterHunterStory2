package com.enuaruke.mhs2.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 基因表
 * @author 
 */
@Data
public class Gene implements Serializable {
    private Integer 基因编号;

    private String 基因名称;

    private String 技能类型;

    private String 技能属性;

    private String 必要等级;

    private String 基因出处;

    private String 技能名称;

    private String 技能描述;

    private String 羁绊消耗;

    private String f9;

    private String f10;

    private String f11;

    private static final long serialVersionUID = 1L;
}
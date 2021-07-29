package com.enuaruke.mhs2.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 怪物出招表
 * @author 
 */
@Data
public class 怪物出招表 implements Serializable {
    private String 怪物名;

    private String 普通状态;

    private String 愤怒状态;

    private String 特殊状态;

    private String 部位弱点;

    private String f6;

    private String f7;

    private String f8;

    private static final long serialVersionUID = 1L;
}
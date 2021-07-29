package com.enuaruke.mhs2.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 怪物详细资料
 * @author 
 */
@Data
public class Monster implements Serializable {
    private String 编号;

    private String 名称;

    private String 稀有度;

    private String 栖息地;

    private String 归巢条件;

    private String 下位获取素材;

    private String 下位部位信息;

    private String 上位获取素材;

    private String 上位部位信息;

    private static final long serialVersionUID = 1L;
}
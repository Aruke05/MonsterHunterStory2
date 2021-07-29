package com.enuaruke.mhs2.service;

import com.enuaruke.mhs2.pojo.Weakness;

import java.util.List;
import java.util.Map;

/**
 * @author Aruke
 * @date 2021/7/22 9:42
 * @info
 */
public interface WeaknessService {
    List<Weakness> select(String name);

    Object selectByIds(List<Integer> ids);

    Map<String, List<Weakness>> selectByZoneId(Integer zoneId);
}

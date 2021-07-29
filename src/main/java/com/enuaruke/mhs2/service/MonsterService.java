package com.enuaruke.mhs2.service;

import com.enuaruke.mhs2.pojo.Monster;
import com.enuaruke.mhs2.pojo.Weakness;
import com.enuaruke.mhs2.pojo.Zone;

import java.util.List;
import java.util.Map;

/**
 * @author Aruke
 * @date 2021/7/23 14:26
 * @info
 */
public interface MonsterService {
    List<Monster> selectByTerm(String name, String materialName);

    List<Zone> selectZone();
}

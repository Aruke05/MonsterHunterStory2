package com.enuaruke.mhs2.service.impl;

import com.enuaruke.mhs2.mapper.WeaknessMapper;
import com.enuaruke.mhs2.pojo.Weakness;
import com.enuaruke.mhs2.pojo.WeaknessExample;
import com.enuaruke.mhs2.service.WeaknessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Aruke
 * @date 2021/7/22 9:42
 * @info
 */
@Service
public class WeaknessServiceImpl implements WeaknessService {

    @Autowired
    private WeaknessMapper weaknessMapper;


    @Override
    public List<Weakness> select(String name) {
        WeaknessExample example = new WeaknessExample();
        if(name != null && name != "")
            example.createCriteria().and名称Like("%" + name + "%");
        return weaknessMapper.selectByExample(example);
    }

    @Override
    public Object selectByIds(List<Integer> ids) {
        WeaknessExample e = new WeaknessExample();
        WeaknessExample.Criteria criteria = e.createCriteria();
        criteria.and编号In(ids);
        return weaknessMapper.selectByExample(e);
    }

    @Override
    public Map<String, List<Weakness>> selectByZoneId(Integer zoneId) {
        Map<String, List<Weakness>> weaknessMap = new HashMap<>();

        List<Weakness> normalMonster = weaknessMapper.selectNormalByZoneId(zoneId);
        List<Weakness> finalMonster = weaknessMapper.selectFinalByZoneId(zoneId);

        weaknessMap.put("normal", normalMonster);
        weaknessMap.put("final",finalMonster);

        return weaknessMap;
    }
}

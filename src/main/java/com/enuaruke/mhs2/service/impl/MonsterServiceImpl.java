package com.enuaruke.mhs2.service.impl;

import com.enuaruke.mhs2.mapper.MonsterMapper;
import com.enuaruke.mhs2.pojo.Monster;
import com.enuaruke.mhs2.pojo.MonsterExample;
import com.enuaruke.mhs2.pojo.Weakness;
import com.enuaruke.mhs2.pojo.Zone;
import com.enuaruke.mhs2.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Aruke
 * @date 2021/7/23 14:26
 * @info
 */
@Service
public class MonsterServiceImpl implements MonsterService {

    @Autowired
    private MonsterMapper monterMapper;


    @Override
    public List<Monster> selectByTerm(String name, String materialName) {
        MonsterExample e = new MonsterExample();
        MonsterExample.Criteria criteria = e.createCriteria();
        if(name != null && name != "")
            criteria.and名称Like("%" + name + "%");
        if(materialName != null && materialName != ""){
            materialName = "%" + materialName + "%";
            criteria.and上位获取素材Like(materialName)
                    .and上位部位信息Like(materialName)
                    .and下位获取素材Like(materialName)
                    .and下位部位信息Like(materialName);
        }
        return monterMapper.selectByExample(e);
    }

    @Override
    public List<Zone> selectZone() {
        List<Zone> zoneList = monterMapper.selectZone();
        return zoneList;
    }
}

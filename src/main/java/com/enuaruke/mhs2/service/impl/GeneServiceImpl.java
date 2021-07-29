package com.enuaruke.mhs2.service.impl;

import com.enuaruke.mhs2.mapper.GeneMapper;
import com.enuaruke.mhs2.pojo.Gene;
import com.enuaruke.mhs2.pojo.GeneExample;
import com.enuaruke.mhs2.service.GeneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aruke
 * @date 2021/7/23 15:46
 * @info
 */
@Service
public class GeneServiceImpl implements GeneService {

    @Autowired
    private GeneMapper geneMapper;

    @Override
    public List<Gene> selectGene(String geneName, String skillClass, String skillProperty, String name) {
        GeneExample e = new GeneExample();
        GeneExample.Criteria criteria = e.createCriteria();
        if(geneName != null)
            criteria.and基因名称Like("%" + geneName + "%");
        if(skillClass != null)
            criteria.and技能类型Like("%" + skillClass + "%");
        if(skillProperty != null)
            criteria.and技能属性Like("%" + skillProperty + "%");
        if(name != null)
            criteria.and基因出处Like("%" + name + "%");
        return geneMapper.selectByExample(e);
    }
}

package com.enuaruke.mhs2.service;

import com.enuaruke.mhs2.pojo.Gene;

import java.util.List;

/**
 * @author Aruke
 * @date 2021/7/23 15:46
 * @info
 */
public interface GeneService {
    List<Gene> selectGene(String geneName, String skillClass, String skillProperty, String name);
}

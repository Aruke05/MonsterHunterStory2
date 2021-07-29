package com.enuaruke.mhs2.mapper;

import com.enuaruke.mhs2.pojo.Gene;
import com.enuaruke.mhs2.pojo.GeneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneMapper {
    long countByExample(GeneExample example);

    int deleteByExample(GeneExample example);

    int deleteByPrimaryKey(Integer 基因编号);

    int insert(Gene record);

    int insertSelective(Gene record);

    List<Gene> selectByExample(GeneExample example);

    Gene selectByPrimaryKey(Integer 基因编号);

    int updateByExampleSelective(@Param("record") Gene record, @Param("example") GeneExample example);

    int updateByExample(@Param("record") Gene record, @Param("example") GeneExample example);

    int updateByPrimaryKeySelective(Gene record);

    int updateByPrimaryKey(Gene record);
}
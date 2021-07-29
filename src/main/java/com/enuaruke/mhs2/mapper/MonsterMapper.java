package com.enuaruke.mhs2.mapper;

import com.enuaruke.mhs2.pojo.Monster;
import com.enuaruke.mhs2.pojo.MonsterExample;
import java.util.List;

import com.enuaruke.mhs2.pojo.Zone;
import org.apache.ibatis.annotations.Param;

public interface MonsterMapper {
    long countByExample(MonsterExample example);

    int deleteByExample(MonsterExample example);

    int deleteByPrimaryKey(String 编号);

    int insert(Monster record);

    int insertSelective(Monster record);

    List<Monster> selectByExample(MonsterExample example);

    Monster selectByPrimaryKey(String 编号);

    int updateByExampleSelective(@Param("record") Monster record, @Param("example") MonsterExample example);

    int updateByExample(@Param("record") Monster record, @Param("example") MonsterExample example);

    int updateByPrimaryKeySelective(Monster record);

    int updateByPrimaryKey(Monster record);

    List<Zone> selectZone();
}
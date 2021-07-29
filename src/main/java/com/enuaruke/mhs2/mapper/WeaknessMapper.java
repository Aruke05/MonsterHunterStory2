package com.enuaruke.mhs2.mapper;

import com.enuaruke.mhs2.pojo.Weakness;
import com.enuaruke.mhs2.pojo.WeaknessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeaknessMapper {
    long countByExample(WeaknessExample example);

    int deleteByExample(WeaknessExample example);

    int deleteByPrimaryKey(Integer 编号);

    int insert(Weakness record);

    int insertSelective(Weakness record);

    List<Weakness> selectByExample(WeaknessExample example);

    Weakness selectByPrimaryKey(Integer 编号);

    int updateByExampleSelective(@Param("record") Weakness record, @Param("example") WeaknessExample example);

    int updateByExample(@Param("record") Weakness record, @Param("example") WeaknessExample example);

    int updateByPrimaryKeySelective(Weakness record);

    int updateByPrimaryKey(Weakness record);

    List<Weakness> selectNormalByZoneId(Integer zoneId);

    List<Weakness> selectFinalByZoneId(Integer zoneId);
}
package com.enuaruke.mhs2.mapper;

import com.enuaruke.mhs2.pojo.怪物出招表;
import com.enuaruke.mhs2.pojo.怪物出招表Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface 怪物出招表Mapper {
    long countByExample(怪物出招表Example example);

    int deleteByExample(怪物出招表Example example);

    int insert(怪物出招表 record);

    int insertSelective(怪物出招表 record);

    List<怪物出招表> selectByExample(怪物出招表Example example);

    int updateByExampleSelective(@Param("record") 怪物出招表 record, @Param("example") 怪物出招表Example example);

    int updateByExample(@Param("record") 怪物出招表 record, @Param("example") 怪物出招表Example example);
}
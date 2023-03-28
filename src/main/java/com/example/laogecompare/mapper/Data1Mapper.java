package com.example.laogecompare.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.laogecompare.entity.Data1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Data1Mapper  extends BaseMapper<Data1> {
    List<Data1> selectCompareList(@Param("table1") String table1, @Param("key1") String key1, @Param("table2") String table2,@Param("key2")  String key2);
}

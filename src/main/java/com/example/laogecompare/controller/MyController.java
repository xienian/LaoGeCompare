package com.example.laogecompare.controller;

import com.example.laogecompare.entity.Data1;
import com.example.laogecompare.mapper.Data1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Value("${table1}")
    private String table1;

    @Value("${key1}")
    private String key1;

    @Value("${table2}")
    private String table2;

    @Value("${key2}")
    private String key2;

    @Autowired
    private Data1Mapper userMapper;

    @GetMapping("/data")
    public List<Data1> getData() {
        return userMapper.selectCompareList(table1,key1,table2,key2);
    }
}

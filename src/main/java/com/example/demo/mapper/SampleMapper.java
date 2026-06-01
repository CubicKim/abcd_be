package com.example.demo.mapper;

import com.example.demo.model.SampleVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleMapper {

    @Select("SELECT id, title, content FROM abcd_sample LIMIT 1")
    SampleVO getFirstSample();
}
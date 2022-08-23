package com.example.demo.form.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @Author liang.guo
 */
@Mapper
public interface ZzBaseModelMapper {

    /**
     * 通过主键获取工单信息
     * @param id 主键ID
     * @return 工单Map对象
     */
    Map<String, Object> getByPrimaryKey(String id);

}

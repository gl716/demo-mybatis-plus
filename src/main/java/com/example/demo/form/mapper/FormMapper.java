package com.example.demo.form.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.form.entity.Form;
import com.example.demo.mapper.BootstrapTemplate;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liang.guo
 * @since 2022年08月18日 15:38
 **/
@Mapper
public interface FormMapper extends BaseMapper<Form> {
}

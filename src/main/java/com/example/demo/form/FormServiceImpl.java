package com.example.demo.form;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.form.entity.Form;
import com.example.demo.form.mapper.FormMapper;
import org.springframework.stereotype.Service;

/**
 * @author liang.guo
 * @since 2022年08月18日 15:39
 **/
@Service
public class FormServiceImpl extends ServiceImpl<FormMapper, Form> implements IFormService {


}
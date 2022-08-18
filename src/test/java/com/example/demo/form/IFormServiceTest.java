package com.example.demo.form;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.form.entity.Form;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class IFormServiceTest {

    @Autowired
    FormServiceImpl service;

    @Test
    public void testPage() throws JsonProcessingException {
        Form f = new Form();
        f.setName("服务表单（标准）");
        f.setTenantId("000000");
        Page<Form> page = new Page<>(1, 10);
        IPage<Form> pages = service.page(page, new QueryWrapper<>(f));
        log.info("打印总数：{}", pages.getTotal());
        ObjectMapper om = new ObjectMapper();
        log.info(om.writeValueAsString(pages));
    }

}
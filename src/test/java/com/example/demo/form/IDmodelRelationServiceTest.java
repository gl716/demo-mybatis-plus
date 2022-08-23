package com.example.demo.form;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.form.entity.DmodelRelation;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class IDmodelRelationServiceTest {

    @Autowired
    DmodelRelationServiceImpl service;

    @Test
    public void testLongListQuery() {
        List<Long> input = Arrays.asList(1433615380272316417L, 1506833925159923713L);
        System.out.println(service.list(new LambdaQueryWrapper<DmodelRelation>().in(DmodelRelation::getEntityId, input)));
        System.out.println(service);
    }
}
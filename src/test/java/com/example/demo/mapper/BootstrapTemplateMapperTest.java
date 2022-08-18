package com.example.demo.mapper;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BootstrapTemplateMapperTest extends TestCase {

    @Autowired
    BootstrapTemplateMapper mapper;

    @Test
    public void testQueryOne() {

        BootstrapTemplate bootstrapTemplate = mapper.selectById(1425037795162533890l);
        System.out.println(bootstrapTemplate);
        log.debug("debug ###################");
        log.info("info ######################");
        log.warn("warn #########################");
        log.error("error #########################");
    }
}
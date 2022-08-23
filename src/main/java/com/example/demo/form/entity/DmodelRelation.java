package com.example.demo.form.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author liang.guo
 * @since 2022年08月18日 15:35
 **/
@Data
@TableName("itsm_ci_dmodel_relation")
public class DmodelRelation {
    private String entityId;

    private String entityName;

    private String entityType;
}

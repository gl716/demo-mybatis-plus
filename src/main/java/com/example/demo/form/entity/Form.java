package com.example.demo.form.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author liang.guo
 * @since 2022年08月18日 15:35
 **/
@Data
@TableName("itsm_form")
@ApiModel(value = "Form对象", description = "表单管理")
public class Form  {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;
    /**
     * 工单类型
     */
    @ApiModelProperty(value = "工单类型")
    private String orderType;

    /**
     * 表单描述
     */
    @ApiModelProperty(value = "表单描述")
    private String remark;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 权限：hidden(隐藏)，read（只能查看），update(查看，修改), delete(查看，修改，删除)
     */
    @ApiModelProperty(value = "权限：hidden(隐藏)，read（只能查看），update(查看，修改), delete(查看，修改，删除)")
    private String chmod;

    /**
     * 表单类型，1表示普通表单，2表示物资表单
     */
    private Integer type;

    private String tenantId;
}

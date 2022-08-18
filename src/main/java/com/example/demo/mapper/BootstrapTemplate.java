/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package com.example.demo.mapper;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 智能引导表实体类
 *
 * @author Leon
 * @since 2021-07-20
 */
@TableName("itsm_bootstrap_template")
public class BootstrapTemplate  {

	private static final long serialVersionUID = 1L;

	Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 智能引导名称
	 */
	private String name;

	/**
	 * 工单类别
	 */
	private String orderType;
	/**
	 * 服务条目
	 */
	private Long serveItemId;
	/**
	 * 流程定义
	 */
	private String procDefId;
	/**
	 * 流程定义
	 */
	private String procDefKey;
	/**
	 * 流程定义名称
	 */
	private String procDefName;
	/**
	 * 表单名称
	 */
	private String formName;
	/**
	 * 服务等级协议
	 */
	private Long serviceAgreementId;
	/**
	 * 运营等级协议名称
	 */
	private String serviceAgreementName;
	/**
	 * 运营等级协议
	 */
	private Long operationAgreementId;
	/**
	 * 运营等级协议名称
	 */
	private String operationAgreementName;
	/**
	 * 运营时间
	 */
	private Long workTimeId;
	/**
	 * 是否发送问卷
	 */
	private Integer isQuestionnaire;
	/**
	 * 问卷
	 */
	private Long questionnaireId;
	/**
	 * 问卷名称
	 */
	private String questionnaireName;
	/**
	 * 是否默认
	 */
	private Integer isDefault;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Long getServeItemId() {
		return serveItemId;
	}

	public void setServeItemId(Long serveItemId) {
		this.serveItemId = serveItemId;
	}

	public String getProcDefId() {
		return procDefId;
	}

	public void setProcDefId(String procDefId) {
		this.procDefId = procDefId;
	}

	public String getProcDefKey() {
		return procDefKey;
	}

	public void setProcDefKey(String procDefKey) {
		this.procDefKey = procDefKey;
	}

	public String getProcDefName() {
		return procDefName;
	}

	public void setProcDefName(String procDefName) {
		this.procDefName = procDefName;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public Long getServiceAgreementId() {
		return serviceAgreementId;
	}

	public void setServiceAgreementId(Long serviceAgreementId) {
		this.serviceAgreementId = serviceAgreementId;
	}

	public String getServiceAgreementName() {
		return serviceAgreementName;
	}

	public void setServiceAgreementName(String serviceAgreementName) {
		this.serviceAgreementName = serviceAgreementName;
	}

	public Long getOperationAgreementId() {
		return operationAgreementId;
	}

	public void setOperationAgreementId(Long operationAgreementId) {
		this.operationAgreementId = operationAgreementId;
	}

	public String getOperationAgreementName() {
		return operationAgreementName;
	}

	public void setOperationAgreementName(String operationAgreementName) {
		this.operationAgreementName = operationAgreementName;
	}

	public Long getWorkTimeId() {
		return workTimeId;
	}

	public void setWorkTimeId(Long workTimeId) {
		this.workTimeId = workTimeId;
	}

	public Integer getIsQuestionnaire() {
		return isQuestionnaire;
	}

	public void setIsQuestionnaire(Integer isQuestionnaire) {
		this.isQuestionnaire = isQuestionnaire;
	}

	public Long getQuestionnaireId() {
		return questionnaireId;
	}

	public void setQuestionnaireId(Long questionnaireId) {
		this.questionnaireId = questionnaireId;
	}

	public String getQuestionnaireName() {
		return questionnaireName;
	}

	public void setQuestionnaireName(String questionnaireName) {
		this.questionnaireName = questionnaireName;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "BootstrapTemplate{" +
				"name='" + name + '\'' +
				", orderType='" + orderType + '\'' +
				", serveItemId=" + serveItemId +
				", procDefId='" + procDefId + '\'' +
				", procDefKey='" + procDefKey + '\'' +
				", procDefName='" + procDefName + '\'' +
				", formName='" + formName + '\'' +
				", serviceAgreementId=" + serviceAgreementId +
				", serviceAgreementName='" + serviceAgreementName + '\'' +
				", operationAgreementId=" + operationAgreementId +
				", operationAgreementName='" + operationAgreementName + '\'' +
				", workTimeId=" + workTimeId +
				", isQuestionnaire=" + isQuestionnaire +
				", questionnaireId=" + questionnaireId +
				", questionnaireName='" + questionnaireName + '\'' +
				", isDefault=" + isDefault +
				'}';
	}
}

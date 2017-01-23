package net.mamian.designpattern.原型模式;

/**
 *
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-23 23:27:15
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class AdvTemplate {
	//广告信名称
	private String advSubject ="XX银行国庆信用卡抽奖活动";
	//广告信内容
	private String advContext = "国庆抽奖活动通知：只要刷卡就送你1百万！....";

	public String getAdvSubject() {
		return advSubject;
	}

	public String getAdvContext() {
		return advContext;
	}
}
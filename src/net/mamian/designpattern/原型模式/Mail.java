package net.mamian.designpattern.原型模式;

/**
 *
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-23 23:30:50
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Mail implements Cloneable{
	private String receiver;//收件人
	private String subject;//邮件主题
	private String appellation;//称谓
	private String contxt;//邮件内容
	private String tail;//邮件的尾部，一般都是加上“XXX版权所有”等信息

	public Mail(AdvTemplate advTemplate) {
		this.subject = advTemplate.getAdvSubject();
		this.contxt = advTemplate.getAdvContext();
	}

	public Mail clone(){
		Mail mail = null;
		try{
			mail = (Mail)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return mail;
	}






	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAppellation() {
		return appellation;
	}
	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}
	public String getContxt() {
		return contxt;
	}
	public void setContxt(String contxt) {
		this.contxt = contxt;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}

}
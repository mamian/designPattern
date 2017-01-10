package net.mamian.designpattern.ԭ��ģʽ;

public class Mail implements Cloneable{
	private String receiver;//�ռ���
	private String subject;//�ʼ�����
	private String appellation;//��ν
	private String contxt;//�ʼ�����
	private String tail;//�ʼ���β����һ�㶼�Ǽ��ϡ�XXX��Ȩ���С�����Ϣ

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

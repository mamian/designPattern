package net.mamian.designpattern.��Ԫģʽ;

public class SignInfo {
	private String id;//������ԱID
	private String location;//����
	private String address;
	private String phone;
	
	
	public void printSignInfo(){
		System.out.println("������ԱID��"+id+"�����㣺"+location+"����ַ��"+address+"���绰��"+phone);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}

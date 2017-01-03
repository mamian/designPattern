package net.mamian.designpattern.享元模式;

public class SignInfo {
	private String id;//考试人员ID
	private String location;//考点
	private String address;
	private String phone;
	
	
	public void printSignInfo(){
		System.out.println("考试人员ID："+id+"，考点："+location+"，地址："+address+"，电话："+phone);
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

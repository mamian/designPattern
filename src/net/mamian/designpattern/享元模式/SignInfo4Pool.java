package net.mamian.designpattern.享元模式;

/*
 * 给SignInfo对象增加key属性：
 * */
public class SignInfo4Pool extends SignInfo{
	private String key;
	
	public SignInfo4Pool(String key){
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
}

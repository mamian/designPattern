package net.mamian.designpattern.备忘录模式;

public class Memento {
	private String mementoName;
	private String mementoAge;
	
	public Memento(String mementoName,String mementoAge){
		this.mementoName = mementoName;
		this.mementoAge = mementoAge;
	}
	
	
	public String getMementoName() {
		return mementoName;
	}
	public void setMementoName(String mementoName) {
		this.mementoName = mementoName;
	}
	public String getMementoAge() {
		return mementoAge;
	}
	public void setMementoAge(String mementoAge) {
		this.mementoAge = mementoAge;
	}
}

package net.mamian.designpattern.桥接模式;

public abstract class Brand {
	protected Soft soft;
	
	//或通过带参构造方法设置soft
	public void setSoft(Soft soft){
		this.soft = soft;
	}
	public abstract void brandRun();
}

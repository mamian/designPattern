package net.mamian.designpattern.�Ž�ģʽ;

public abstract class Brand {
	protected Soft soft;
	
	//��ͨ�����ι��췽������soft
	public void setSoft(Soft soft){
		this.soft = soft;
	}
	public abstract void brandRun();
}

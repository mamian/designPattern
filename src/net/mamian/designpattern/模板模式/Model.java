package net.mamian.designpattern.ģ��ģʽ;

public abstract class Model {
	protected abstract void start();
	protected abstract void alarm();
	protected abstract void stop();
	public final void run(){
		this.start();
		this.alarm();
		this.stop();
	}
}

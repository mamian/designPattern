package net.mamian.designpattern.Ä£°åÄ£Ê½;

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

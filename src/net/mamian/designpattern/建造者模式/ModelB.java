package net.mamian.designpattern.������ģʽ;

public class ModelB extends Model{

	@Override
	protected void start() {
		System.out.println("����B����");
	}

	@Override
	protected void alarm() {
		System.out.println("����B����");
	}

	@Override
	protected void stop() {
		System.out.println("����Bɲ��");
	}

}

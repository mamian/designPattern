package net.mamian.designpattern.����ģʽ;

public class PageGroup extends Group{
	@Override
	protected void find() {
		System.out.println("ҳ���飺�ҵ�ҳ���飡");
	}

	@Override
	protected void add() {
		System.out.println("ҳ���飺����һ��ҳ�棡");
	}

	@Override
	protected void delete() {
		System.out.println("ҳ���飺����һ��ҳ�棡");
	}

	@Override
	protected void change() {
		System.out.println("ҳ���飺�޸�һ��ҳ�棡");
	}

	@Override
	protected void exe() {
		System.out.println("ҳ���飺ִ�ж�ҳ��ĸ��ģ�");
	}
}

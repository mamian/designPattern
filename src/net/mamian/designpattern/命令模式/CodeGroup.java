package net.mamian.designpattern.����ģʽ;

public class CodeGroup extends Group{
	@Override
	protected void find() {
		System.out.println("�����飺�ҵ������飡");
	}

	@Override
	protected void add() {
		System.out.println("�����飺����һ�δ��룡");
	}

	@Override
	protected void delete() {
		System.out.println("�����飺����һ�δ��룡");
	}

	@Override
	protected void change() {
		System.out.println("�����飺�޸�һ�δ��룡");
	}

	@Override
	protected void exe() {
		System.out.println("�����飺ִ�жԴ���ĸ��ģ�");
	}
}

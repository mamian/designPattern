package net.mamian.designpattern.����ģʽ;

public class RequirementGroup extends Group{
	@Override
	protected void find() {
		System.out.println("�����飺�ҵ������飡");
	}

	@Override
	protected void add() {
		System.out.println("�����飺����һ������");
	}

	@Override
	protected void delete() {
		System.out.println("�����飺����һ������");
	}

	@Override
	protected void change() {
		System.out.println("�����飺�޸�һ������");
	}

	@Override
	protected void exe() {
		System.out.println("�����飺ִ�ж�����ĸ��ģ�");
	}
}

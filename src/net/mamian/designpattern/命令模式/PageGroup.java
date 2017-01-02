package net.mamian.designpattern.命令模式;

public class PageGroup extends Group{
	@Override
	protected void find() {
		System.out.println("页面组：找到页面组！");
	}

	@Override
	protected void add() {
		System.out.println("页面组：增加一个页面！");
	}

	@Override
	protected void delete() {
		System.out.println("页面组：减少一个页面！");
	}

	@Override
	protected void change() {
		System.out.println("页面组：修改一个页面！");
	}

	@Override
	protected void exe() {
		System.out.println("页面组：执行对页面的更改！");
	}
}

package net.mamian.designpattern.命令模式;

public class CodeGroup extends Group{
	@Override
	protected void find() {
		System.out.println("代码组：找到代码组！");
	}

	@Override
	protected void add() {
		System.out.println("代码组：增加一段代码！");
	}

	@Override
	protected void delete() {
		System.out.println("代码组：减少一段代码！");
	}

	@Override
	protected void change() {
		System.out.println("代码组：修改一段代码！");
	}

	@Override
	protected void exe() {
		System.out.println("代码组：执行对代码的更改！");
	}
}

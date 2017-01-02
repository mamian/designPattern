package net.mamian.designpattern.命令模式;

public class RequirementGroup extends Group{
	@Override
	protected void find() {
		System.out.println("需求组：找到需求组！");
	}

	@Override
	protected void add() {
		System.out.println("需求组：增加一条需求！");
	}

	@Override
	protected void delete() {
		System.out.println("需求组：减少一条需求！");
	}

	@Override
	protected void change() {
		System.out.println("需求组：修改一条需求！");
	}

	@Override
	protected void exe() {
		System.out.println("需求组：执行对需求的更改！");
	}
}

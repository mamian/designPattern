package net.mamian.designpattern.访问者模式;

public interface VisitorInterface {
	//首先定义我可以访问普通员工
	public void visit(CommonEmployee commonEmployee);
	//其次定义，我还可以访问部门经理
	public void visit(Manager manager);
}

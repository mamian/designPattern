package net.mamian.designpattern.������ģʽ;

public interface VisitorInterface {
	//���ȶ����ҿ��Է�����ͨԱ��
	public void visit(CommonEmployee commonEmployee);
	//��ζ��壬�һ����Է��ʲ��ž���
	public void visit(Manager manager);
}

package net.mamian.designpattern.����ģʽ;
/*
 * ��������༰����ʵ���ࣨ�����顢ҳ���顢�����飩
 * ���������༰���ʵ���ࣨ���������������ҳ������ȣ�
 * 
 * ����������࣬��������һ��˽�е������Ա��һ�������������˷�����ִ��˽�������Ա��ĳ��������
 * */
public class Client {
	public static void main(String[] args){
		Invoker invoker = new Invoker();
		
		Command addRequirementCommand = new AddRequirementCommand();
		invoker.setCommand(addRequirementCommand);
		invoker.action();
		
		Command deletePageCommand = new DeletePageCommand();
		invoker.setCommand(deletePageCommand);
		invoker.action();
	}
}

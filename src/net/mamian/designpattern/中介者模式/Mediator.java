package net.mamian.designpattern.�н���ģʽ;

public class Mediator extends AbstractMediator{

	@Override
	public void execute(String message, Object obj1) {//����Ϊ�ж�ִ���ĸ����󷽷��������Ͳ���
		if(message.equals("����")){
			buyComputer((Integer) obj1);
			System.out.println("�����н��߶���mediator��execute����"+message);
		}else if(message.equals("����")){
			sellComputer((Integer) obj1);
			System.out.println("�����н��߶���mediator��execute����"+message);
		}else if(message.equals("�洢")){
			storeComputer((Integer) obj1);
			System.out.println("�����н��߶���mediator��execute����"+message);
		}
	}
	
	private void buyComputer(int num){
		System.out.println("�����н��߶���ִ��buyComputer����������"+num+"̨����");
	}
	
	private void sellComputer(int num){
		System.out.println("�����н��߶���ִ��sellComputer����������"+num+"̨����");
	}
	
	private void storeComputer(int num){
		System.out.println("�����н��߶���ִ��storeComputer����������"+num+"̨����");
	}
}

package net.mamian.designpattern.��Ԫģʽ;

/*
 * ��Ԫģʽ���ڴ��д��ڴ���ʵ�����󣬵����������е�ʵ������Ч������GC��δ������ʱ����������Ԫģʽ�ɽ�ʡ�ڴ�
 * �����ػ��ƿ��Խ�ʡ����ʵ��ռ�õ��ڴ�ռ�
 * 
 * */
public class Client {
	public static void main(String[] args) {
		for(int i=0;i<4;i++){
			String location = "����"+i;
			for(int j=0;j<10;j++){
				String key = location+"����Ա"+j;
			}
		}
		
		SignInfo signInfo = SignInfoFactory.getSignInfo("����3����Ա5");
		signInfo.printSignInfo();
	}
}

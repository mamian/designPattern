package net.mamian.designpattern.������ģʽ;

import java.util.HashMap;

public abstract class Expression {
	//������ʽ����ֵ,����var�е�keyֵ���ǹ�ʽ�еĲ�����valueֵ�Ǿ��������
	public abstract int interpreter(HashMap<String,Integer> map);
}

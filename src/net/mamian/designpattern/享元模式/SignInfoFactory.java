package net.mamian.designpattern.��Ԫģʽ;

import java.util.HashMap;

public class SignInfoFactory {
	private static HashMap<String,SignInfo> pool = new HashMap<String,SignInfo>();
	
	public static SignInfo getSignInfo(String key){
		SignInfo result = null;
		if(!pool.containsKey(key)){
			result = new SignInfo4Pool(key);
			pool.put(key, result);
			System.out.println("��������--"+key+"--�������õ��������");
		}else{
			result = pool.get(key);
			System.out.println("ֱ�ӴӶ������ȡ����"+key);
		}
		return result;
	}
}

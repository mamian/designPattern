package net.mamian.designpattern.������ģʽ;

import java.util.Map;
/*
 * �̳д�ת���࣬ʵ��Ŀ�Ľӿ�*/
public class Adapter extends OuterUserInfo implements IUserInfo{
	private Map outUserBaseInfo = super.getUserBaseInfo();
	private Map outUserWorkInfo = super.getUserWorkInfo();
	@Override
	public String getUserName() {
		String userName = (String)outUserBaseInfo.get("outUserName");
		System.out.println(userName);
		return null;
	}

	@Override
	public String getUserAddress() {
		String userAddress = (String)outUserBaseInfo.get("outUserAddress");
		System.out.println(userAddress);
		return null;
	}

	@Override
	public String getUserTel() {
		String userTel = (String)outUserBaseInfo.get("outUserTel");
		System.out.println(userTel);
		return null;
	}

	@Override
	public String getPosition() {
		String userPosition = (String)outUserWorkInfo.get("outUserPosition");
		System.out.println(userPosition);
		return null;
	}

}

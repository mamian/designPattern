package net.mamian.designpattern.适配器模式;

import java.util.Map;
/*
 * 继承待转换类，实现目的接口*/
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
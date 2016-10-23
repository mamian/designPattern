package net.mamian.designpattern.适配器模式;

public class UserInfo implements IUserInfo{

	@Override
	public String getUserName() {
		System.out.println("获取最终格式的用户名称");
		return null;
	}

	@Override
	public String getUserAddress() {
		System.out.println("获取最终格式的用户地址");
		return null;
	}

	@Override
	public String getUserTel() {
		System.out.println("获取最终格式的用户电话");
		return null;
	}

	@Override
	public String getPosition() {
		System.out.println("获取最终格式的用户职位");
		return null;
	}

}

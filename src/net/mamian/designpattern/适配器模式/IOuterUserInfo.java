package net.mamian.designpattern.适配器模式;

import java.util.Map;

public interface IOuterUserInfo {
	public Map<String, String> getUserBaseInfo();
	public Map<String, String> getUserWorkInfo();
}

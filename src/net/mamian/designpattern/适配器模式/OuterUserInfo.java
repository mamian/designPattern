package net.mamian.designpattern.适配器模式;

import java.util.HashMap;
import java.util.Map;

public class OuterUserInfo implements IOuterUserInfo{
	
	@Override
	public Map<String, String> getUserBaseInfo() {
		Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("outUserName", "待转换的用户名称");
        baseInfoMap.put("outUserAddress", "待转换的用户地址");
        baseInfoMap.put("outUserTel", "待转换的用户电话");
        return baseInfoMap;
	}

	@Override
	public Map<String, String> getUserWorkInfo() {
		Map<String, String> workInfoMap = new HashMap<>();
        workInfoMap.put("outUserPosition", "待转换的用户职位");
        return workInfoMap;
	}

}

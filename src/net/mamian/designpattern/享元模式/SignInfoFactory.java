package net.mamian.designpattern.享元模式;

import java.util.HashMap;

/**
 *
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-22 23:27:19
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class SignInfoFactory {
	private static HashMap<String,SignInfo> pool = new HashMap<String,SignInfo>();

	public static SignInfo getSignInfo(String key){
		SignInfo result = null;
		if(!pool.containsKey(key)){
			result = new SignInfo4Pool(key);
			pool.put(key, result);
			System.out.println("建立对象--"+key+"--，并放置到对象池中");
		}else{
			result = pool.get(key);
			System.out.println("直接从对象池中取对象："+key);
		}
		return result;
	}
}
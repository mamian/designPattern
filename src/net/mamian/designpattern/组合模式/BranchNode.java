package net.mamian.designpattern.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式-分支节点
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-23 23:41:42
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class BranchNode extends Node {
	private List<Node> subNodeList = new ArrayList<Node>();
	
	public BranchNode(String branchNodeName,String branchNodeId) {
		super(branchNodeName,branchNodeId);
	}
	
	public void addSubNode(Node subNode){
		subNodeList.add(subNode);
	}
	
	public List<Node> getSubNodeList(){
		return subNodeList;
	}
}

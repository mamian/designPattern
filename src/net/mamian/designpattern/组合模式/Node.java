package net.mamian.designpattern.组合模式;

/**
 * 组合模式-抽象父类
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-23 23:40:18
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Node {

    private String nodeName;
    private String nodeId;

    public Node(String nodeName,String nodeId) {
        this.nodeId = nodeId;
        this.nodeName = nodeName;
    }

    public String getNodeInfo(){
        String nodeInfo = "节点名称："+nodeName+"  节点Id："+nodeId;
        return nodeInfo;
    }

}

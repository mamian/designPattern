package net.mamian.designpattern.组合模式;

/**
 * 组合模式-叶子节点
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-23 23:42:29
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class LeafNode extends Node {

    public LeafNode(String leafNodeName, String leafNodeId) {
        super(leafNodeName, leafNodeId);
    }

}

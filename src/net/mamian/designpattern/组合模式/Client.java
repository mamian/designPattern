package net.mamian.designpattern.组合模式;

import java.util.List;

/**
 * 组合模式-入口
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-9-23 23:43:12
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {

    public static void main(String[] args){
        BranchNode root = buildTree();
        System.out.println(getTreeInfo(root));
    }

    public static BranchNode buildTree(){
        //将根节点对象生产出来---------------------------------------------
        BranchNode root = new BranchNode("机构人员树","-1");

        //将一级机构生产出来----------------------------------------------
        BranchNode firstOrg1 = new BranchNode("北京市","1");

        //将二级机构生产出来-----------------------------------------------
        BranchNode secondOrg1 = new BranchNode("海淀区","101");
        BranchNode secondOrg2 = new BranchNode("大兴区","102");
        BranchNode secondOrg3 = new BranchNode("丰台区","103");

        //将三级人员生产出来------------------------------------------------
        LeafNode person1 = new LeafNode("北京海淀人1","10101");
        LeafNode person2 = new LeafNode("北京海淀人2","10102");
        LeafNode person3 = new LeafNode("北京大兴人1","10201");
        LeafNode person4 = new LeafNode("北京丰台人1","10301");

        //组装---------------------------------------------------------
        secondOrg1.addSubNode(person1);
        secondOrg1.addSubNode(person2);
        secondOrg2.addSubNode(person3);
        secondOrg3.addSubNode(person4);

        firstOrg1.addSubNode(secondOrg1);
        firstOrg1.addSubNode(secondOrg2);
        firstOrg1.addSubNode(secondOrg3);

        root.addSubNode(firstOrg1);

        return root;
    }

    public static String getTreeInfo(BranchNode branchNode){
        String result = branchNode.getNodeInfo()+"\n";
        List<Node> subList = branchNode.getSubNodeList();

        for(int i=0;i<subList.size();i++){
            Node node = subList.get(i);
            result += node.getNodeInfo()+"\n";
            if(node instanceof BranchNode){
                result += getTreeInfo((BranchNode)node)+"\n";
            }
        }
        return result;
    }
}

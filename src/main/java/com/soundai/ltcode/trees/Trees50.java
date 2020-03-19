package com.soundai.ltcode.trees;

import com.soundai.algo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liujialei
 * @create: 2020-03-03 18:25
 **/
public class Trees50 {


    public static void main(String[] args) {
        Trees50 trees50 = new Trees50();
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);
        TreeNode root3 = new TreeNode(4);

        root.left = root1;
        root.right = root2;
        root2.left = root3;

        List<List<Integer>> lists = trees50.levelOrder(root);
        System.out.println(lists.size());
    }

    /**
     * 广度优先搜索
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        List<Integer> rootList = new ArrayList<>();
        rootList.add(root.val);
        ret.add(rootList);
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        getSubListAndAdd(treeNodes, ret);
        return ret;
    }

    public void getSubListAndAdd(List<TreeNode> treeNodes, List<List<Integer>> ret) {
        if (treeNodes == null || treeNodes.size() == 0) {
            return;
        }
        List<TreeNode> retTreeNodeList = new ArrayList<>();
        List<Integer> retInteger = new ArrayList<>();
        for (TreeNode treeNode : treeNodes) {
            if (treeNode.left != null) {
                retTreeNodeList.add(treeNode.left);
                retInteger.add(treeNode.left.val);
            }
            if (treeNode.right != null) {
                retTreeNodeList.add(treeNode.right);
                retInteger.add(treeNode.right.val);
            }
        }
        if (retTreeNodeList.size() > 0) {
            ret.add(retInteger);
            getSubListAndAdd(retTreeNodeList, ret);
        }
    }

}

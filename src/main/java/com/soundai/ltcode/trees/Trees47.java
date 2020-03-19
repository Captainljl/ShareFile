package com.soundai.ltcode.trees;

import com.soundai.algo.TreeNode;

/**
 * @author: liujialei
 * @create: 2020-03-03 11:42
 **/
public class Trees47 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(1);
        Trees47 trees47 = new Trees47();
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.right = treeNode3;
        System.out.println(trees47.maxDepth(treeNode));

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

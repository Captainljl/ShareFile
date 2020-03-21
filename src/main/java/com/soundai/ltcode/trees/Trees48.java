package com.soundai.ltcode.trees;

import com.soundai.algo.TreeNode;

import java.util.Stack;

/**
 * @author: liujialei
 * @create: 2020-03-03 15:41
 **/
public class Trees48 {

    public static void main(String[] args) {
        Trees48 trees48 = new Trees48();
        TreeNode root1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(1);
        TreeNode root3 = new TreeNode(4);
        TreeNode root4 = new TreeNode(3);
        TreeNode root5 = new TreeNode(6);
        TreeNode root6 = new TreeNode(4);
        TreeNode root7 = new TreeNode(6);
        TreeNode root8 = new TreeNode(4);
        root1.right = root2;
        root1.left = root3;
        root2.left = root4;
        root2.right = root5;/*
        root5.right = root8;
        root3.left = root6;
        root3.right = root7;*/

        System.out.println(trees48.isValidBST(root1));
    }


    public boolean isValidBST(TreeNode root) {
        //将树进行中序遍历，左根右
        Stack<Integer> stack = new Stack<>();
        return getRootList(root, stack);
    }

    private boolean getRootList(TreeNode root, Stack<Integer> stack) {
        if (root == null) {
            return true;
        }
        if (!getRootList(root.left, stack)) {
            return false;
        }
        if (!stack.isEmpty() && root.val <= stack.peek()) {
            return false;
        } else {
            stack.push(root.val);
        }
        if (!getRootList(root.right, stack)) {
            return false;
        }
        return true;
    }

}

package com.soundai.ltcode.trees;

import com.soundai.algo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liujialei
 * @create: 2020-03-03 15:41
 **/
public class Trees48_1 {

    public static void main(String[] args) {
        Trees48_1 trees48 = new Trees48_1();
        TreeNode root1 = new TreeNode(3);
        TreeNode root2 = new TreeNode(1);
        TreeNode root3 = new TreeNode(5);
        TreeNode root4 = new TreeNode(0);
        TreeNode root5 = new TreeNode(2);
        TreeNode root6 = new TreeNode(4);
        TreeNode root7 = new TreeNode(6);
        TreeNode root8 = new TreeNode(4);
        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root5.right = root8;
        root3.left = root6;
        root3.right = root7;

        System.out.println(trees48.isValidBST(root1));
    }


    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;
        System.out.println(node.val + " " + lower + " " + upper);
        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (! helper(node.right, val, upper)) return false;
        if (! helper(node.left, lower, val)) return false;
        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

}

package com.soundai.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathSumII437 {


    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(-3);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(11);
        TreeNode treeNode7 = new TreeNode(3);
        TreeNode treeNode8 = new TreeNode(-2);
        TreeNode treeNode9 = new TreeNode(1);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        /*treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode6;
        treeNode4.left = treeNode7;
        treeNode4.right = treeNode8;
        treeNode5.right = treeNode9;*/

        PathSumII437 pathSumII437 = new PathSumII437();
        int i = pathSumII437.pathSum(treeNode1, 8);
        System.out.println(i);

    }


    public int pathSum(TreeNode root, int sum) {
        List<Integer> possibleResult = new ArrayList();
        getPossibleResult(possibleResult, root);
        System.out.println(Arrays.toString(possibleResult.toArray()));
        return (int) possibleResult.stream().filter(integer -> integer == sum ).count();
    }

    public void getPossibleResult (List<Integer> possibleResult, TreeNode root) {
        if (root == null) {
            return ;
        }

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        if (leftNode != null) {
            getPossibleResult(possibleResult, leftNode);
        }
        if (rightNode != null) {
            getPossibleResult(possibleResult, rightNode);
        }

        List<Integer> possibleResultNew = new ArrayList();
        possibleResult.stream().forEach(i -> possibleResultNew.add(i + root.val));
        possibleResult.addAll(possibleResultNew);
        possibleResult.add(root.val);

    }




}

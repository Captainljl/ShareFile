package com.soundai.threemonths.topic4;

import com.soundai.threemonths.TreeNode;

/**
 * @author: liujialei
 * @create: 2019-12-31 09:38
 **/
public class Solution {


    public static void main(String[] args) {
        int[] pre = new int[]{1,2,4,5,7,8,3,6};
        int[] mid = new int[]{4,2,7,5,8,1,3,6};
        TreeNode treeNodeByPreAndIn = getTreeNodeByPreAndIn(pre, mid);
        System.out.println(treeNodeByPreAndIn);
    }






    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
     * 则重建二叉树并返回
     */
    public static TreeNode getTreeNodeByPreAndIn (int[] pre, int[] mid) {
        return getTreeNodeByPreAndInWithIndex(pre, mid, 0, pre.length);
    }

    public static TreeNode getTreeNodeByPreAndInWithIndex(int[] pre , int[] mid, int startIndex, int endIndex) {
        if (pre.length == 0) {
            return null;
        }
        int rootValue = pre[0];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = 0;
        //for (; mid[rootIndex]);
        return null;


    }


}

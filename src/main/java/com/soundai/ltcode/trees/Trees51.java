package com.soundai.ltcode.trees;

import com.soundai.algo.TreeNode;

/**
 * @author: liujialei
 * @create: 2020-03-04 23:13
 **/
public class Trees51 {

    public static void main(String[] args) {
        Trees51 trees51 = new Trees51();
        TreeNode treeNode = trees51.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        System.out.println(treeNode);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        if (end - start == 1) {
            TreeNode root = new TreeNode(nums[end]);
            root.left = new TreeNode(nums[start]);
            return root;
        }
        if (end - start == 2) {
            TreeNode root = new TreeNode(nums[start+1]);
            root.left = new TreeNode(nums[start]);
            root.right = new TreeNode(nums[end]);
            return root;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }

}

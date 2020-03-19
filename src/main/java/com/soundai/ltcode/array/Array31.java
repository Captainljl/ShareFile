package com.soundai.ltcode.array;

import java.util.Arrays;

/**
 * @author: liujialei
 * @create: 2020-02-29 15:20
 **/
public class Array31 {

    public static void main(String[] args) {
        Array31 array31 = new Array31();
        int[][] matrix = new int[3][3];
        int[] m0 = new int[]{1, 2, 3};
        int[] m1 = new int[]{3, 4, 5};
        int[] m2 = new int[]{5, 6, 7};
        matrix[0] = m0;
        matrix[1] = m1;
        matrix[2] = m2;
        array31.rotate(matrix);
        array31.print(matrix);
    }

    public void rotate(int[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                swap(i, j, matrix);
            }
        }

        print(matrix);

        for (int i = 0; i < length; i++) {
            revert(matrix[i]);
        }

    }

    private void  print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private void revert(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left ++;
            right --;
        }
    }

    private void swap (int a, int b, int[][] matrix) {
        int temp = matrix[a][b];
        matrix[a][b] = matrix[b][a];
        matrix[b][a] = temp;
    }

}

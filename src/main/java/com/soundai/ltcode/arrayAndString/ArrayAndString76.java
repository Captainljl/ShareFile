package com.soundai.ltcode.arrayAndString;

import java.util.Arrays;

/**
 * @author: liujialei
 * @create: 2020-03-21 15:18
 **/
public class ArrayAndString76 {

    public static void main(String[] args) {
        ArrayAndString76 arrayAndString76 = new ArrayAndString76();
        int[][] matrix= new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        arrayAndString76.printArray(matrix);
        arrayAndString76.setZeroes(matrix);
    }

    /**
     * 横向遍历，竖向填充
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        int row = matrix.length; //3
        int col = matrix[0].length; //4
        int i = row - 1, j = col - 1;
        for (; i >= 0; i--) {
            for (; j >= 0; j--) {

            }
        }
    }



    private void printArray (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("----------------");
    }

}

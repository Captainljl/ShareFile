package com.soundai.threemonths.problem3;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] array = new int[][]{{1,2,5,7},{3,4,6,10}};
        boolean find = solution.find(array, 8);
        System.out.println(find);
    }

    public boolean find(int [][] array, int target) {
        return findInColumn(array, target);
    }

    boolean findInColumn (int[][] array, int aim) {

        if (array[0][0] > aim && array[array.length - 1][array[0].length - 1] < aim) {
            return false;
        }
        int firstSmallLie = findFirstSmallRow(array[0], aim, 0, array[0].length - 1);
        if (array[0][firstSmallLie] == aim) {
            return true;
        }
        int firstSmallHang = findFirstSmallCol(array, aim, 0, array.length - 1);
        if (array[firstSmallHang][0] == aim) {
            return true;
        }
        //在这行和这列之间
        if (!binaryFind(array[firstSmallHang], aim, 0, firstSmallLie)) {
            return binaryFindTwo(array,aim ,0, firstSmallHang, firstSmallLie);
        } else {
            return true;
        }
    }


    private boolean binaryFind (int[] array, int aim, int low, int high) {
        if (high < low || aim > array[high] || aim < array[low]) {
            return false;
        }
        int mid = (low + high) / 2;
        if (array[mid] > aim) {
            return binaryFind(array, aim, low, mid - 1);
        } else if (array[mid] < aim) {
            return binaryFind(array, aim ,mid + 1, high);
        } else {
            return true;
        }
    }

    private boolean binaryFindTwo (int[][] array, int aim, int low, int high, int num) {
        if (high < low || aim < array[low][num] || aim > array[high][num]) {
            return false;
        }
        int mid = (low + high) / 2;
        if (array[mid][num] > aim) {
            return binaryFindTwo(array, aim, low,mid-1, num);
        } else if (array[mid][num] < aim) {
            return binaryFindTwo(array, aim, mid+1, high, num);
        } else {
            return true;
        }
    }

    private int findFirstSmallCol(int[][] array, int aim, int low, int high) {

        int mid = (low + high) / 2;
        if (array[mid][0] < aim && mid == high) {
            return mid;
        }
        if (array[mid][0] > aim && mid == low) {
            return mid;
        }

        if (array[mid][0] > aim) {
            if (mid - 1 > 0 && array[mid - 1][0] < aim) {
                return mid - 1;
            } else {
                return findFirstSmallCol(array, aim, low, mid - 1);
            }
        } else if (array[mid][0] < aim) {
            if (mid + 1 < array.length && array[mid+1][0] > aim) {
                return mid;
            } else {
                return findFirstSmallCol(array, aim, mid+1, high);
            }
        } else {
            return mid;
        }
    }

    /**
     * 找到小于五的第一个数
     * @param array
     * @param aim
     * @return
     */

    int findFirstSmallRow(int[] array, int aim, int low, int high) {

        int mid = (low + high) / 2;

        if (array[mid] < aim && mid == high) {
            return mid;
        }
        if (array[mid] > aim && mid == low) {
            return mid;
        }

        if (array[mid] > aim) {
            if (mid - 1 > 0 && array[mid-1] < aim) {
                return mid - 1;
            } else {
                return findFirstSmallRow(array, aim, low, mid - 1);
            }
        } else if (array[mid] < aim) {
            if (mid + 1 < array.length && array[mid+1] > aim) {
                return mid;
            } else {
                return findFirstSmallRow(array, aim, mid+1, high);
            }
        } else {
            return mid;
        }
    }





}

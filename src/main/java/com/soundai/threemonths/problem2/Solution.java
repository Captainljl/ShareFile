package com.soundai.threemonths.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = new int[]{2,1,3,1,4};
        int[] dup = new int[0];
        s.duplicate(numbers, numbers.length, dup);
    }

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean isDup = false;
        int index = 0;
        List<Integer> retList = new ArrayList<>();
        while (index < length) {
            while (index != numbers[index]) {
                int val = numbers[index];
                //swap aim index and value of aim index
                System.out.println(Arrays.toString(numbers));

                //如果不相等则进去替换
                if (numbers[val] == val) {
                    //重复的
                    retList.add(val);
                    isDup = true;
                    break;
                } else {
                    int ret = swap (index, numbers);
                    System.out.println(Arrays.toString(numbers));
                    if (val == ret) {
                        retList.add(val);
                        isDup = true;
                    }
                }
            }
            index ++;
        }
        duplication = new int[retList.size()];
        for (int i=0; i < retList.size(); i++ ) {
            duplication[i] = retList.get(i);
        }
        return isDup;
    }

    private int swap (int index, int[] numbers) {
        int orig = index;
        int origValue = numbers[orig];
        int dest = numbers[index];
        int destValue = numbers[dest];

        numbers[orig] = destValue;
        numbers[dest] = origValue;
        return destValue;
    }

}

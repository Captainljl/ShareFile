package com.soundai.ltcode.arrayAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: liujialei
 * @create: 2020-03-21 10:55
 **/
public class ArrayAndString75 {

    public static void main(String[] args) {
        ArrayAndString75 arrayAndString75 = new ArrayAndString75();
        System.out.println(arrayAndString75.threeSum(new int[] {1,-1,-1,0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> returnList = new ArrayList<List<Integer> > ();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    returnList.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l+1]) l++;
                    while (l < r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return returnList;
    }

}

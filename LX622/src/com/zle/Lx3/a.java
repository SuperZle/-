package com.zle.Lx3;

import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        int [] a={2,56,55,21,5};
        int c = 77;
        int[] ints = twoSum (a,c);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] twoSum(int[] nums, int target) {
        int a=0;
        int b=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    a=i;
                    b=j;
                }
            }
        }
        int[] c= {a,b};
        return c;
    }
}

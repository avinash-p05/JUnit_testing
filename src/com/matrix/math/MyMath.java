package com.matrix.math;

public class MyMath {
    int sum=0;
    public int calculateSum(int[] nums){
        for(int i : nums)
                sum+=i;
        return sum;
    }
}

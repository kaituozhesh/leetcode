package com.ktz.sh.array.simple;

import java.util.Arrays;

/**
 * @ClassName _0189_旋转数组
 * @Description
 * @Author kaituozhesh
 * @Date 2020/5/20 9:05
 * @Version V1.0.0
 **/
public class _0189_旋转数组 {

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    public static void rotate(int[] nums, int k) {

        int i = 0;
        int length = nums.length;
        int temp = nums[0];
        int xx;
        do {
            i = (i + k) % length;
            xx = nums[i];
            nums[i] = temp;
            temp = xx;
        } while (i != 0);

    }
}

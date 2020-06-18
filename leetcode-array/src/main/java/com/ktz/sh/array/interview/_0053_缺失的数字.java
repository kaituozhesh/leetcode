package com.ktz.sh.array.interview;

/**
 * @ClassName _0053_缺失的数字
 * @Description
 * @Author kaituozhesh
 * @Date 2020/6/18 13:48
 * @Version V1.0.0
 **/
public class _0053_缺失的数字 {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1, 3, 4}));
    }


    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            if (nums[mid] == mid) {
                left = mid + 1;
            } else if (left > mid) {
                right = mid - 1;
            } else {
                right--;
            }
            mid = left + (right - left) / 2;
        }
        return mid;
    }
}

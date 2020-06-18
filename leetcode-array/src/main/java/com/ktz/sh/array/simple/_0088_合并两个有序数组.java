package com.ktz.sh.array.simple;

import java.util.Arrays;

/**
 * @ClassName _0088_合并两个有序数组
 * @Description
 * @Author kaituozhesh
 * @Date 2020/6/18 14:17
 * @Version V1.0.0
 **/
public class _0088_合并两个有序数组 {


    public static void main(String[] args) {
        merge2(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);

    }



    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        int nIndex = n - 1;
        int totalLength = m + n - 1;

        while (mIndex >= 0 && nIndex >= 0) {
            nums1[totalLength--] = nums1[mIndex] < nums2[nIndex] ? nums2[nIndex--] : nums1[mIndex--];
        }
        while (mIndex >= 0) {
            nums1[totalLength--] = nums1[mIndex--];
        }
        while (nIndex >= 0) {
            nums1[totalLength--] = nums2[nIndex--];
        }
        System.out.println(Arrays.toString(nums1));
    }

}

package com.ktz.sh.array.difficult;

/**
 * @ClassName _0004_寻找两个正序数组的中位数
 * @Description 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * nums1 = [1, 3]
 * nums2 = [2]
 * 则中位数是 2.0
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 则中位数是 (2 + 3)/2 = 2.5
 * @Author kaituozhesh
 * @Date 2020/5/8 10:57
 * @Version V1.0.0
 **/
public class _0004_寻找两个正序数组的中位数 {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] nums3 = new int[length];

        int i = 0;
        int j = 0;
        while (i != nums1.length && j != nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums3[i + j] = nums1[i++];
            } else {
                nums3[i + j] = nums2[j++];
            }
        }
        while (i != nums1.length) {
            nums3[i + j] = nums1[i++];
        }
        while (j != nums2.length) {
            nums3[i + j] = nums2[j++];
        }
        return length % 2 == 0 ? (nums3[length / 2] + nums3[length / 2 - 1]) / 2.0 : nums3[length / 2] * 1.0;
    }


}

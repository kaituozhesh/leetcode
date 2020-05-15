package com.ktz.sh.array.simple;

/**
 * @ClassName _0035_搜索插入位置
 * @Description 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * @Author kaituozhesh
 * @Date 2020/5/9 15:30
 * @Version V1.0.0
 **/
public class _0035_搜索插入位置 {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1}, 1));
    }

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int mid = 0;

        while (i < j) {
            mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        mid = i + (j - i) / 2;
        return nums[mid] >= target ? mid : mid + 1;
    }

}

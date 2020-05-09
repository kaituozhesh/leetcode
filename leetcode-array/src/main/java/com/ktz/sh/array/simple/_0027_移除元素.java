package com.ktz.sh.array.simple;

/**
 * @ClassName _0027_移除元素
 * @Description 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * 注意这五个元素可为任意顺序。
 * 你不需要考虑数组中超出新长度后面的元素。
 * @Author kaituozhesh
 * @Date 2020/5/9 10:59
 * @Version V1.0.0
 **/
public class _0027_移除元素 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            // 找到第一个等于目标值的数下标 i
            while (i <= j && nums[i] != val) {
                i++;
            }
            // 在右边找到一个不等于val的值
            while (i <= j && nums[j] == val) {
                j--;
            }
            if (i <= j) {
                nums[i] = nums[j] - nums[i] + (nums[j] = nums[i]);
            }
        }
        return i;
    }

    public static int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}

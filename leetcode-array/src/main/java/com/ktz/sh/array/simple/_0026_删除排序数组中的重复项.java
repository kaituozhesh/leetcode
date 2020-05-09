package com.ktz.sh.array.simple;

/**
 * @ClassName _0026_删除排序数组中的重复项
 * @Description 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * @Author kaituozhesh
 * @Date 2020/5/9 14:22
 * @Version V1.0.0
 **/
public class _0026_删除排序数组中的重复项 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates2(new int[]{1, 1, 2}));
    }

    /**
     * 结果为无序
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = 1;
        for (; k < j; k++) {
            int temp = k;
            while (temp <= j) {
                if (nums[temp] == nums[i]) {
                    nums[temp] = nums[j] - nums[temp] + (nums[j] = nums[temp]);
                    j--;
                } else {
                    temp++;
                }
            }
            i++;
        }
        return k;
    }

    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}

package com.ktz.sh.array.simple;

/**
 * @ClassName : _0724_寻找数组的中心索引
 * @Description :
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
 * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 * <p>
 * 输入:
 * nums = [1, 7, 3, 6, 5, 6]
 * 输出: 3
 * 解释:
 * 索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。
 * 同时, 3 也是第一个符合要求的中心索引。
 * @Author : kaituozhesh
 * @Date: 2020-05-10 11:57
 * @Version: 1.0.0
 */
public class _0724_寻找数组的中心索引 {

    public static void main(String[] args) {
        System.out.println(pivotIndex2(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex2(new int[]{-1, -1, -1, 0, 1, 1}));

    }

    /**
     * asd
     * 左边的和等于SUM(nums(i -1])
     * 右边的和等于SUM(nums[i + 1))   rightSum = 总和减去左边的 在减去i
     *
     * @param nums
     * @return
     */
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum = 0;
            } else {
                leftSum += nums[i - 1];
            }
            rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }


    public static int pivotIndex2(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum = sum - leftSum;
            leftSum += nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static int pivotIndex3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static int pivotIndex4(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum * 2 == sum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }


}

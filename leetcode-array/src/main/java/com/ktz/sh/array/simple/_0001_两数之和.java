package com.ktz.sh.array.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _0001_两数之和
 * @Description 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 题解思路: 循环数组,判断目标值减去当前遍历到的值 是否存在于Map中,如果存在于map中就把key对应的下标和当前遍历到的下标返回结束循环
 *              当在map中不存在的时候,把当前遍历到的值作为key,下标作为value存到map中
 * @Author kaituozhesh
 * @Date 2020/5/8 10:45
 * @Version V1.0.0
 **/
public class _0001_两数之和 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> numIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numIndex.containsKey(target - nums[i])) {
                return new int[]{numIndex.get(target - nums[i]), i};
            }
            numIndex.put(nums[i], i);
        }
        return null;
    }

}

package com.ktz.sh.array.simple;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName : _0747_至少是其他数字两倍的最大数
 * @Description :
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * 如果是，则返回最大元素的索引，否则返回-1。
 * @Author : kaituozhesh
 * @Date: 2020-05-10 15:20
 * @Version: 1.0.0
 */
public class _0747_至少是其他数字两倍的最大数 {


    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{0, 0, 3, 2}));
    }

    public static int dominantIndex(int[] nums) {
        int max = 0;
        int secondMax = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        return max >= secondMax ? index : -1;
    }

    public static int dominantIndex2(int[] nums) {

        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        int max = nums[maxIndex];
        for (int i = 0; i < nums.length; i++) {
            if (maxIndex != i && max < nums[i] * 2) {
                return -1;
            }
        }
        return maxIndex;
    }
}
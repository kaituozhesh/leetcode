package com.ktz.sh.array.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _0167_两数之和二
 * @Description
 * @Author kaituozhesh
 * @Date 2020/6/18 15:22
 * @Version V1.0.0
 **/
public class _0167_两数之和二 {

    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15}, 9);
    }


    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> disc = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (disc.containsKey(numbers[i])) {
                return new int[]{disc.get(numbers[i]), i + 1};
            } else {
                disc.put(target - numbers[i], i + 1);
            }
        }
        return null;
    }
}

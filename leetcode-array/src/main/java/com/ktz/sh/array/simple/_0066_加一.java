package com.ktz.sh.array.simple;

import java.util.Arrays;

/**
 * @ClassName : _0066_加一
 * @Description :
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @Author : kaituozhesh
 * @Date: 2020-05-10 15:59
 * @Version: 1.0.0
 */
public class _0066_加一 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }


    public static int[] plusOne(int[] digits) {
        int jin = 1;
        int xx;
        for (int i = digits.length - 1; i >= 0; i--) {
            xx = digits[i] + jin;
            jin = xx / 10;
            digits[i] = xx % 10;
            if (jin == 0) {
                return digits;
            }
        }
        if (jin > 0) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = jin;
            for (int i = 0; i < digits.length; i++) {
                newArr[i + 1] = digits[i];
            }
            return newArr;
        }
        return digits;
    }

    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

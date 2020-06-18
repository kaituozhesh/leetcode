package com.ktz.sh.array.simple;

import java.util.Arrays;

/**
 * @ClassName _1299_将每个元素替换为右侧最大元素
 * @Description
 * @Author kaituozhesh
 * @Date 2020/6/18 15:06
 * @Version V1.0.0
 **/
public class _1299_将每个元素替换为右侧最大元素 {


    public static void main(String[] args) {
        replaceElements(new int[]{17, 18, 5, 4, 6, 1});
    }

    public static int[] replaceElements(int[] arr) {
        int temp = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > temp) {
                temp = arr[i] - temp + (arr[i] = temp);
            } else {
                arr[i] = temp;
            }
        }
        return arr;
    }


}

package com.ktz.sh.array.interview;

import java.util.Arrays;

/**
 * @ClassName 矩阵旋转
 * @Description 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 * 不占用额外内存空间能否做到？
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * @Author kaituozhesh
 * @Date 2020/5/8 13:21
 * @Version V1.0.0
 **/
public class 矩阵旋转 {
    public static void main(String[] args) {

        rotate2(new int[][]{{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}});
    }

    public static void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                temp[j][matrix[i].length - 1 - i] = matrix[i][j];
            }
        }
        matrix = temp;
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void rotate2(int[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                matrix[i][j] = matrix[j][i] - matrix[i][j] + (matrix[j][i] = matrix[i][j]);
            }
        }
        int mid = length >> 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < mid; j++) {
                matrix[i][j] = matrix[i][length - 1 - j] - matrix[i][j] + (matrix[i][length - 1 - j] = matrix[i][j]);
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

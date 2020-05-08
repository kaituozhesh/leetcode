package com.ktz.sh.array.middling;

/**
 * @ClassName _0011_盛最多水的容器
 * @Description 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * @Author kaituozhesh
 * @Date 2020/5/8 14:07
 * @Version V1.0.0
 **/
public class _0011_盛最多水的容器 {


    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }


    public static int maxArea(int[] height) {
        int max = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(((j - i) * Math.min(height[i], height[j])), max);
            }
        }
        return max;
    }
}

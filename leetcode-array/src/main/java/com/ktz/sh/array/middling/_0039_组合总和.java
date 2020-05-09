package com.ktz.sh.array.middling;

import java.util.*;

/**
 * @ClassName _0039_组合总和
 * @Description 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。candidates 中的数字可以无限制重复被选取。
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 * @Author kaituozhesh
 * @Date 2020/5/8 14:25
 * @Version V1.0.0
 **/
public class _0039_组合总和 {

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) {
            return res;
        }
        dfs(target, 0, new Stack<Integer>(), candidates);
        return res;
    }

    //深度遍历
    private static void dfs(int target, int index, Stack<Integer> pre, int[] candidates) {
        //等于零说明结果符合要求
        if (target == 0) {
            res.add(new ArrayList<>(pre));
            return;
        }
        //遍历，index为本分支上一节点的减数的下标
        for (int i = index; i < candidates.length; i++) {
            //如果减数大于目标值，则差为负数，不符合结果
            if (candidates[i] <= target) {
                pre.push(candidates[i]);
                //目标值减去元素值
                dfs(target - candidates[i], i, pre, candidates);
                //每次回溯将最后一次加入的元素删除
                pre.pop();
            }
        }
    }

}

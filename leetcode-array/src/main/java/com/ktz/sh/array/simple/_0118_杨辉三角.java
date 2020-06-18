package com.ktz.sh.array.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName _0118_杨辉三角
 * @Description
 * @Author kaituozhesh
 * @Date 2020/6/18 14:49
 * @Version V1.0.0
 **/
public class _0118_杨辉三角 {

    public static void main(String[] args) {
        generate(5);
    }


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                row.add(0);
            }
            row.set(0, 1);
            row.set(i, 1);
            result.add(row);
        }
        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < result.get(i).size() - 1; j++) {
                result.get(i).set(j, result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
        }
        return result;
    }
}

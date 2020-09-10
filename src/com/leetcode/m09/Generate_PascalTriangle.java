package com.leetcode.m09;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 118. Pascal's Triangle
 */
public class Generate_PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return res;
        }
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);
        List<Integer> row = null;
        List<Integer> front = null;
        for (int i = 1; i < numRows; i++) {
            front = res.get(i - 1);
            row = new ArrayList<Integer>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(front.get(j - 1) + front.get(j));
            }
            row.add(1);
            res.add(row);

        }
        return res;
    }
    public static void main(String[] args) {
        Generate_PascalTriangle test = new Generate_PascalTriangle();
        System.out.println(test.generate(5));
    }
}

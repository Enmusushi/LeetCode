package com.leetcode.m09;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 47. 全排列 II
 */
public class PermutePermutationUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        permuteUniqueDFS(nums, res, new LinkedList<Integer>(), visited);
        return res;
    }

    public void permuteUniqueDFS(int[] nums, List<List<Integer>> res, List<Integer> oneRes, boolean[] visited) {
        if (oneRes.size() == nums.length) {
            res.add(new LinkedList<Integer>(oneRes));
        }
        int lastUsed = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || nums[i] == lastUsed) {
                continue;
            }
            visited[i] = true;
            oneRes.add(nums[i]);
            permuteUniqueDFS(nums, res, oneRes, visited);
            lastUsed = nums[i];
            visited[i] = false;
            oneRes.remove(oneRes.size() - 1);
        }
    }
}

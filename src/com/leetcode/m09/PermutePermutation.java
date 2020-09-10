package com.leetcode.m09;

import java.util.LinkedList;
import java.util.List;
/**
 * 46. 全排列
 */
public class PermutePermutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        boolean[] visited = new boolean[nums.length];
        permuteDFS(nums, result, new LinkedList<Integer>(), visited);
        return result;
    }
    public void permuteDFS(int[] nums, List<List<Integer>> result, List<Integer> onekind, boolean[] visited) {
        if (onekind.size() == nums.length) {
            result.add(new LinkedList<Integer>(onekind));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            onekind.add(nums[i]);
            permuteDFS(nums, result, onekind, visited);
            visited[i] = false;
            onekind.remove(onekind.size() - 1);
        }
    }
    public static void main(String[] args) {
        PermutePermutation test = new PermutePermutation();
        int[] nums = {1,2,3,4,5};
        System.out.println(test.permute(nums));
    }
}

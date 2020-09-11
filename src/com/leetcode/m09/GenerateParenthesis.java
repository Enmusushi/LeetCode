package com.leetcode.m09;

import java.util.LinkedList;
import java.util.List;
/**
 * 22. 括号生成
 */
public class GenerateParenthesis {
    private StringBuffer buffer = new StringBuffer();
    private List<String> ans = new LinkedList<String>();
    public List<String> generateParenthesis(int n) {
        generateParenthesisDFS(n, 0, 0, 0);
        return ans;
    }
    //初始通过3ms，优化后1ms
    public void generateParenthesisDFS(int n, int index, int left, int right) {
        if (buffer.length() == n << 1 && left == right) {
            ans.add(buffer.toString());
        }
        if (right > left || index > n << 1) {
            return;
        } else if (left == right) {
            buffer.append('(');
            generateParenthesisDFS(n, index + 1, left + 1, right);
            buffer.deleteCharAt(buffer.length() - 1);
        } else {
            if (left < n) {
                buffer.append('(');
                generateParenthesisDFS(n, index + 1, left + 1, right);
                buffer.deleteCharAt(buffer.length() - 1);
            }
            buffer.append(')');
            generateParenthesisDFS(n, index + 1, left, right + 1);
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        System.out.println(generateParenthesis.generateParenthesis(3));
    }
}

package com.leetcode.m09;

import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {
    private StringBuffer buffer = new StringBuffer();
    private List<String> ans = new LinkedList<String>();
    public List<String> generateParenthesis(int n) {
        //generateParenthesisDFS(n, 0, 0, 0);
        generateParenthesisDFS( n, n);
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
    public void generateParenthesisDFS(int left, int right) {
        if(left<0||right<0)
        {
            return;
        }
        if(left==0&&right==0){
            ans.add(buffer.toString());
            buffer.delete(0,buffer.length());
        }
        if ( left > right){
            return;
        }else if (right == left){
            buffer.append('(');
            generateParenthesisDFS(left-1,right);
        }else if(left < right){
            if(left>0){
                buffer.append('(');
                generateParenthesisDFS(left-1,right);
            }
            buffer.append(')');
            generateParenthesisDFS(left,right-1);
        }

    }
    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        System.out.println(generateParenthesis.generateParenthesis(3));
    }
}

package com.leetcode.m09;

/**
 *   8. 字符串转换整数 (atoi)
 *   比较麻烦的判断，期待自动机实现
 */
public class MyAtoi {
    public int myAtoi(String str) {
        char[] chars = str.trim().toCharArray();
        if (chars.length==0){
            return 0;
        }
        long result = 0;
        int temp;
        boolean isNegative = false;
        int i = 0;
        if(char2Int(chars[0])==-10){
            isNegative = true;
            i=1;
        }else if(char2Int(chars[0])==-11){
            i=1;
        }
        while(i<chars.length){
            if ((temp=char2Int(chars[i]))>-2){
                result = result*10+temp;
                if(result>Integer.MAX_VALUE){
                   break;
                }
            }else{
                break;
            }
            i++;
        }
        if(isNegative){
            result = - result;
        }
        if(result>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(result<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)result;
    }
    public  int char2Int(char ch){
        switch (ch){
            case '0':return 0;
            case '1':return 1;
            case '2':return 2;
            case '3':return 3;
            case '4':return 4;
            case '5':return 5;
            case '6':return 6;
            case '7':return 7;
            case '8':return 8;
            case '9':return 9;
            case '-':return -10;
            case '+':return -11;
        }
        return -2;
    }
    public static void main(String[] args) {
        MyAtoi myAtoi = new MyAtoi();
        System.out.println(myAtoi.myAtoi(""));
        System.out.println(myAtoi.myAtoi("+1"));
        System.out.println(myAtoi.myAtoi("+-2"));
        System.out.println(myAtoi.myAtoi("1"));
        System.out.println(myAtoi.myAtoi("42"));
        System.out.println(myAtoi.myAtoi("   -42"));
        System.out.println(myAtoi.myAtoi("4193 with words"));
        System.out.println(myAtoi.myAtoi("words and 987"));
        System.out.println(myAtoi.myAtoi("-91283472332"));
        System.out.println(myAtoi.myAtoi("-91283472332"));
    }
}

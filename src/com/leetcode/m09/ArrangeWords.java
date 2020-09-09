package com.leetcode.m09;

import java.util.Arrays;

/**
 *  1451. 重新排列句子中的单词
 */
/*
执行用时：966 ms, 在所有 Java 提交中击败了7.11%的用户
内存消耗：41.2 MB, 在所有 Java 提交中击败了37.92%的用户
 */
public class ArrangeWords {
    public String arrangeWords(String text) {
        String[] words = text.split(" ");
        words[0]=captureName(words[0],false);
        String tempStr;
        boolean isDone = true;
        for(int i=0;i< words.length;i++){
            isDone =true;
            for(int j=0;j< words.length-i-1;j++){
                if(words[j].length()> words[j+1].length()){
                    tempStr = words[j];
                    words[j]=words[j+1];
                    words[j+1]=tempStr;
                    isDone = false;
                }
            }
            if(isDone){
                break;
            }
        }
        words[0]=captureName(words[0],true);
        StringBuilder builder = new StringBuilder();
        for (String str : words){
            builder.append(str);
            builder.append(' ');
        }
       // builder.trimToSize();
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }
    /*
    内置排序 Arrays.sort()
    执行用时：25 ms, 在所有 Java 提交中击败94.80%的用户
    内存消耗：40.5 MB, 在所有 Java 提交中击败了88.63%的用户
     */

    public String arrangeWords2(String text) {
        String[] words = text.split(" ");
        words[0]=captureName(words[0],false);
        Arrays.sort(words, (o1, o2) -> {
            return o1.length()-o2.length();
        });
        words[0]=captureName(words[0],true);
        String res="";
        res= String.join(" ", words);
        return res;
    }
    //首字母大写
    public  String captureName(String name,boolean upCase) {
        //name = name.substring(0, 1).toLowerCase() + name.substring(1);
        //return  name;
        char[] cs=name.toCharArray();
        if(upCase){
            cs[0]-=32;
        }
        else{
            cs[0]+=32;
        }
        return String.valueOf(cs);

    }
    public static void main(String[] args) {
        ArrangeWords arrangeWords = new ArrangeWords();
        System.out.println(arrangeWords.arrangeWords2("Keep calm and code on"));
        System.out.println(arrangeWords.arrangeWords2("Leetcode is cool "));
    }
}

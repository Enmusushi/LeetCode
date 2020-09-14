package com.syntax.test;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		// Arrays工具类
		int[] is1 = { 1, 2, 3, 4, 5 };
		int[] is2 = {1,2,3,4,5};
		System.out.println(is1==is2);
		System.out.println(Arrays.equals(is1, is2));
		Arrays.sort(is1);//升序排序（复合排序法：是在归并排序的基础上进一步优化的排序方法）
		System.out.println(Arrays.toString(is2));
		Arrays.fill(is2, 6);
		System.out.println(Arrays.toString(is2));
		int [] is5 = Arrays.copyOf(is1, is1.length<<1);
		System.out.println(Arrays.toString(is5));
		
	}
}

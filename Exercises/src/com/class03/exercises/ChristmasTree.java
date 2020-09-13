package com.class03.exercises;

public class ChristmasTree {
	public void christmasTree(int n) {
		for (int i = 0; i < 3 * n + 1; i++) {
			if (i < n) {
				for (int j = 0; j < 3 * n / 2 - i; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < (i << 1) + 1; j++) {
					System.out.print('*');
				}
			} else if (i <= (n << 1)) {
				for (int j = 0; j < (n<<1)-i; j++) {
					System.out.print(' ');
				}
				for(int j=0;j<(i<<1)-n;j++) {
					System.out.print('*');
				}
			}else {
				for(int j=0;j<n;j++) {
					System.out.print(' ');
				}
				for(int j=0;j<n;j++) {
					System.out.print('*');
				}
			
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ChristmasTree test = new ChristmasTree();
		test.christmasTree(5);
//		test.christmasTree(4);//偶数会偏一点
		test.christmasTree(3);
	}
}

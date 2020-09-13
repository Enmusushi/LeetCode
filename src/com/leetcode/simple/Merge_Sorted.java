package com.leetcode.simple;

/**
 * 88. 合并两个有序数组
 * 
 * @author enmu
 *
 */
public class Merge_Sorted {
	// 1ms 23.36% ,移位操作耗时
	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		int i = 0;
		int j = 0;
		int move = m;
		while (i < move && j < n) {
			if (nums1[i] > nums2[j]) {
				for (int k = move; k > i; k--) {
					nums1[k] = nums1[k - 1];
				}
				nums1[i] = nums2[j];
				move++;
				j++;
			}
			i++;
		}
		while (j < n) {
			nums1[move++] = nums2[j++];
		}
	}

	// 参考别人的，逆向思维
	// 0ms 100%
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (nums1[i] <= nums2[j]) {
				nums1[k--] = nums2[j--];
			} else {
				nums1[k--] = nums1[i--];
			}
		}
		while (j >= 0) {
			nums1[k--] = nums2[j--];
		}
	}
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		Merge_Sorted test = new Merge_Sorted();
		test.merge(nums1, 3, nums2, 3);
		for (int i : nums1) {
			System.out.print(i + " ");
		}

	}

}

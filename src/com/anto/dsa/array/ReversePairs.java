package com.anto.dsa.array;

import java.util.ArrayList;
import java.util.List;

/**
 * see <a href="https://leetcode.com/problems/reverse-pairs/">reverse-pairs<a/>
 * <br>
 * Given an integer array nums, return the number of reverse pairs in the array.
 * 
 * A reverse pair is a pair (i, j) where 0 <= i < j < nums.length and nums[i] > 2 * nums[j].
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class ReversePairs {

	public static void main(String[] args) {
		int count = reversePairs(new int[] {1,3,1,2,3,2,4});
		System.out.println(count);
	}

	public static int reversePairs(int[] nums) {
		return mergeSort(nums, 0, nums.length - 1);
	}

	private static int mergeSort(int[] nums, int low, int high) {
		if (low >= high)
			return 0;
		int mid = (low + high) / 2;
		int count = mergeSort(nums, low, mid);
		count += mergeSort(nums, mid + 1, high);
		count += merge(nums, low, mid, high);
		return count;
	}

	private static int merge(int[] nums, int low, int mid, int high) {
		int count = 0;

		int j = mid + 1;
		for (int i = low; i <= mid; i++) {
			while (j <= high && nums[i] > (2 * (long) nums[j])) {
				j++;
			}
			count += (j - (mid + 1));
		}

		List<Integer> temp = new ArrayList<>();

		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (nums[left] <= nums[right]) {
				temp.add(nums[left++]);
			} else {
				temp.add(nums[right++]);
			}
		}

		while (left <= mid) {
			temp.add(nums[left++]);
		}

		while (right <= high) {
			temp.add(nums[right++]);
		}

		for (int i = low; i <= high; i++) {
			nums[i] = temp.get(i - low);
		}

		return count;
	}
}

package com.anto.dsa.array;

/**
 * see <a href=
 * "https://leetcode.com/problems/remove-duplicates-from-sorted-array/">remove-duplicates-from-sorted-array<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int result = removeDuplicates(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 });
		System.out.println(result);
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int index = 0, lastValue = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == lastValue)
				continue;
			nums[++index] = nums[i];
			lastValue = nums[i];
		}
		return index + 1;
	}
}

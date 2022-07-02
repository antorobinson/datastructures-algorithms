package com.anto.dsa.array;

/**
 * see <a href=
 * "https://leetcode.com/problems/max-consecutive-ones/">max-consecutive-ones<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int result = findMaxConsecutiveOnes(new int[] { 0, 1, 0, 1, 0, 1, 1, 0, 1 });
		System.out.println(result);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				max = Math.max(max, count);
				count = 0;
			}
		}
		max = Math.max(max, count);
		return max;
	}
}

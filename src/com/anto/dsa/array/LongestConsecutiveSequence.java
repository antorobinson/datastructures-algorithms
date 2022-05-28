package com.anto.dsa.array;

import java.util.*;

/**
 * see <a href=
 * "https://leetcode.com/problems/longest-consecutive-sequence/">longest-consecutive-sequence<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int result = longestConsecutive(new int[] { -7, 2, -3, 8, 9, 0, 8, 4, -5, 8, -5, -5, 1, 6, 4 });
		System.out.println(result);
	}

	public static int longestConsecutive(int[] nums) {

		int longestSequence = 0;

		Set<Integer> numSet = new HashSet<>();

		for (int i : nums) {
			numSet.add(i);
		}

		for (int num : numSet) {
			// intution is that for each start of sequence, we will not have prev element
			if (!numSet.contains(num - 1)) {
				int temp = 1;
				int curr = num;
				while (numSet.contains(curr + 1)) {
					temp++;
					curr++;
				}
				longestSequence = Math.max(temp, longestSequence);
			}
		}

		return longestSequence;
	}

}

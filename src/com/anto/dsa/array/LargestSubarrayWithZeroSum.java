package com.anto.dsa.array;

import java.util.*;

/**
 * Given an array having both positive and negative integers. The task is to
 * compute the length of the largest subarray with sum 0.
 * 
 * see <a href=
 * "https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1#">largest-subarray-with-0-sum<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class LargestSubarrayWithZeroSum {

	public static void main(String[] args) {

		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println(maxLen(arr));

	}

	static int maxLen(int arr[]) {
		int length = arr.length;

		Map<Integer, Integer> map = new HashMap<>();

		int sum = 0;
		int max = 0;

		for (int i = 0; i < length; i++) {
			sum += arr[i];
			if (sum == 0) {
				max = Math.max(max, i + 1);
			} else {
				if (map.containsKey(sum)) {
					max = Math.max(max, i - map.get(sum));
				} else {
					map.put(sum, i);
				}
			}
		}
		return max;
	}

}

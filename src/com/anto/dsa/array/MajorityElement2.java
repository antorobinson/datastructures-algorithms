package com.anto.dsa.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;

/**
 * @author Sahaya Anto Robinson
 *
 */
public class MajorityElement2 {

	public static List<Integer> majorityElement(int[] nums) {

		int element1 = 0;
		int element2 = 0;
		int count1 = 0;
		int count2 = 0;
		int len = nums.length;

		for (int num : nums) {
			if (num == element1) {
				count1++;
			} else if (num == element2) {
				count2++;
			} else if (count1 == 0) {
				element1 = num;
				count1 = 1;
			} else if (count2 == 0) {
				element2 = num;
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}

		List<Integer> result = new ArrayList<>();
		count1 = 0;
		count2 = 0;

		for (int num : nums) {
			if (element1 == num)
				count1++;
			else if (element2 == num)
				count2++;
		}

		if (count1 > len / 3)
			result.add(element1);
		if (count2 > len / 3)
			result.add(element2);

		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 1, 4, 5, 5 };
		List<Integer> output = majorityElement(arr);
		assertThat(output.get(0)).isSameAs(1);

	}

}

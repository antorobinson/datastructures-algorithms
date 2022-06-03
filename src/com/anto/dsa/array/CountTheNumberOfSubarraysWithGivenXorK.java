package com.anto.dsa.array;

import java.util.*;

/**
 * see <a href=
 * "https://www.interviewbit.com/problems/subarray-with-given-xor/">subarray-with-given-xor<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class CountTheNumberOfSubarraysWithGivenXorK {

	public static void main(String[] args) {

		int[] a = { 4, 2, 2, 6, 4 };
		int b = 6;

		System.out.println(solve(a, b));

	}

	public static int solve(int[] A, int B) {
		Map<Integer, Integer> visited = new HashMap<>();
		int c = 0;
		int cpx = 0;
		int n = A.length;
		for (int i = 0; i < n; i++) {
			cpx = cpx ^ A[i];
			if (visited.get(cpx ^ B) != null)
				c += visited.get(cpx ^ B);
			if (cpx == B) {
				c++;
			}
			if (visited.get(cpx) != null)
				visited.put(cpx, visited.get(cpx) + 1);
			else
				visited.put(cpx, 1);
		}
		return c;
	}

}

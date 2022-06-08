package com.anto.dsa.array;

import java.util.*;


/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * see <a href=
 * "https://leetcode.com/problems/longest-substring-without-repeating-characters">longest-substring-without-repeating-characters<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		int out = lengthOfLongestSubstring("abba");
		System.out.println(out);
	}

	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int result = 0;
		int startIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				startIndex = Math.max(startIndex, map.get(s.charAt(i)) + 1);
			}

			map.put(s.charAt(i), i);
			result = Math.max(result, i - startIndex + 1);
		}
		return result;
	}

}

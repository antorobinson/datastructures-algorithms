package com.anto.dsa.recursion;

import java.util.*;

/**
 * see <a href=
 * "https://takeuforward.org/data-structure/subset-ii-print-all-the-unique-subsets/">subset-ii-print-all-the-unique-subsets<a/>
 *
 * @author Sahaya Anto Robinson
 *
 */
public class SubSet2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> output = subsetsWithDup(nums);
        System.out.println(output);

    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        func(0, result, new ArrayList<>(), nums);
        return result;

    }
    static void func(int index, List<List<Integer>> result, List<Integer> arr, int[] nums) {
        result.add(new ArrayList<>(arr));

        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) continue;
            arr.add(nums[i]);
            func(i + 1, result, arr, nums);
            arr.remove(arr.size() - 1);
        }
    }
}

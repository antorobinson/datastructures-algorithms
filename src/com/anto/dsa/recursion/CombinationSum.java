package com.anto.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * see <a href=
 * "https://takeuforward.org/data-structure/combination-sum-1/">combination-sum-1<a/>
 *
 * @author Sahaya Anto Robinson
 *
 */
public class CombinationSum {

    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        List<List<Integer>> output = combinationSum(nums, target);

        System.out.println(output);

    }
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        func(0, result, new ArrayList<>(), nums, target);
        return result;

    }
    static void func(int index, List<List<Integer>> result, List<Integer> arr, int[] nums, int target) {
        if(target == 0){
            result.add(new ArrayList<>(arr));
            return;
        }

        if(target < 0) return;

        for (int i = index; i < nums.length; i++) {
            arr.add(nums[i]);
            func(i , result, arr, nums, target-nums[i]);
            arr.remove(arr.size() - 1);
        }
    }
}

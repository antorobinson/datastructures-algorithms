package com.anto.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * see <a href=
 * "https://takeuforward.org/data-structure/combination-sum-ii-find-all-unique-combinations/">combination-sum-ii-find-all-unique-combinations<a/>
 *
 * @author Sahaya Anto Robinson
 *
 */
public class CombinationSum2 {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,6,7};
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

        for (int i = index; i < nums.length; i++) {
            if(nums[i] > target) break;
            if(i != index && nums[i] == nums[i-1]) continue;
            arr.add(nums[i]);
            func(i+1 , result, arr, nums, target-nums[i]);
            arr.remove(arr.size() - 1);
        }
    }
}

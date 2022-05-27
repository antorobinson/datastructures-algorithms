package com.anto.dsa.array;

import java.util.*;


/**
 * see <a href="https://leetcode.com/problems/4sum/">4sum<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class FourSum {

	public static void main(String[] args) {
		List<List<Integer>> result = fourSum(new int[] {0,0,0,0}, 0);
		
		System.out.println(result);
	}

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        
    	 List<List<Integer>> result = new ArrayList<>();
         
         int length = nums.length-1;
         
         Arrays.sort(nums);
         
         for(int i=0; i<length-2; i++){
             int target3 = target - nums[i];
             for(int j=i+1; j<length-1; j++){
                 int target2 = target3 - nums[j];
                 
                 int lo = j+1;
                 int hi = length;
                 
                 while(lo<hi){
                     
                     int sum = nums[lo]+nums[hi];
                     if(sum == target2){
                         result.add(Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]));
                         while(lo<hi && nums[lo]==nums[lo+1]) lo++;
                         while(lo<hi && nums[hi]==nums[hi-1]) hi--;
                         lo++;
                         hi--;
                     }else if(sum>target2){
                         hi--;
                     }else{
                         lo++;
                     }
                 }
                 while(j<length-1 && nums[j]==nums[j+1]) j++;
             }
             while(i<length-2 && nums[i]==nums[i+1]) i++;
         }
         return result;
    }
}

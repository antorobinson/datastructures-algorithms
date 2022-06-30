package com.anto.dsa.array;

import java.util.*;

/**
 * see <a href=
 * "https://leetcode.com/problems/longest-consecutive-sequence/">longest-consecutive-sequence<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class TrappingRainWater {

	public static void main(String[] args) {
		int result = trap(new int[] { 0,1,0,2,1,0,1,3,2,1,2,1 });
		System.out.println(result);
	}

	public static int trap(int[] height) {

		int p1 = 0, p2=height.length-1;
        int left=height[p1], right=height[p2], output = 0;
        
        while(p1<p2) {
        	if(height[p1]<height[p2]) {
        		if(height[p1]<left) {
            		output += left - height[p1];
            	}else {
            		left = height[p1];
            	}
        		p1++;
        	}else {
            	if(height[p2]<right) {
            		output += right - height[p2];
            	}else {
            		right = height[p2];
            	}
            	p2--;
        	}
        }
        return output;
	}

}

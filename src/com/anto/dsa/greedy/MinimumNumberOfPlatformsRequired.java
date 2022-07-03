package com.anto.dsa.greedy;

import java.util.Arrays;

/**
 * see <a href=
 * "https://takeuforward.org/data-structure/minimum-number-of-platforms-required-for-a-railway/">minimum-number-of-platforms-required-for-a-railway<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class MinimumNumberOfPlatformsRequired {
    public static void main(String args[]) {
        int[] arr = { 900, 945, 955, 1100, 1500, 1800 };
        int[] dep = { 920, 1200, 1130, 1150, 1900, 2000 };
        int n = arr.length;
        int totalCount = countPlatforms(arr, dep, n);

        System.out.println(totalCount);

    }

    public static int countPlatforms(int[] start, int[] end, int n) {

        Arrays.sort(start);
        Arrays.sort(end);

        int platformNeeded = 0, result = 0, i = 0, j = 0;

        while (i < n && j < n) {
            if (start[i] <= end[j]) {
                platformNeeded++;
                i++;
            } else {
                platformNeeded--;
                j++;
            }
            result = Math.max(platformNeeded, result);
        }

        return result;
    }
}
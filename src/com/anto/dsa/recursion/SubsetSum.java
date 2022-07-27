package com.anto.dsa.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * see <a href=
 * "https://takeuforward.org/data-structure/subset-sum-sum-of-all-subsets/">subset-sum-sum-of-all-subsets<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class SubsetSum {
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);

        List<Integer> ans = subsetSums(arr, arr.size());

        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

    static List<Integer> subsetSums(List<Integer> arr, int N){

        List<Integer> result = new ArrayList<>();
        func(0, 0, arr, result, N);
        Collections.sort(result);
        return result;
    }

    static void func(int index, int sum, List<Integer> arr, List<Integer> result, int N){

        if(index == N){
            result.add(sum);
            return;
        }

        func(index+1, sum+arr.get(index), arr, result, N);
        func(index+1, sum, arr, result, N);
    }

}

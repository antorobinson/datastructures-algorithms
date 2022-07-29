package com.anto.dsa.greedy;

import java.util.Arrays;

/**
 * see <a href=
 * "https://takeuforward.org/data-structure/job-sequencing-problem/">job-sequencing-problem<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class JobSequencingProblem {

    public static void main(String args[]) {

        Job[] arr = new Job[4];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);
        
        int[] res = jobScheduling(arr, 4);

        System.out.println(res[0]+" "+res[1]);

    }

    public static int[] jobScheduling(Job arr[], int n) {

        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int max = 0;
        for(Job j : arr){
            max = Math.max(max, j.deadline);
        }

        int[] window = new int[max+1];

        for(int i = 1; i<max;i++){
            window[i] = -1;
        }

        int countOfJobs = 0, totalProfit = 0;

        for(int i = 0; i<n; i++){
            for(int j = arr[i].deadline; j>0; j--){
                if(window[j] == -1){
                    window[j] = arr[i].id;
                    countOfJobs++;
                    totalProfit += arr[i].profit;
                    break;
                }
            }
        }

        return new int[] {countOfJobs, totalProfit};

    }
}

class Job{
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
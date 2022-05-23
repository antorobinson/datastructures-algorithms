package com.anto.dsa.array;

/**
 * see <a href="https://leetcode.com/problems/unique-paths/">unique-paths<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class UniquePaths {

	public static void main(String[] args) {
		System.out.println(uniquePaths(10,10));
	}
	
	public static int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        
        for(int i=1; i<m; i++){
            arr[i][0] = 1;
        }
        
        for(int i=1; i<n; i++){
            arr[0][i] = 1;
        }
        
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
            }
        }
        
        return arr[m-1][n-1];
    }

}
package com.anto.dsa.array;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

/**
 * see <a href="https://www.geeksforgeeks.org/maximum-area-of-a-cake-after-horizontal-and-vertical-cuts/">maximum-area-of-a-cake-after-horizontal-and-vertical-cuts<a/>
 * 
 * @author Sahaya Anto Robinson
 * 
 */
public class MaxAreaOfCakeAfterHorizontalAndVerticalCut {

	public static void main(String[] args) {
		
		int result = getLargestPiece("9,9", new int[] {3,6}, new int[] {3,6});
		assertThat(result).isSameAs(9);
	}

	public static int getLargestPiece(String s, int[] x, int[] y) {
		
		String[] size = s.split(",");
		int width = Integer.parseInt(size[0]);
		int height = Integer.parseInt(size[1]);
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		int maxWidth = x[0];
		int maxHeight = y[0];
		
		for(int i=1; i<x.length-1; i++) {
			maxWidth = Math.max(maxWidth, x[i] - x[i-1]);
		}
		
		for(int i=1; i<y.length-1; i++) {
			maxHeight = Math.max(maxHeight, y[i] - y[i-1]);
		}
		
		maxWidth = Math.max(maxWidth, width - x[x.length-1]);
		maxHeight = Math.max(maxHeight, height - y[y.length-1]);

		return maxWidth*maxHeight;
		
	}
}

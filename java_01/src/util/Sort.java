package util;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] l = {33,22,34,24};
		sort(l);
	System.out.println(Arrays.toString(l))	;	
	}
            public static int[] sort(int[] nums) {
            	//배열 원본은 변경이 되지 않도록 하고 
            	//오름차순으로 정렬된 int[]을 리턴한다.
        		int[] copy = new int[nums.length];
        		System.arraycopy(nums, 0, copy, 0, nums.length);
        		//정렬
        		int[] num = copy;
        		for(int i=0;i<copy.length-1;i++) {
        			int min = i;
        			for(int j=i+1;j<copy.length;j++) {
        				if(copy[i] > copy[j]) {
        					int temp = copy[i];
        					copy[i] = copy[j];
        					copy[j] = temp;
        			}
        				}
        		}
        			
        	return copy;
            
}
            }

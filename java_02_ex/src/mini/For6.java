package mini;

import java.util.Arrays;

public class For6 {
	public static void main(String[] args) {
		
	int[] aa = {1,2,3,4,5};
	int[] ab = {2,3,4,5,6};
	int[] ac = new int[aa.length];
	for(int i=0;i<aa.length; i++) {
		ac[aa.length-i-1] = (aa[i]+ab[i]);
	}
	for(int i=0,j=aa.length-1;i<aa.length; i++,j--) {
		ac[j] = (aa[i]+ab[i]);
	}
	System.out.println(Arrays.toString(ac));
	}
	}


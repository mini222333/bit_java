package mini;

import java.util.Arrays;

public class For5 {
	public static void main(String[] args) {
		int[] aa = new int[5];
		String[] ab = {"11","22","33","44","55"};
		for (int i=0;i<ab.length;i++) {
			aa[i]=Integer.parseInt(ab[i]);}
			System.out.println(Arrays.toString(aa));
			//출력:[11,22,33,44,55]
		}
	
}

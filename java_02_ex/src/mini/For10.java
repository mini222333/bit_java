package mini;

import java.util.Arrays;

public class For10 {
	public static void main(String[] args) {
		int[] aa = {2,4,3,0,5,6,1};
		char[] ab = {'했','박','다','수','민','희','고'};
		char[] ac = new char[ab.length];
		
		for(int i=0;i<aa.length;i++) {
			for(int j=0; j<aa.length;j++) {
				if(aa[j]==i) {
					ac[i]=ab[j];
				}
				
			}
		}
		System.out.println(Arrays.toString(ac));
	}
}

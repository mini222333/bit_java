package mini;

public class For3 {
	public static void main(String[] args) {
		int[] aa = {1, 2, 3, 4};
		int sum = 0;
		int gop = 1;
		
		for(int i=0; i<aa.length; i++) {
				sum+=aa[i];
				gop*=aa[i];
		   }
			System.out.println(sum+" "+gop);
		}
}

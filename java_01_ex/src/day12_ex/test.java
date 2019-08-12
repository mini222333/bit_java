package day12_ex;

public class test {
	public static void main(String[] args) {
		char [] x ={'a','b','c'};
		char [] y = {'h','e','l','l','o'};
		
		
		System.arraycopy(x, 2, y, x.length, 1);
		
		for ( int inx = 0; inx<y.length;inx++) {
			System.out.print(y[inx]);
		}
	}
	
	//답 helco

}

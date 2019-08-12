package day02;

public class Test04 {

	public static void main(String[] args) {
		
		System.out.println("byte type max value => "+Byte.MAX_VALUE);
		System.out.println("int type max value => "+Integer.MAX_VALUE);
		System.out.println("long type max value => "+Long.MAX_VALUE);
		
		final int max=0;
		System.out.println(Math.PI);
		
		char c = 's';
		System.out.println(c + " 숫자니? "+Character.isDigit(c));
		
		String ss = "1"+"1";
		System.out.println(ss);
		
		int s1 = Integer.parseInt("1") + Integer.parseInt("1");
		System.out.println(s1);
		
		double s2 = Double.parseDouble ("1.6") + Double.parseDouble("1.6");
		//double s2 = 1.6 + 1.7;
		System.out.println(s2);
	
	}
}

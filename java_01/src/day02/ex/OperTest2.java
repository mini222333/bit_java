package day02.ex;

public class OperTest2 {
	public static void main(String[] args) {
		int a,b;
		a = b = 10;
		
		boolean c = ++a > b++ || a++ >= ++b;
		
		System.out.println(a+","+b);
		System.out.println("변수 c의 값 :"+c);
	}

}

package day16;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(" main start ");
		int a = 10, b = 0;
		
		try {//예외처리 트라이캐치
			System.out.println(1);
		System.out.println(a/b); //throw new ArithmeticException() 예외 발생 런타임익셉션 언체크익셉션
		System.out.println(2);
		}catch (ArithmeticException e) {//예외발생하면 바로 캐치블락으로 감 2 못찍음 예외발생했을때만 수해
			System.out.println("예외발생 :"+e.getMessage());
			e.printStackTrace();//예외정보찍어주는메소드
			System.out.println(3);
		}finally {//예외 발생하든 안하든 항상 수행
			System.out.println("finally { 항 상 수 행 } ");
		}
		
	
		System.out.println("-----------------------------");
		//예외처리적절하지않음 if넣어서설계해야함
		//if(b!=0) System.out.println(a/b);
		

		System.out.println(" main end ");
	}

}
//ArithmeticException ss;
//NullPointerException nn;
//IndexOutOfBoundsException ii;
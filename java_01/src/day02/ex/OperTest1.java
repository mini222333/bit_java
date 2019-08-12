package day02.ex;

public class OperTest1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(++a);//++선처리 후처리++
		
	    System.out.println(++a + b++);
	    
	    System.out.println((++a%3) + (a*++b));
	    System.out.println(b);
	}

}

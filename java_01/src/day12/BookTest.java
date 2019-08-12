package day12;

public class BookTest {

	public static void main(String[] args) {
		String msg1 ="hello";
		String msg2 ="hello";
		
		System.out.println(msg1.toString());
		System.out.println(msg2);
		System.out.println(msg1.equals(msg2));
		
		Book b1 = new Book ("java", 2200);
	    Book b2 = new Book ("java", 2200);
		System.out.println(b1.toString());
		System.out.println(b1.equals(b2));
		System.out.println(b2);
		
		//msg1= null;
		//System.out.println(b1.equals(new Date()));
		
		
		b1.close();
		b2.close();
		b1=null;
		b2=null;
		
		//null어싸인전에 클로즈
		//내가 다 썼던 자원은 null어싸인을 해야만한다 기본.하지않으면 메모리누수발생
		//System.gc(); //가비지콜렉터
		
		
		System.out.println("=== main end ===");
	}
}

package day02;

public class Test02 {
    public static void main(String[] args) {
		int num = 99;
		System.out.println(num);
		
		String name="홍길동";
		System.out.println(name.charAt(0)+"**");
		System.out.println("*"+name.charAt(1)+"*");
		String address = new String("비트교육센터");
		System.out.println(address+" : "+address.length());
		
		
		long number = 99999999999L;
		System.out.println(number);
		
		System.out.println('A'+":"+(int)'A');
		System.out.println('Z'+":"+(int)'Z');
		System.out.println('a'+":"+(int)'a');
		System.out.println('z'+":"+(int)'z');
		System.out.println('0'+":"+(int)'0');
		System.out.println('9'+":"+(int)'9');

    }
}

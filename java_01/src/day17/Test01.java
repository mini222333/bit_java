package day17;

public class Test01 {
       public static void main(String[] args) {
    	   Book1 b1 = new Book1 ("java",900);//<T>타입 기술 안하면 타입 자동으로 Object 처리
	      System.out.println(b1);
	      
	      Book1<Double> b2 = new Book1<Double>("sql", 700.0);//new double(700) 사용가능
	      System.out.println(b2);
	      
	      Book1<Integer> b3 = new Book1<Integer>("JSP", 5000);//오토박싱 언박싱 객체화 기본형 내부적으로 변환 int integer
         System.out.println(b3);
        //Integer 객체.기능 사용가능
         //int 기능사용불가능
       }

}

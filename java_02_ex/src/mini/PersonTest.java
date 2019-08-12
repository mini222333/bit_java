package mini;

import java.util.Arrays;

public class PersonTest {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Ediya");
		p1.setAge(25);
		p1.setSex("여");
		p1.grow();
		
		Person p2 = new Person("Marry",25,"여");
		System.out.println();
		
		if(p2.sex.equals("여")) {//스트링은 equals int ==
			System.out.println("여자입니다");
		}
		
	}

}

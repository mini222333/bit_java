package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest {
	public static void main(String[] args) {
		Animal d = new Dog("진돗개", "쫑이");
		if(d instanceof Dog) ((Dog)d).dogPrint();
		
		Dog dd = (Dog) d;
		if(d instanceof Fish) {
			Fish ff = (Fish) d;
		}
		
		d.breath();
		Animal f = new Fish("구피");
	    if (f instanceof Fish) ((Fish)f).fishPrint();//다운캐스팅 피쉬타입이라고볼수있을때만
	    f.breath();//메소드오버라이딩 하면 다운캐스팅 없이 하단부 데이터 접근 가능
	    ((Fish)f).breath();//자식영역에선 당연히 불러올수있음
	    //부모 데이터 쓰고싶으면 Animal 에서 super.써야함
	
	}
}

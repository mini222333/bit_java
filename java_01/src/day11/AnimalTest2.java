package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal[] animals = {
				new Dog("진돗개", "쫑이"),
		new Fish("구피"),
		new Dog("시베리안허스키", "캐리")
	
	};
		
//		for(Animal data :animals)
//		{ data.breath();
//	      data.print();
//			}
		
		Dog a1 = new Dog("진돗개","쫑이");
		Fish f1 = new Fish("구피");
		callD(animals[0]);
		callD(animals[1]);
		//자바 폴리모피즘(다형성)
		}
	
	
	public static void callD(Animal d) {//폴리모피즘
		d.breath();
		
	}
}

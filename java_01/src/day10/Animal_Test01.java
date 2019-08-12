package day10;

public class Animal_Test01 {

	public static void main(String[] args) {
	
		Animal a1 = new Animal();
		a1.breath();
		
		Animal a2 = new Animal("Dog");
		a2.breath();
		
		//Dog d1 = new Dog();
		Dog d1 = new Dog("시베리안허스키","케리");
		d1.breath();
		d1.dogPrint();
		Dog d2 = new Dog("Dog","진돗개","쫑이");
		d2.dogPrint();
		
		String animalKind = d2.getSuperKind();//스테이틱 영역에서는 this.super 키워드 못씀
		System.out.println(animalKind);
	
	}

}

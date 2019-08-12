package day12_ex;

public class Person {
	private String name;
	private int age;

	public Person() {
		super();//생성자 this super 둘중 하나만 첫번째줄에 사용 가능 
	
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;

		
	}
	
	class Employee extends Person{
		private String dept;
	}
	

}

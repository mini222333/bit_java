package day11;

public class Prob10 {
	public static void main(String[] args) {

		Object[] p = { new Student("홍길동", 20, 2012001), new Teacher("이순신", 30, "JAVA"), new Employee("유관순", 40, "교무과")

		};

		for (Object data : p) {
			//data.printA();// 부모Person() 영역의 자원을 접근할때는 바로 접근 가능
			//Object 밑에서 print,printA로 접근 가능
			System.out.println();
		}
		System.out.println("===================");

		for (Object data : p) {
			// 자식 영역의 자원을 접근할때는 다운캐스팅 필요
			// 반드시 하단부에 어떤 객체가 바인딩 되어있는지 타입 체크 필요
			if (data instanceof Student)
				((Student) data).print();
			if (data instanceof Teacher)
				((Teacher) data).print();
			if (data instanceof Employee)
				((Employee) data).print();
		}
	}
}
/*
class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printA() {
		System.out.printf("이름 : %s , 나이 : %2d ", this.name, this.age);
	}

}

class Student extends Person {
	private int id;

	public Student() {
	}

	public Student(String name, int age, int id) {
		super(name, age);
//		super.setName(name);
//		super.setAge(age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		super.printA();
		System.out.printf("학번 : %s %n", id);
	}
}

class Teacher extends Person {
	private String subject;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		super.printA();
		System.out.printf("담당과목 : %s %n", subject);
	}

}

class Employee extends Person {
	private String dept;

	public Employee() {
		super();
	}

	public Employee(String name, int age) {
		this(name, age, null);
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		super.printA();
		System.out.printf("부서 : %s %n", dept);
	}
}*/

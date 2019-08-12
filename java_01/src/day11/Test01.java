package day11;

public class Test01 {

	public static void main(String[] args) {

	Person a =	new Student("홍길동",20,20121401);//Person으로받아줘도 가능
	Teacher t =	new Teacher("이순동",30,"자바");
	Employee e = new Employee("유순동",40,"영업");
		//같은라인 호환x
	
	Person p = null; //== Person p = a;
	p = a;
	//p.printA(); //부모타입이 가지고있는 printA는 접근 가능
	//p.print(); //부모타입 접근 불가능
	((Student)p).print(); // 다운캐스팅
	
	p=t; // t는 맨아래영역 teacher이므로 student아닌 teacher로 다운캐스팅
	((Teacher)p).print();
	
	p=e;
	((Employee)p).print();
	
	}
	
	

}

class Person {

	public Person() {
		super();// 기본 생성자
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.setAge(age);// set 자동 유효성체크 set은 super영역에 있으므로 super에서 사용가능
	}

	private String name;
	private int age;

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
		System.out.printf("이름 : %s , 나이 : %2d ", this.getName(), this.getAge());

	}

}
class Student extends Person {

		private int id;

		public Student() {
		} // 기본생성자

		public Student(String name, int age, int id) {
			super(name, age);
			// super.setName(name);
			// super.setAge(age);
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
			System.out.printf("학번 : %s %n ", id);
		}

	}

	class Teacher extends Person {

		public Teacher() {
			super();
		}

		public Teacher(String name, int age, String subject) {
			super(name, age);
			this.subject = subject;
		}

		private String subject;

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public void print() {
			super.printA();
			System.out.printf("과목 : %s %n ", subject);

		}

		
	}
	class Employee extends Person {

		public Employee(String name, int age) {
			//this(name, age, null);
			super(name,age);
		}

		public Employee(String name, int age, String dept) {
			super(name, age);
			this.dept = dept;
		}

		private String dept;

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public void print() {
			super.printA();
			System.out.printf("부서 : %s %n ", dept);
		}
		
	}
	
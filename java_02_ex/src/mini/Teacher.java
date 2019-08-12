package mini;

public class Teacher extends Person {
	Student[] student = new Student[10];

	Student best = null;
	Student subject;

	Teacher() {
	}

	Teacher(String name, int age, String sex) {
		super(name, age, sex);

	}

	public void print() {
		super.print();
		System.out.println("수제자:"+best);
		System.out.println("과목:"+subject);
		
	}

	public void studentBest() {
		System.out.println(getName());
		for (Student data : student) {
			if (data.getName().equals("수제자")) {
				best = data;
				return;
			}
		
		}
		best = null;
	}
	
}

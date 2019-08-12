package mini;

public class Student extends Person{
	
	String class1;
	int number;
	
	Student(){
	}
	Student(String name, int age, String sex){
		super(name,age,sex);

}
	
	
	
	
	public void print() {
		super.print();
		System.out.println("반:"+ class1 );
		System.out.println("번호:"+ number );
		
	}
	@Override
	public String toString() {
		return "Student [getName="+getName()+",getAge="+getAge()+",getSex="+getSex()+",class1=" + class1 + ", number=" + number + "]";
	}

}

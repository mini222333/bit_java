package day19;


public class Employee implements Comparable<Employee>{//트리셋 정렬 sort 조건 extends Object 생략가능
	int number;
	String name;
	String dept;
	
	
	public Employee() {}


	public Employee(int number, String name, String dept) {
		super();
		this.number = number;
		this.name = name;
		this.dept = dept;
	}
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public int compareTo(Employee o) {//트리셋 정렬 sort조건
		// TODO Auto-generated method stub
		return number-o.number;
	}//ComparTo 오버라이딩

	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (number != other.number)
			return false;
		return true;
	}
	//알아서 중복체크해줌	//넘버만 체크하고싶으면 이퀄즈 넘버만 생성


}



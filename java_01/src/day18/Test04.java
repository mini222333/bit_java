package day18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
		
	Set<Employee> set = new HashSet<Employee>();
	boolean flag = set.add(new Employee(2017001, "홍씨", "영업부"));
	if(flag) System.out.println("등록되었습니다.");
	flag = set.add(new Employee(2017001, "홍씨", "영업부"));
	if(!flag) System.out.println("이미 존재하는 데이터입니다.");//true
	
	set.add(new Employee(2017002, "김씨", "마케팅부"));
	set.add(new Employee(2017003, "박씨", "기술부"));
	
	//이터레이터로 셋에있는목록출력
	System.out.println(" 사원목록 ");
	Iterator<Employee> it = set.iterator();
	while (it.hasNext()) {
	Employee data = it.next();//데이터넘겨받음
    System.out.println(data.toString());
	}
	System.out.println();
	//2017003 사번의 사원을 검색 출력하세요
	
    it = set.iterator();
    System.out.println("검색 결과입니다. ");
    while (it.hasNext()) {
    	Employee data = it.next();
    	if(data.number == 2017003) {
    	System.out.println(data);
    	}
    }
	}
}

class Employee implements Comparable<Employee>{//트리셋 정렬 sort 조건 extends Object 생략가능
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

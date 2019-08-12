package day06;

public class Test02 {
	public static void main(String[] args) {
		//int num;
		//String name;
		Employee emp1 = new Employee();
		//System.out.println(emp1.age+":"+emp1.name+":"+emp1.dept);
		//emp1 object
		//new=객체 생성.힙영역에 띄우는것
		//객체(object)=(instance) 프로그램에서 사용하기 위해 어떤 클래스 속성을 갖는것을 하나 만든것
		//로컬변수는 디폴트초기화x 멤버변수는 디폴트초기화가 이루어짐 ex) number name dept
		//클래스>새로운 데이터타입
		//number는 기본형이라 .못씀 
		//emp2=emp1> emp2의 내용이 emp1으로 바뀜 emp2>가비지컬렉션
		//new employee 템포러리 객체.잠깐 쓰고 버리는것 메모리에 띄우고 도트 쓸수있음
		//바운더리 안에서 this 키워드 쓸 수 있음. emp1 this number= emp1.number
		
		//접근지정자가 디폴트.같은 패키지에있어야 접근 가능 퍼블릭을 붙이면 접근 가능*day 06
		Employee emp2 = new Employee();
		//emp2.age = 201901;
		//emp2.name="홍길동";
		//emp2.dept="인사부";
		//System.out.println(emp2.age+":"+emp2.name+":"+emp2.dept);
		Employee emp3 = new Employee();
		//emp3.age=201902;
		//emp3.name="고길동";
		//emp3.dept="영업부";
		//System.out.println(emp3.age+":"+emp3.name+":"+emp3.dept);
		
		
	}

}

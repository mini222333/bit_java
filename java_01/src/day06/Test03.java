package day06;

public class Test03 {
	public static void main(String[] args) {
		//int num;
		//String name;
		Employee emp1 = new Employee();
		emp1.display();
		//System.out.println(emp1.age+":"+emp1.name+":"+emp1.dept);
		//emp1 object
		//new=객체 생성.힙영역에 띄우는것.메모리에뜸
		//객체(object)=(instance) 프로그램에서 사용하기 위해 어떤 클래스 속성을 갖는것을 하나 만든것
		//인스턴스 주소 반드시 필요함 
		//로컬변수는 디폴트초기화x 멤버변수는 디폴트초기화가 이루어짐 ex) number name dept
		//클래스>새로운 데이터타입
		//number는 기본형이라 .못씀 
		//emp2=emp1> emp2의 내용이 emp1으로 바뀜 emp2>가비지컬렉션
		//new employee 템포러리 객체.잠깐 쓰고 버리는것 메모리에 띄우고 도트 쓸수있음
		//바운더리 안에서 this 키워드 쓸 수 있음.힙영역안에서만. emp1 this number= emp1.number
		//접근지정자가 디폴트.같은 패키지에있어야 접근 가능 퍼블릭을 붙이면 접근 가능*day 06
		//함수를 호출했을때 어떤 타입이 돌아오는것=리턴타입 ex) "hello".charAt(0)='h'
		//할일만 하고 그자리에 아무것도 안돌아오는것=void
		//Math.random(),Math.PI 메모리에 띄울필요xnew안씀 스테이틱한자원
		//number,name등등 꼭 new를 써줘야함 다다르기때문에 인스턴스베리어블
		
		
		//객체지향 프로그래밍
		//인캡슐레이션 캡슐화
        //상속 java에서는 단일 상속
		//메시지 객체간에 서로 통신 car.changeGear(lowerGear);
	    //polymorphism(다형성):상속이전제
		//클래스 설계는 보는 관점에 따라서 달라질 수 있다
		Employee emp2 = new Employee();
		//emp2.age = -201901;//프라이빗으로 막아놓아서 setAge
		emp2.setAge(31);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		emp2.display();
		//System.out.println(emp2.age+":"+emp2.name+":"+emp2.dept);
		Employee emp3 = new Employee();
		//emp3.age=201902;
		emp3.setAge(27);
		emp3.setName("고길동");
		emp3.setDept("영업부");
		emp3.setSingle(true);
		emp3.display();
		//System.out.println(emp3.age+":"+emp3.name+":"+emp3.dept);
		
		
	}
	
	

}

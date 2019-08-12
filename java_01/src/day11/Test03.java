package day11;

public class Test03 {
	public static void main (String args[] ) {
		Person p = new Person ("고길동", 22);
		
		Person s = new Student("홍길동", 20, 2019001);
		Employee e = new Employee("유관순", 48, "교무과");
	    Object o = new Teacher("이순신", 30, "JAVA");
	    Object msg = new String ("Hello JAVA");
	//저장하기위해 변수 필요
	//equals tostring을 쓸게 아니라면 object 무조건 다운캐스팅
	    //new 키워드 클래스 로딩>객체생성완료>변수에 저장
	}

}

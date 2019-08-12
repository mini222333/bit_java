package day07;

public class EmployeeTest {

	public static void main(String[] args) {
		
      Employee emp1 = new Employee();//emp1 로컬변수 .new 메모리에 언로케이트. ()기본생성자
      emp1.print();
      //객체 생성 될때마다 생성자함수는 자동으로 호출됨
      Employee emp2 = new Employee();
      emp2.print();
      Employee emp3 = new Employee();
      emp3.print();

	}

}

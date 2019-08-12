package day08;

public class EmployeeTest {
           public static void main(String[] arges) {
           	 Employee emp1 = new Employee();//객체생성
           	 //emp1.setName("홍길동");
           	 //emp1.setDept("인사부");
           	 //emp1.setSingle(true);
				//this("사원이름","ㅇㅇㅇ부서",true); this 쓰면 빠져도 또다른 생성자함수 호출. 출력
             emp1.print();
           	 Employee emp2 = new Employee("고길동","영업부",false);//프린트메소드가 찍어줌 파라미터3
             emp2.print();
           	 Employee emp3 = new Employee("김길동","영업부");//파라미터2
           	 emp3.print();
           	 Employee emp4 = new Employee("최길동","기술부",false);
           	 emp4.print();
               }
}

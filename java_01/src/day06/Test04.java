package day06;

public class Test04 {

	public static void main (String[] args) {
		//배열
		//메인메소드안에선 this 못씀
		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();
		emp2.setAge(31);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		
		Employee emp3 = new Employee();
		emp3.setAge(27);
		emp3.setName("고길동");
		emp3.setDept("영업부");
		emp3.setSingle(true);
		
		Employee emp4 = new Employee();
		emp4.setAge(28);
		emp4.setName("김길동");
		emp4.setDept("영업부");
		emp4.setSingle(true);
		
		
		Employee[] emp= {emp1,emp2,emp3,emp4};
        System.out.println("==영업부에 근무하는 사원 목록==");
         double sum = 0;
         int count=0;
		for(int i=0;i<emp.length ; i++) {
			//System.out.println(data.getDept());
			if(emp[i].getDept() 	!= null && emp[i].getDept().equals("영업부")) {
		     sum += emp[i].getAge();
		     count++;
			emp[i].display();
			//System.out.println(data.getAge());
		}

	}
		System.out.printf("영업부 평균급여 = %.2f %n",sum/count );
	System.out.println("== Single인 사원 목록 ==");
	for(int i=0;i<emp.length;i++) {
		
		//System.out.println(emp[i].isSingle());
		if(emp[i].isSingle()) {
		emp[i].display();
		
		
	}
	
	}
	}
}

package day06;

public class Employee {
	//데이터(변수.베리어블)+기능(메소드)
	//데이터 명사 기능 동사
	
	private String name;
	private String dept;
	private int age; //201901
	
	private boolean single;
	//접근지정자가 디폴트.같은 패키지에있어야 접근 가능 퍼블릭을 붙이면 접근 가능*day 06

	//void 리턴 뒤에 데이터가 없는것.값을 가지고 가면 안됨 그냥 돌아가는것.그냥 리턴
	//display 메인?이름
	//메소드는 항상 ()가 따라다님
	//private한 자원은 {}같은 클래스 안에서만 접근 가능 public은 전부 가능 아무것도 없으면 같은 패키지
	
	//캡슐화 셋겟메소드 
	//public void setAge(int ~){ 유효성검증 age=~; return;} 
	//public  int getAge(){ return age;} 리턴 (age)인트타입 반드시 와줘야함
	//함수안에서 선언된 변수 로컬변수
	//boolean 타입은 get이 아닌 is
	

	public void display() {
		System.out.printf("[나이:%-10s,이름:%10s,부서:%10s,싱글 :%b]%n",
				this.getAge(),this.getName(),this.dept,this.single);
		return ;
		
	
	}
	
	public void setAge(int age) {
		if(!(age>0 && age <=100)) {
			System.out.println("age(나이) 정보가 올바르지x");
			return;
		}
          this.age=age;
           return;
	}
	
	public int getAge() {
		return age;
		//this 생략되어있음
	}

		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}


		public String getDept() {
			return dept;
		}

		public boolean isSingle() {
			return single;
		}

		public void setSingle(boolean single) {
			this.single = single;
		}

		
	}
	

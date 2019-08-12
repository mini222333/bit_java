package day08;

/**
 * 
 * @author kjr
 * @since 2019 07월16
 * @version 1.0
 * 
 */
public class Employee {
	static String cName="BIT";
	private String name;//캡슐화
	private String dept;
	private boolean single;
	
	public Employee() {
	//생성자함수 초기화 작업을 주로 한다.
		//기본 생성자 디폴트생성자
		//생성자함수 언급하면 자동생성 안됨 없으면 에러
		this("사원이름","ㅇㅇㅇ부서",true);
		//System.out.println("Employee() call");
		        //name = "사원이름";
				//dept = "ㅇㅇㅇ부서";
				//single= true; 코드중복회피를 위해 뺌 세번째 생성자함수 호출
		
	}
	
    //클래스이름이 함수 이름=생성자함수
	//리턴타입에 대해 언급하지않는다
	public Employee(String name,String dept) {
		//super(); this가 퍼스트스테이트먼트에만 허용 올수없음
		this(name,dept,false);
		//System.out.printf("Employee(%s,%s) call%n",name,dept);
		//this.name = name;
		//this.dept = dept;
		//this의 함수꼴은 퍼스트 스테이트먼트에서만 사용 가능
		//System.out.printf("Employee(%s,%s) call%n",name,dept);this 위에서 사용 불가능
		
	}
	
	public Employee(String name,String dept,Boolean single) {
		//System.out.printf("Employee(%s,%s,%s) call%n",name,dept,single);
		this.name = name;
		this.dept = dept;
		this.single = single;
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
	public boolean isSingle() {
		return single;
	}
	/**
	 * 
	 * @param single 미혼인지
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	
	/**
	 * Employee 정보 출력
	 */
	public void print() {
		System.out.println("회사명:"+cName);
		System.out.printf("[사원명:%s 근무부서:%s single:%b]%n",//%b%s둘다가능 %n줄바꿈
				this.getName(),getDept(),single);//인스턴스베리어블 static 사용 불가능 static안에서는 사용불가능
	System.out.println(cName);
	}

	String kind;
	int number;

}
//생성자함수의 이름은 클래스네임과 동일 리턴타입 언급x

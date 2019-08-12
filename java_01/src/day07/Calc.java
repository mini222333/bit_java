package day07;

public class Calc {
	//class 변수
	static int data=0;
	
	//class method static 자원
	public long add(int a , int b) {
		//add함수
		System.out.println(Calc.data);
		System.out.println(Math.random());
		//public static 붙으면 접근 불가능 this 사용 불가능 
	    //data를 쓰고싶다면 int변수도 static으로 선언해야함 
		//static이 붙으면 주소로 접근.클래스이름으로 불러줘야함
		//static int는 static하지 않은 곳에서도 쓸수있다 아무데서나 쓸수있음 힙영역은 불가능 
		return a+b;
	}
		//void만 리턴 뒤에 아무것도 붙지않음
		public static long sub(int a , int b) {
			return a-b;
		}
			public static long multi(int a , int b) {
				return a*b;
			}
				public static long divide(int a , int b) {
					if(b==0) return 0;
					return a/b;
				}

}

//java day07.ClacTest 내부적으로 메인이라고 하는 함수가 호출됨 main(String[] args)
//메모리에 java lang,Calc data,Calc Test 호출 매커니즘 올라감
//를 제외한 인스턴스 메소드만 힙영역에 올라감 add{}

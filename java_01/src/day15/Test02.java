package day15;

public class Test02 {
	public static void main (String[] args) {
		//A a= new A ();
		//a.p();
		A.B b=new A().new B();
		b.print();
		//A.C c = new A().new C();
		//c.print();
		
		A.C.print(); //스테이틱 호출 
	}

}
class A{
	String name = "A";
	
	
	public A() {}

	public A(String name) {
		this.name = name;
	}

	void p() {
		System.out.println("A에서 호출");
    new B().print();
	}

class B {
	//extends is a 
	//A a; has a
	String name = "B";
	void print() {
		System.out.println(this.name);
	System.out.println(A.this.name);
	//this 이너클래스 아우터.this.name 아우터클래스 
	//이너클래스 아우터클래스 스트링네임 둘다 존재할때 name 찍으면 이너클래스 출력
	//클래스앞에 static 붙일수없음 클래스멤버에 붙일수있음
	//이너클래스에 붙일수있음
	}

}
static class C{
static void print() {
System.out.println("~~~~~~~~~~~~~");

//static에선 this 사용 불가능(인스턴스 x)
}
}
class D{
	void p() {
		class E{
			//로컬이너클래스
		}
	}
}
}//이너클래스
package day13;

public class SingletonTest {

	public static void main(String[] args) {
	//Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	Singleton s3 = Singleton.getInstance();
	}
}


		
		
		class Singleton{
			private static Singleton s = new Singleton();
//new Singleton();//private으로 바꾸면 클래스 안에서만 내부에서만new 사용 가능
	private Singleton(){
		System.out.println("Singleton() 객체 생성");
	}
	
	public static Singleton getInstance() {
		//if(s==null) s = new Singleton();
	return s;//대신 싱글톤 객체 생성

	}
}

package day08;

public class P164_Test {

	//하나의 클래스 안에 퍼블릭 클래스는 하나여야함 퍼블릭 클래스로 클래스네임
	public static void main(String[] args) {
		Count c1 = new Count();
		System.out.println(Count.count);
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		System.out.println(Count.count);
	}

}

class Count{
	int c;
	static int count;//클래스변수선언
	public Count() {
		c++;
		count++;
		
		//c는 힙에 떠있는 자원 각각 1로 뜸
		//static은 1,2,3,4
}
}
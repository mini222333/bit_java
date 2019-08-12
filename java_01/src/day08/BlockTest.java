package day08;

public class BlockTest {
	public static void main(String[] args) {
		Block b1 = new Block();//데이터도 없고 기능도 없지만 띄울수는 있다
		Block b2 = new Block();
		Block b3 = new Block();
		Block b4 = new Block();
		
		Block aa1 = new Block(5);
		b1.print();
		b2.print();
		b3.print();
		b4.print();
		aa1.print();

	}

}
class Block{
	int i;
	int j;
	static String name;
	static{
		//System.out.println("static {}");
	    name = "~~~";
	}//초기화블락 딱1번 수행
	{
	//System.out.println("{}");
		this.j=99;//생성자 여러개 생성가능 반복될때 위로 뽑아낼수있음
		
	}//생성자함수보다 먼저 소환되는 초기화블락이 있다정도만 알아두면됨 자주쓰이지x
	public Block() {
		//this.j=99;
		//System.out.println("생성자");
	
	}
	public Block(int i) {
		//this.j=99;
		this.i = i;
		//System.out.println("생성자");
	}
	public void print() {
		System.out.printf("i=%s , j=%s , name%s %n",i,j,name);
	}
	
}

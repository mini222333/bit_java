package day14.tv;

public class TVTest {
	public static void main(String[] args) {
		
		
       play(new STV());
		
     	play(new LTV());

		//하이코이즌 클래스분리작업
		//로우커플링 자바 폴리모피즘
		//프로토콜
		
     	play(new ITV());

	}
	
	public static void play (TV tv) {//메소드오버라이딩
		tv.poweron();
		tv.poweroff();
		
	}

}

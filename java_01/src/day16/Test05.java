package day16;

public class Test05 {
	public static void main(String[] args) throws InterruptedException{//메인에 보통 쓰로우 블락 걸지않음
		System.out.println(" main start ");
		
		for(int i=0; i<10 ;i++) {//스코프.안에서 선언된 변수는 안에서만 인식 
			System.out.println("hello ~~~ "+i);
			

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	System.out.println(" main end");
	}
	}

}

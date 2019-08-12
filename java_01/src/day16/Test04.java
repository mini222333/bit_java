package day16;

import java.io.IOException;

public class Test04 {
	public static void main(String[] args) {
		System.out.println(" main start ");
		int jumsu = 90;
		
		try {
			if (!(jumsu >=0 && jumsu <=100))
		throw new IOException(" 점수가 유효하지 않습니다 "); //throw 예외발생 트라이캐치해줘야함
		//런타임은 x 
		//에러메세지
	}catch (IOException e) {
		System.out.println(e.getMessage());
	}catch (Exception e) { //제일밑에두는게맞음
		
	}finally {
	
	}
		System.out.println(" main end ");
	}
}

//throw new RuntimeException(" ~~~ 문제발생 ~~~ ");
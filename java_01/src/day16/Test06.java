package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
	System.out.println(" main start ");
	FileInputStream fis = null;//스코프 밖에서 쓰려면 선언해주고 안에서 뺴주면됨
	
	try {
		fis = new FileInputStream("c://lib//sample.txt");
		System.out.println("파일 준비 완료 ~~~");
		//fis.close();
		//fis=null; 여기서 자원반납x 수행된다는 보장 못받음 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println(e.getMessage());
	System.out.println("sample.txt 파일을 확인해주세요");
	}catch (Exception e) {
	e.printStackTrace();
	}finally {//반드시 자원반납
		try {
			if(fis != null) {
				fis.close();//트라이캐치x if써서 널포인트 잡아줌
				fis=null;//널어싸인까지
			}
			
			System.out.println("자원반납 ok");
		
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	System.out.println(" main end ");

	}

}

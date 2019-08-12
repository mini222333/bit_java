package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		System.out.println(" main start ");
		Scanner scanner = null;
		try{
			scanner = new Scanner(new File("c://lib//sample.txt"));
			while(scanner.hasNextLine()) {//읽을 라인이 있으면 계속 수행
				String[] data = scanner.nextLine().replace('_','/').split("/");//스플릿쪼개기.replace 언더바
				System.out.println(Arrays.toString(data));
			}
			System.out.println("파일 준비 완료 ~~~");
		}catch (FileNotFoundException e) {//예외처리
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해주세요");
    }catch (Exception e) {//다른예외발생할수있으니 넣어줌
	e.printStackTrace();
	}finally {//자원반납
			if(scanner != null) 
				scanner.close();//scanner.close는 트라이캐치 필요x 
				scanner=null;
			System.out.println(" 자원반납 수행 ");	
		}		
		System.out.println(" main end ");
	}
}
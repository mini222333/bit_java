package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import day17.PriceException;

public class BookTest {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		try{
			scanner = new Scanner(new File("c://lib//sample.txt"));
			while(scanner.hasNextLine()) {//읽을 라인이 있으면 계속 수행
				String[] data = scanner.nextLine().replace('_','/').split("/");//스플릿쪼개기.replace 언더바
				//System.out.println(Arrays.toString(data));
				Book book=null;//try 다음에 오는 book 밖에서 선언
				//트라이캐치 넣고 안넣고 다름
				try{
					book = new Book(data[0], Integer.parseInt(data[1]));
				}catch (PriceException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(book);
			}
		}catch (FileNotFoundException e) {//예외처리
			System.out.println(e.getMessage());
    }catch (Exception e) {//다른예외발생할수있으니 넣어줌
	System.out.println(e.getMessage());
	}finally {//자원반납
			if(scanner != null) 
				scanner.close();//scanner.close는 트라이캐치 필요x 
				scanner=null;
			System.out.println(" 자원반납 수행 ");	
}
	System.out.println("END");

	}
}

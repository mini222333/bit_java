package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		try(FileInputStream	fis = new FileInputStream("c://lib//sample.txt");) {//오토클로징
			//closeable implements 인터페이스 구현.여기서 처리 가능
			System.out.println(" file 처리 ~~~~ ");
	}catch (Exception e) {//다잡아줘야함 File~~ 말고 Exception으로 잡아줌
		e.printStackTrace();
	} finally {  }
	System.out.println("-----------------------------------------------");
	try(Scanner scanner = new Scanner(new File("c://lib//sample.txt"));){//마찬가지.괄호안에들어갈수있음
		while(scanner.hasNextLine()) {//읽을 라인이 있으면 계속 수행
			String[] data = scanner.nextLine().replace('_','/').split("/");//스플릿쪼개기.replace 언더바
			System.out.println(Arrays.toString(data));
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		System.out.println(" end ");
	}

}

package day17;

import java.util.ArrayList;
import java.util.List;

public class Test04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		//list.add(new Date())); 스트링타입만 들어갈수있음
		
		for(String data:list) {
			System.out.println(data.toUpperCase());//다운캐스팅 필요x 대문자로 컨버팅해서 출력
			
		}
	}
}

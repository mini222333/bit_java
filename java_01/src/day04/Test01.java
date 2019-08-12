package day04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("알파벳 아스키 코드 값 확인");
		
		char a = 'a', b='A'; //코드 중복은 회피. 반복수행
		
		for(int i=0;i<26;i++) {
		System.out.println(a+" : "+(int)a++ +","+b+" : "+(int)b++ );

		
		}
		
		/*
		 * 변수 ch에 저장된 문자가 대문자인 경우에만 
		     소문자로 변경하는 코드를 완성합니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String msg = scanner.nextLine();
		
	
		for(int i=0;i<msg.length() ; i++) {
		char ch = msg.charAt(i);
		char s = (ch>='A' && ch<='Z') ?  (char)(ch+32) : ch; //대문자판별식 타입변환
		//System.out.println(ch +" => "+s);
		System.out.print(s);}
		
		
		//과제 소문자 =>대문자
		//대문자 => 소문자 
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			char ch1 = msg.charAt(i);
			char s = (ch>='A' && ch<='Z') ? (char)(ch+32) : (ch1>='a' && ch1<='z') ? (char)(ch-32) : ch;		
			System.out.println(s);
			}
		}
		
}

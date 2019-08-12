package day08;

public class Card {
	final static int WIDTH=100;//final 상수화처리 보통 대문자
	final static int HEIGTH=250;//인포트만해도 메모리에 떠버림 공유자원
	String kind = "다이아몬드";//인스턴스 자원 new를 사용해 메모리에 띄워야 사용가능 주소사용 
	int number;
	
	public static void main(String[] args) {
		//Card.width=0; final을 붙이면 수정불가능
		System.out.println(WIDTH+"*"+HEIGTH);
		//System.out.println(kind);
		System.out.println(new Card().kind);
		
	
	}
	
}

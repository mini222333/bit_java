package day03;

import java.util.Scanner;

public class Test03 {
	public static void main (String[] args) {
		
		int jumsu ;
		// 키보드로부터 점수 입력 받는다.
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		//jumsu = input.nextInt();
		//input.nextLine();
		
		jumsu = Integer.parseInt(input.nextLine());
		input.close();
		input=null;
		
		if(!(jumsu>=0 && jumsu<=100)) {
			System.out.println("유효하지 않은 점수입니다.");
			return;  //현재 수행중인 함수를 종료하고 호출한 자리로 돌아가는 문장
		} 
		/*
		 * if( jumsu >= 80 ){ System.out.println("Pass"); }else {
		 * System.out.println("No Pass");}
		 */
		// 삼항 연산으로 처리
		String result = jumsu >= 80 ? "Pass" :"No Pass";
	    System.out.println("점수 :"+jumsu+" : "+result);
	    
	    
	    //A,B,C,D,E,F 등급처리 
	    
	    String grade = "F";
	    if(jumsu >=90 ) {
	    	grade = "A";
	    }else if(jumsu>=80) {
	    	grade = "B";
	    }else if(jumsu>=70) {
	    	grade = "C";
	    }else if(jumsu>=60) {
	    	grade = "D";
	    }
	    //System.out.println("점수 :" + jumsu + ": " + result+" : "+grade+" 등급");
	    System.out.printf("점수 :%s :  %s : %s 등급 %n",jumsu,result,grade);
	    
	    //과제 삼항연산자로처리
	    //등급 처리 switch로
	   
	    System.out.println("*********등급 처리 switch**************");
		char c = ' ';
		switch (jumsu/10) {
		case 10:
		case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		case 5:
			c='F';
			break;
			default:
				c='F';
				break;
		}
		System.out.println(jumsu+":"+c);
		
		
		
		return;
		
	}

}


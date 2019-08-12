package day03_ex;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] orgs) {
		Scanner scan = new Scanner(System.in);
		String num = null;
		while (true) {
		System.out.println("*******   명령 선택   *******");
		System.out.println("1. insert(등록) \n");
		System.out.println("2. delete(삭제) \n");
		System.out.println("3. update(수정) \n");
		System.out.println("4. quit(종료) \n");
		System.out.println("************************ \n\n");
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 중 하나를 선택하세요.._");
		
		//num = scan.nextInt()+""; // nextInt()+"" 엔터 소진
		//scan.nextLine();
		
		num = scan.nextLine().trim();
		
		switch(num.trim()) { //문자열의 공백 제거
		case "1":System.out.println("insert 작업을 수행하는 기능 호출");
		break;
		case "2":System.out.println("delete 작업을 수행하는 기능 호출");
		break;
		case "3":System.out.println("update 작업을 수행하는 기능 호출");
		break;
		case "4":
			System.out.println("정말 종료하려면 q/Q 를 입력하세요");
			String quit = scan.nextLine().trim();
	
			if(quit.equals("q") || quit.equals("Q") ) { //기본형만 ==
			System.out.println("App 종료");
		    scan.close();
		    scan=null;
		    //return; // 현재의 함수 종료의미
		    System.exit(0); //App 종료
			}
			break;
		default:
			System.out.print("다시입력하세요 _ ");
			break;
			
		}
		
		System.out.println("=========================="); 
		
		System.out.println("점수를 입력하세요");
		int jumsu = scan.nextInt();
		scan.nextLine();
		scan.close();
		scan = null;
		String grade="";
		if (!(jumsu >= 0 && jumsu <= 100)) {
			System.out.println("유효하지 않은 점수입니다");
			return;
		}
		
		String score = jumsu>=90?"a":(jumsu>=80?"b":(jumsu>=70?"c":(jumsu>=60?"d":"f")));
		System.out.println("점수&등급:" + jumsu+"점"+score+"등급");
		}
	}
}




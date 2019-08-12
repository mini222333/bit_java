package day09;

import java.util.Scanner;

public class BookApp {//애플리케이션
	public static void main(String[] orgs) {
		BookMgr mgr = new BookMgr(10);
		
		Scanner scan = new Scanner(System.in);
		String num = null;
		while (true) {
		System.out.println("*******   명령 선택   *******");
		System.out.println("                  ");
		System.out.println("1. insert(등록) \n");
		System.out.println("2. delete(삭제) \n");
		System.out.println("3. 검색 \n");
		System.out.println("4. quit(종료) \n");
		System.out.println("************************ \n\n");
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 중 하나를 선택하세요.._");
		
		//num = scan.nextInt()+""; // nextInt()+"" 엔터 소진
		//scan.nextLine();
		
		num = scan.nextLine().trim();
		
		switch(num.trim()) { //문자열의 공백 제거
		case "1":System.out.println("insert 작업을 수행하는 기능 호출");
		System.out.println("Boot title 입력하세요");
		String title = scan.nextLine();
		System.out.println("Boot 가격 입력하세요");
		int price = scan.nextInt();//ex)900엔터
		scan.nextLine();//엔터없애줌
		mgr.addBook(new Book(title,price));
		break;
		case "2":System.out.println("delete 작업을 수행하는 기능 호출");
		break;
		case "3":System.out.println("목록출력 작업을 수행하는 기능 호출");
		mgr.bookListPrint();
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
		
		}
	}
}




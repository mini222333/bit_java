package day08_ex;

public class BookTest {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(5); //크기 조절.숫자 입력 안하면 10개짜리 배열BookMgr디폴트생성자수행.
		//숫자 입력하면 int size 수행.객채생성
		
	    mgr.addBook(new Book("java",7000));
	    mgr.addBook(new Book("db",8000));
	    mgr.addBook(new Book("SQL",9000));
	    mgr.addBook(new Book("Html5",100000));
	    mgr.addBook(new Book("JSP",10000));
	    mgr.addBook(new Book("Spring",18000)); //배열 크기 넘으면 에러뜸

		//System.out.println(Arrays.toString(mgr.getBookList())); 
	    mgr.bookListPrint();
	    System.out.println("총합계 :"+mgr.bookTotalPrice());    
	    

	
	}

	}


package day09_ex;

import day09_ex.Book;

public class BookMgr {//데이터 모아서 관리
	private Book[] bookList;
     int count = 0;
	public BookMgr() {
	    this(10);//코드 중복 해결
		//bookList = new Book[10];
	}
	public BookMgr(int size) {
		bookList = new Book[size];
	}
	//public Book[] getBookList() {
		//return bookList;
	//}

	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}
    
	public void addBook(Book book) {
		if(count == bookList.length) {
			Book[] copy = new Book[bookList.length*2];//배열크기넘어갈때
			System.arraycopy(bookList, 0, copy, 0, bookList.length);
			//안넣으면 5까지의 데이터 날라감
		    bookList = copy;
		}
	 bookList[count] = book;
	 count++;
	 
	 //집어넣을떄
 }
	public void deleteBook(String title) {
		for(int i=0 ; i<count;i++) {
			if(bookList[i].getTitle().contentEquals(title)) {
				System.arraycopy(bookList, i+1, bookList, i, count-i-1);
				count--;
				System.out.println("title+ 삭제되었습니다.");
				return;
			}
		}
		System.out.println("도서가 없습니다.");
	}
	public void searchTitleBook(String title) {
		System.out.println(title+ "검색");
	 	for(Book data:bookList) {
	 		if(data == null) return;
			if(data !=null &&data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				data.print();
			
			}
			
		}
		System.out.println("--------------------------");
	}
	public void bookListPrint( ) {
		
		System.out.println("================Book List===============");
		for(int i=0; i<count ;i++) {
			bookList[i].print();
			
		}
		System.out.println("총"+count+"권");
		System.out.println("==================");
	
	}
}

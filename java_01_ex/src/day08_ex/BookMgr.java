package day08_ex;

public class BookMgr {
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
	public void bookListPrint( ) {
		for(int i=0; i<count ;i++) {
			bookList[i].print();
			
		}
	}
	
	public int bookTotalPrice() {
		int sum = 0;
		for(int i=0; i<count ; i++) {
			//배열은 무조건 for루프
			sum += bookList[i].getPrice();
		}
		return sum;
		
	}
}

package day19_ex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMgr {//데이터 모아서 관리
	//private Book[] bookList; List<Book>이 해줌
     //int count = 0;
     
     List<Book> list = null;//제너릭에 북 넘김
	public BookMgr() {
		list = new ArrayList<Book>();
		//list = new Vector<Book>();
		//list = new LinkedList<Book>();//어레이리스트 노드기반.링크드도 사용 가능 내부적으로 구조 변경 
		//자료구조.삭제작업은 링크드가 적합 서치는 어레이리스트.맵구조는 호환x
	}
	public BookMgr(List<Book> list) {
		this.list = list;
	}
	
	//public Book[] getBookList() {
		//return bookList;
	//}
    
	public void addBook(Book book) {
		list.add(book);
		}
	 
	public void deleteBook(String title) {
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().equals(title)) {
				System.out.println(data+" 삭제됩니다. ");
				it.remove();
			}
		}
		System.out.println("도서가 없습니다.");
	}
	public void searchTitleBook(String title) {
		System.out.println(title+ "검색");
		Iterator<Book> it = list.iterator();
		while(it.hasNext()) {
			Book data = it.next();
			if(data !=null &&data.getTitle().toUpperCase().contains(title.toUpperCase())) {
			System.out.println(data);
		}	
		}
		System.out.println("--------------------------");
	}
	public void bookListPrint( ) {
		System.out.println("================Book List===============");
		list.forEach(i->System.out.println(i));
		System.out.println("==================");
	
	}
}

package day19_ex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookMgr2 {//데이터 모아서 관리
	//private Book[] bookList; List<Book>이 해줌
     //int count = 0;
     
     Map<Integer,Book> map = null;//제너릭에 북 넘김
	public BookMgr2() {
		map = new HashMap<Integer,Book>();
		//list = new Vector<Book>();
		//list = new LinkedList<Book>();//어레이리스트 노드기반.링크드도 사용 가능 내부적으로 구조 변경 
		//자료구조.삭제작업은 링크드가 적합 서치는 어레이리스트.맵구조는 호환x
	}

    
	public void addBook(Book book) {
		map.put(book.getIsbn(),book);
		}
	 
	public void deleteBook(String title) {
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer isbn = (Integer) it.next();
			Book data = map.get(isbn);
			if(data.getTitle().equals(title));
			System.out.println(data+" 삭제됩니다. ");
				//map.remove(isbn);
				it.remove();//레퍼런스로관리
		}
	}

	public void searchTitleBook(String title) {
		System.out.println(title+ "검색");
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);//data !=null && 생략가능
		    if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {//data !=null && 생략가능
		    System.out.println(data);
		    }	
		}
		System.out.println("--------------------------");
	}
	public void bookListPrint( ) {
		System.out.println("================Book List foreach 기반===============");
		//list.map.forEach(i->System.out.println(i));
		//map.forEach((k, v) -> System.out.println(k+" : "+v));
		map.forEach((k,v) -> System.out.println(v));
				//new BiConsumer<Integer, Book>() {//BiConsumer   파라미터 두개
		System.out.println("==================");
	
	}
}

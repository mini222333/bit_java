package day09;

public class Book {//데이터
	private String title;
	private int price;
	
	public Book() {//기본생성자
		//super();없어도 자동 호출됨 생략
	}
	
	public Book(String title,int price ){
		
		//super();없어도 자동 호출됨 생략
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    public void print( ) {
    	System.out.printf("Book[%-20s : %7d] %n",title,price);
    }
}

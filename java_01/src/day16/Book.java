package day16;

import day17.PriceException;

public class Book {
	private String title;//인캡슐레이션
	private int price;
	
	//셋겟 생성자 기본생성자 super 생략 투스트링 이퀄즈
	public Book() {
	
	}
	public Book(String title, int price) throws PriceException {//북테스트에서 트라이캐치 불편하지만 메세지핸들링 가능
		//이 안에서 트라이캐치 처리하면 북테스트에서 메세지핸들링 불가능
		this.title = title;
			setPrice(price);
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
	public void setPrice(int price) throws PriceException {//예외가 발생할수있는 메소드 런타임이면에러안남
		if(price < 0) throw new PriceException();//음수들어오면안됨
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
	

}

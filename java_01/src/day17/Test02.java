package day17;

public class Test02 {
	
	public static void main(String[] args) {
		Book b1 = new Book("java", 900);//생략하면 <Object,Object> 오브젝트 보는 순간 다운캐스팅 형변환 준비
		System.out.println(b1);
		if(b1.getTitle() instanceof String)
		System.out.println(((String) b1.getTitle()).charAt(0));//캐스팅하기전에 if 꼭 하기
		
		Book<String, Integer> b2 = new Book<String, Integer>("SQL", 400);
		System.out.println(b2);
		System.out.println(b2.getTitle().charAt(0));
	//Object[] obj = {1,2,3}; 336p
	//Book<?, Integer> b3 = new Book<String, Integer>("Spring", 4400);//338p <?>와일드카드타입
	Book<?, Integer> b3 = new Book<String, Integer>("Spirng", 400);
	System.out.println(b3.getTitle());// ?=>object
	
	Book<String, ? extends Number> b4 = new Book<String, Integer>("SQL", 400);
    System.out.println(b4.getPrice());//?=>Number type 넘버의 자식
    
    Book<String, ? super Number> b5 = new Book<String, Object>("SQL", 400);
    System.out.println(b5.getPrice());
    //?=>object 넘버의 부모 object Integer허용 x.바인딩 
	}

}

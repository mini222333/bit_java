package day10;

public class Dog extends Animal {//상속
	private String kind = "강아지 종류";
	private String name = "강아지 이름";
	
	
	
	public Dog() {
		super("강아지과"); //super() 애니멀의 파라미터 하나짜리 호출하는 문장 기본생성자있어야함
	}
	
	
	public Dog(String kind, String name) {
		super("강아지과");
		this.kind = kind;
		this.name = name;
	}

	public Dog(String superKind,String kind, String name) {
		super(superKind);
		//super.kind =superKind;
		this.kind = kind;
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void dogPrint( ) {
		System.out.printf("[%s:%s:%s]%n",super.getKind(),this.kind,this.name);
	}
	
	public String getSuperKind() {
		return super.kind;//넣으면 super.this 쓸수있음
	}
@Override
public void print() {
	//super.print();//부모가 가지고 있는 메소드 호출
	//System.out.printf("%s:%s %n",kind,name);
    this.dogPrint();
}
}

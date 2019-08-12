package day12;

public abstract class Animal {//인터페이스는 인스턴스자원사용불가능 추상메소드가능
	 protected String kind = "동물의 종류";

	
	public Animal() {}
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
public abstract void breath(); //추상메소드
	

 public void print() {
	 System.out.printf("Animal kind : %s ",kind);
 }
}
	

package day06_ex;

public class Animal {
	private boolean live;
	int age;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	
	public void print() {
		System.out.println(name+": "+age+": "+live );
	}
	public static void main(String[] args) {
		Animal am1 = new Animal();
		 am1.name = "~~~"; //인스턴스베리어블
		am1.print();
		// 인스턴스 메소드 둘다 new를 통해 띄워야 호출 가능
	}
	
}

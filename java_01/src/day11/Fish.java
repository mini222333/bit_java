package day11;

import day10.Animal;

public class Fish extends Animal{
	private String name;

	public Fish() {} //super 자동으로 호출
	public Fish(String name) {
		super("물고기");
		this.name = name;
	}
	public String getName() {
		 return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fishPrint() {
		System.out.printf("[%s : %s ] %n",kind,name);
		//super 안됨 부모영역에 x this 가능
	}
	//메소드 오버라이딩=>부모로부터 물려받은 기능을 나의 상황에 알맞게 다시 재정의
	//선언부 일치
	@Override //오버라이딩 에노테이션 체크해줌
	public void breath() {
		System.out.println(kind+" : 아가미로 숨쉬기 ~~~");
		
	}
@Override
public void print() {
	//super.print();//부모가 가지고 있는 메소드 호출
	//System.out.printf(" :%s %n",name);
	this.fishPrint();
}
	
}

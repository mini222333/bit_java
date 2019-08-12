package day14.tv;

interface TV {
public void poweron();
public void poweroff();//인터페이스 약속
	
}

class STV implements TV {//약속 이행
	
	public void poweron() {
		System.out.println("STV poweron");
	}
	
	public void poweroff() {
		System.out.println("STV poweroff");
	}
}

class LTV implements TV{
	public void poweron() {
		System.out.println("LTV on");
	}
	public void poweroff() {
		System.out.println("LTV off");
	}

}
		
		class ITV implements TV{
			public void poweron() {
				System.out.println("ITV on");
			}
			public void poweroff() {
				System.out.println("ITV off");
			}
	}


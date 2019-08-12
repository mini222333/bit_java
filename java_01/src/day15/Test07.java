package day15;

public class Test07 {
	
	public static void main (String[] args) {
		AAA a = new AAA() {
			
			@Override
			void exec() {
				// TODO Auto-generated method stub
				
			}
		};
		III i = new III() {
			@Override
			public void exec() {
				
			}
	};
	CCC c = new CCC() {//강제성x
		void exec() {
			
		}
	};
	}

}

//xxx x= new xxx() 안됨 (){}가능

abstract class AAA{
	abstract void exec();
	
}

interface III{
	void exec();
	
}

class CCC{//일반클래스 추상메소드 못옴
	void exec() {}
}


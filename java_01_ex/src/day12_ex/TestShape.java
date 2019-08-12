package day12_ex;



public class TestShape {

			public static void main(String[] args) {
				Shape [] shape = new Shape[2];//객체생성() 이건 객체생성 아님 abstract은 객체생성 불가능
				//extends뒤엔 하나의 클래스만 와야함
				
				shape[ 0 ]  = new Circle("원",10);
				shape[ 1 ] = new Rectangular("직사각형",10,20);
				
				for (int i = 0; i < shape.length; i++) {
					shape[ i ].calculationArea();
					shape[ i ].print();
				}
			}
		}
	


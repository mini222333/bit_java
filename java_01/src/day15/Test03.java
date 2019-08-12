package day15;

import day14.Point;

public class Test03 {

	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		//has a Inner i = new Inner();
		i.print();

	}

}

class Outer{
	Point p = new Point(3, 3);
	
class Inner {
	//has a Outer o = new Outer();
	//sysout.println(o.p)
	//is a extends Outer
	void print() {
		System.out.println(p);
	}
}
}

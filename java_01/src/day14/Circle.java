package day14;

abstract class Shape implements MoveAndDraw{
	abstract double area();//퍼블릭 숨어있음 //추상 인스턴스 다 가능
	//인터페이스 다중상속 가능
	
}

interface Drawable {//자바에서는 이름 뒤에 able이 붙어있으면 죄다 인터페이스
	public abstract void draw();//public abstract 생략 인터페이스는 abstract만 들어갈수있어서 생략가능
	
}	
	

interface Moveable{
	
	void move(int m);//abstract붙으면 똑같이 마크해줘야함 인터페이스는 붙여도되고빼도됨
	
}

interface MoveAndDraw extends Drawable,Moveable{}
public class Circle extends Shape implements Cloneable {//interface가 되는 순간 implements로 바뀜
	//하나는 상속 하나는 has a
	//구현의의미 implements
	public Point p;
	public int r;
	
	public Circle() {}


	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}


	//@Override
	public double area() {//퍼블릭 붙여줘야함
		return r*r*Math.PI;
	}
	
	
	@Override
	public void draw() {
		System.out.println(getClass().getName()+" 그리기");
		
	}


	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + r;
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
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (r != other.r)
			return false;
		return true;
	
}
	@Override
	public void move(int m) {
		//p.x = p.x+m; x프라이빗 접근 불가능이라 코드 사용x
		p.setX(p.getX()+m);
		p.setY(p.getY()+m);
	}
	
	@Override
	public Circle clone() throws CloneNotSupportedException {
return(Circle)  super.clone();
	}
}
package day12_ex;

public class Circle extends Shape{
	
	private double radius ;

	public Circle(String n1 , double radius) {
		super(n1);
		this.radius = radius;
		
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius ;
	}
	@Override
	public void calculationArea() {
        		area=radius*radius*Math.PI;
	}
	

}

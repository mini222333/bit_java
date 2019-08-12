package day12_ex;

public abstract class Shape {

	protected double area;
	private String name; 

	public Shape( String name) {
		super();
		this.name = name;
	}

	public Shape() {

	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void calculationArea();

	void print() { System.out.println(name+"의 면적은 " + area);
	}
}

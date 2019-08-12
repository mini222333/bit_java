package day13;

public class Test02 {
	public static void main (String[] args) {
		Point p = new Point(3, 3);
		System.out.println(p);//tostring만들어서가능 p.toStirng()
		
		Circle2 c1 = new Circle2();
		c1.setP(p);//세팅.이미세팅되어있을떄 null이 p로 바뀜
		System.out.println(c1); //c1.toSTring()
		
		Circle2 c2 = new Circle2(new Point(7, 7),5);
		System.out.println(c2);

		
		
	}

}

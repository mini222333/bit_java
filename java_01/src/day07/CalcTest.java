package day07;

public class CalcTest {
	public static void main(String[] args) {
		
        Calc c1 = new Calc();
		System.out.println(c1.add(11,99));
		//new 필요
		System.out.println(Calc.sub(11,99));
		System.out.println(Calc.multi(11,99));
		System.out.println(Calc.divide(11,99));
        //static 메소드 주소 이름으로 접근 Calc c1 = new Calc(); 필요 x
	}
}

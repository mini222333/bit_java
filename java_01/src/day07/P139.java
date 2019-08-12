package day07;

public class P139 {
  
	public static int increase(int n) {
		//인스턴스 자원을 쓰지 않기때문에 static 사용가능
		//new를 쓰지않아도 메모리에 올라감
		++n;
		return n;
	}
	public static void main(String[] args) {
		int var1 = 100;
		int var2 = P139.increase(var1);
		System.out.println(var1+" "+var2);


	}

}

package day03;

public class Test05 {

	public static void main(String[] args) {
		
		// 1 ~ 100 합
		//1+2 3 4 5 6~100
		
		int sum = 0;
		int sum4 = 0; // 4 8 12 16 20 ~~~ 100
		for(int i = 1;i<=100;i++) {
			//sum = sum+i;
			sum += i; //sum = sum+i;
			if(i%4 == 0) sum4 += i;
			
		}
		System.out.println("1~100 합계: "+sum);
		System.out.println("1~100 4의 배수 합계: "+sum4);
	}

}

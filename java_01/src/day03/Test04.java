package day03;

public class Test04 {
	public static void main(String[] args) {

		// for( 초기값 ;조건식 ;증감식 )

		for (int i = 1; i < 10; i++) {
			System.out.println("Hello java " + i);

		}
		
	    //System.out.println(i);

		// int i;
		int j = 10;
		while (j > 0) {
			System.out.println("while " + j);
			j--;

		}

		boolean flag = true;
		while (flag) {
			j++;
			System.out.println("~~~~~~~ " + j);
			if (j == 5) 
				flag = !flag;
		}
		System.out.println("j : " + j);

		while (j < 5) {
			System.out.println("do while"); // 동작x
		}
		System.out.println("---------------------------");
		do {
			System.out.println("do while"); // 한번은 무조건 동작o

		} while (j < 5);

	}

}

package mini;

public class For4 {
	public static void main(String[] args) {
		String[] aa = {"임상민","길용성","김민우","박민희"};
		int[] ab = {10, 20, 30, 40};
		//위의 배열들을 이용하여 아래 출력문을 for문 .length,charAt()를 활용하여 아래와 같이 출력하기
		//임@@님의 점수는? 10
		for(int j=0;j<ab.length;j++) {
//                System.out.println(aa[j]);
//				System.out.println(ab[j]);
//				System.out.println(aa[j].charAt(0));
			System.out.printf(aa[j].charAt(0)+"**+님의 점수는?+%d %n", ab[j]);
			}
			
	
	}

}

package day05;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		
		int num1 = 99;
		int num2 = num1;
		System.out.println("num1="+num1+",num2="+num2);
		num1 = 77;
		System.out.println("num1="+num1+",num2="+num2);
		
		//배열은 메모리에 한번 언로케이트되면 리사이징이 안된다 하지만 속도는 빨라짐
			
			//call by value call by reference
		
		int[] n1 = {11,22,33,44,55};
		int[] n2 = n1;
		
		int[] n3 = new int[n1.length];
		for(int i=0;i<n1.length;i++) { //배열카피
			n3[i] = n1[i] ;
		}
//		System.out.println(Arrays.toString(n1));
//		System.out.println(Arrays.toString(n2));
//		System.out.println(Arrays.toString(n3));
		n1[2] = 0;//n2는 n1의 주소를 받은것 n3는 n1의 값들을 하나하나 가져온것.둘은 다름 
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
	
	}

}

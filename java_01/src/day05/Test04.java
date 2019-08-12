package day05;

import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) {
		//난수발생.(실수)double형이 나옴 int로 캐스팅하면 무조건 0
		//System.out.println((int)(Math.random()*10));
		//String[] args = {}
		//String[] args = {"5"}
		if(args.length == 0) {
			System.out.println("배열의 사이즈 정보를 실행 매개변수로 넘겨주세요..");
			System.out.println("실행_예) java day05.Test04 5");
			return;
		}
		
		int[] nums = new int[Integer.parseInt(args[0])];
		for(int i=0; i< nums.length ;i++) {
            nums[i] = (int)(Math.random()*45)+1; //1~45 사이의 정수 Math.random()이용
		
		}

		System.out.println(Arrays.toString(nums));
		// 정렬 내림차순 SORT

		System.out.println("--------------------------");
		int count = 0;
		for(int i=0; i<nums.length-1 ; i++) {
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]<nums[j]) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j]=temp;
		        count++;
			}
		}
			//System.out.println(Arrays.toString(nums));
		}

		//과제 스와핑 작업을 최소한 수행하게 코드 수정합니다.
		System.out.println("count = >"+count);
	System.out.println("---------------정렬--------------");
	 System.out.println(Arrays.toString(nums));
	 }
  
}

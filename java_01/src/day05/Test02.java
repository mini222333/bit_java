package day05;

import java.util.Arrays;

public class Test02 {
	public static void main (String[] args) {
		
		int[] scores = {77,99,100,85,91};
		int[] sc = new int[2*scores.length];

		
		System.arraycopy(scores, 0, sc, 0, scores.length);//매개 변수 . *중요* 주소는 다 오브젝트
        //1 복사할배열 3 복사받을배열 5복사받을길이
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));
		
		String[] names = {"홍길동","박길동","고길동","최길동"};
		String[] nc = new String[names.length*2];
				
				System.arraycopy(names, 0, nc, nc.length-names.length, names.length);
	    System.out.println(Arrays.toString(names));
	    System.out.println(Arrays.toString(nc));
	}
}

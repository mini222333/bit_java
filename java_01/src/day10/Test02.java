package day10;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		char[] c = "ABCDEF".toCharArray();
		int count = 6;
		int d = 5;
		System.out.println(Arrays.toString(c));
        System.arraycopy(c, d+1, c, d, count-d-1);
        //count--; ㄷㅔ이터가있는것처럼보일수있어서 밑에작업
        c[--count]=' ' ;
		System.out.println(Arrays.toString(c));
	}

}

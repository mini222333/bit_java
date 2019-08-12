package util;

public class MyUtil {
	//method 오버로딩
	//리턴타입은 오버로딩의 조건에 해당되지않는다 매개변수의 타입이 달라야 구분한다
	public static long  add(int a,int b) {
		return a+b;
		
		//public을 넣어야만 다른 패키지에 있어도 사용 가능
	}
	public static double  add(double a,double b) {
		return a+b;
		//메소드오버로딩 이름은 동일하지만 파라미터의 타입이 다르다.
	}

	//가변인자
	//가변인자는 반드시 맨 마지막에 와야한다
	public static double add(double...nums) {
	//...:데이터 몇개 들어올지 모름 내부적으로 []배열 처리
    double sum=0;
    for(double data :nums) {
    	sum += data;
    
    }
    return sum;
	}
	
//	public static double add(double[] a) {
//	    double sum=0;
//	    for(double data :a) {
//	    	sum += data;
	    
//	    }
//	    return sum;
//		}
		//더블형이 또 오면 안됨
			

	
	//static 처리 가능
public static String leftPad(String str, int size, char padChar) {
	if(str.length() > size) {
		return str;
		
	}
	int count = size-str.length();
	for (int i=0; i<count ;i++) {
		str = padChar+str;
	}
	return str;
}



public static String rightPad(String str, int size, char padChar) {
	if(str.length() > size) {
		return str;
}
		int count = size-str.length();
	for (int i=0; i<count ;i++) {
		str = str+padChar;
	}
	return str;
}


public static int[] sort(int[] nums) {
	//배열 원본은 변경이 되지 않도록 하고 
	//오름차순으로 정렬된 int[]을 리턴한다.
	int[] copy = new int[nums.length];
	System.arraycopy(nums, 0, copy, 0, nums.length);
	//정렬
	int[] num = copy;
	for(int i=0;i<copy.length-1;i++) {
		int min = i;
		for(int j=i+1;j<copy.length;j++) {
			if(copy[i] > copy[j]) {
				int temp = copy[i];
				copy[i] = copy[j];
				copy[j] = temp;
		}
			}
	}
		
return copy;

}


//숫자를 넘겨받아 그중 가장 큰 수를 리턴하는 함수 max

public static int max (int ... a) {
	int max=Integer.MIN_VALUE;//초기화해야 리턴사용가능
	for(int data:a) {
		if(max < data) max = data;
	}
	return max;
}
}







package day05;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		String msg = "hello JAVA ~~~ ";
		String msg2 = "hi ~~~  SQL ";
		
		//char[] c = {'h', 'e', 'l'};
	
		char[] c = new char[msg.length()];
		for(int i = 0;i<msg.length();i++) {
			c[i] = msg.charAt(i);
		}
		
		char[] cc = msg.toCharArray();//스트링 msg 캐릭터형배열화
        cc[0]='Q';

			
        
        
        String ne = new String(cc);//형변환 스트링대신 char의 배열 가능 간단하게 왔다갔다할수있음
		System.out.println(msg);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(cc));
		System.out.println(ne);
		
	
		//함수호출할땐 반드시 주소가 있어야함
	}

}

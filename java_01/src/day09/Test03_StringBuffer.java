package day09;

import java.util.Date;

public class Test03_StringBuffer {
	public static void main(String[] args) {
		String msg = "";
		msg = msg+"hello"+ new java.util.Date()+"java"+" test"+'A'+89;//x
	System.out.println(msg);
	
	String msg2 = "";
	
	//StringBuffer sb = new StringBuffer();//o
	//객체생성x 버퍼에 데이터를 집어넣음 버퍼보다 빌더를 씀
	StringBuilder sb = new StringBuilder();
	sb.append("hello  ");//어떤타입이든지가능
	sb.append(new Date());
	sb.append(" java");
	sb.append(" test");
	sb.append('A');
	sb.append(89);
	//msg2 = sb.toString();
	msg2 = new String(sb);
	System.out.println(msg2);
	
	}

}

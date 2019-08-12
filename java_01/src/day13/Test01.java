package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {

	public static void main(String[] args) throws Exception{//파일에 가서 기록할때
		
		Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("2019년"+Calendar.DAY_OF_YEAR+" 일째");
        String date = String.format("현재시간은 %tk 시 : %tM 분 : %tS초 %n",c,c,c);
        System.out.println(date);
        
        System.out.printf("%f",Math.PI);
        String f = String.format("%f", Math.PI);
        System.out.println("----------------------------");
        StringBuffer sb = new StringBuffer();
       // Formatter fm = new Formatter(sb);
        // Formatter fm = new Formatter();
        Formatter fm = new Formatter("sss.txt");//버퍼 모아서 기록 경로지정도가능
        
        
        fm.format("현재시간은 %tk 시 : %tM 분: %tS초 %n",c,c,c);
        fm.format("%f %n", Math.PI);
        System.out.println(sb);
        fm.flush();//버퍼에 가서 기록.밀어내기 
        //formatter로그파일만들때 사용
        
        System.out.println("main end");
	}

}

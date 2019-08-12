package day22;

import java.io.FileReader;
import java.util.Properties;

public class Test08 {
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		FileReader fr = null;

	try {
		fr = new FileReader("c://lib//dbinfo.txt");
		prop.load(fr);
		String id = prop.getProperty("user");
		String pw = prop.getProperty("pw");
		
		System.out.println("로그인 시도" + id + " / " + pw);
		
		}catch(Exception e) {
		e.printStackTrace();
	}finally {

		}
	}
}

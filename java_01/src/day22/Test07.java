package day22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test07 {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
	try {
		fr = new FileReader("c://lib//dbinfo.txt");
		
		String id = null;
		String pw = null;
		String read = null;
		while ((read = br.readLine()) != null) {
			String[] data = read.split("=");
			if(data[0].equals("user")); id =data[1];
			if(data[0].equals("pw")); pw =data[1];
			
		}
		
		System.out.println("로그인 시도" + id + " / " + pw);
		
		}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(br != null) {
				br.close();
				br=null;
			}
			if(fr!=null) {
				fr.close();
				fr=null;}
			
		}catch (Exception e2){
			
		}
	}
	}
}
package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Test02 {
	public static void main(String[] args) {

		String address = "https://www.naver.com/index.html";
		String line = null;
		
		URL url = null;
		BufferedReader br = null;
		BufferedWriter bw = null;//변수선언.트라이블락밖에서
		try {
			
			url = new URL(address);
			br = new BufferedReader (new InputStreamReader(url.openStream()));//인풋스트림.바이트>캐릭터
			bw = new BufferedWriter (new FileWriter("naver.html"));//객체생성
			
			while ((line = br.readLine()) !=null) {
				bw.write(line+"\r\n");
			}
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
				if(bw != null)bw.close();//자원반납
			} catch (IOException e) {
		
				e.printStackTrace();
			}
			
			
		}
	}

}

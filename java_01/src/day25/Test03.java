package day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Test03 {
	public static void main(String[] args) {

		String address = "https://www.naver.com/index.html";
		String line = null;
		
		URL url = null;
		BufferedReader br = null;
		try {
			
			url = new URL(address);
			br = new BufferedReader (new InputStreamReader(url.openStream()));//인풋스트림.바이트>캐릭터
			
			while ((line = br.readLine()) !=null) {
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
			} catch (IOException e) {
		
				e.printStackTrace();
			}
			
			
		}
	}

}

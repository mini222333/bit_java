package day22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) {
		String src ="c://lib//Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		System.out.println("파일 복사 시작합니다.");
		
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy5.mp3",false);//false 오버라이트
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int read = 0;
			int count = 0;
	
			while ((read = bis.read()) != -1) {
				bos.write(read);
			}
			
			bos.flush();//버퍼는 가득 차야 비워짐 버퍼 강제로 비워주는작업
			System.out.println("I/O 횟수 : "+ count);
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			System.out.println(src+ " 파일(복사원본) 확인해주세요");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		System.out.println("main end");
	}

}

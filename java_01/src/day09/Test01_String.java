package day09;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test01_String {
	public static void main(String[] args) {
		//String msg1 = args[0];
		//String msg2 = new String(new char[] {'g','h'});
		String msg1 = JOptionPane.showInputDialog("book 정보를 입력하세요 ex title/price");
		//Java programming/23000
		//내부적으로 배열 msg.length-1 마지막인덱스
		//String msg1 = "Java programming/23000";
		//System.out.println(msg1);
		//System.out.println(msg1.toUpperCase());
		//system.out.println(msg1);//string에 올라가면 어떤 작업을해도 변하지않음 원본유지 (재어싸인하지않는다면)
        System.out.println(msg1);
		
        if(msg1.indexOf ("/") == -1){
        System.out.println("다시 입력하세요");
        System.out.println("/가 필요합니다.");
        return;
        }
        String[] data = msg1.split("/");//문자열 쪼개기
		System.out.println(Arrays.toString(data));
		Book b1 = new Book(data[0].trim(), Integer.parseInt(data[1].trim()));
		b1.print();
		
	}

}

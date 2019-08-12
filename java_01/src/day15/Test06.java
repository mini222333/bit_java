package day15;//추상메소드 하나 람다표현식 가능
import javax.swing.JOptionPane;

public class Test06 {//익명이너클래스 implements Command 생략 
	//재활용불가능 객체지향특징 위반


	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog("1.list 2.update 3.delete 4.insert q.quit");//args JoptionPane등등 가능
		//람다=>변수에 함수를 등록하여 사용하는 기능
		
		Command list =() -> System.out.println(" *** list *** ");

        //바로 클래스 생성

        Command update = () -> System.out.println(" *** update *** ");

	
        Command delete = () -> System.out.println(" *** delete *** ");

        Command insert = () -> System.out.println(" *** insert *** ");

        
        switch (msg) {
        case "1":
        	list.exec();
        	break;
        case "2":
        	update.exec();
        	break;
        case "3":
        	delete.exec();
        	break;
        case "4":
        	insert.exec();
        	break;
        default:
        	break;
        	
        	
        }
        
	}

}

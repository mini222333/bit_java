package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Test03 {
	public static void main(String[] args) {
		new UI_3();
	}

}


class UI_3 extends Frame implements ActionListener {
	Frame f1;
	Button red,blue,exit;
	Panel p1;
	 
	UI_3(){
		f1 = new Frame("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new Button("RED"));
		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("종료"));
		f1.add(p1,BorderLayout.SOUTH);
		
		f1.setSize(300, 300);
		f1.setVisible(true);//기본적인 UI구조
		
		
		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);

		
		
		//f1.addWindowListener(new WindowEventP());
		
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				f1.setVisible(false);//눈에안보임
				f1.dispose();//UI 다파괴
				System.exit(0);//재활용안됨
			}
		});
		
		//Listener 모두 인터페이스
	
		
	}
	
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "RED":
			p1.setBackground(Color.RED);
			break;
		case "BLUE":
			p1.setBackground(Color.BLUE);
			break;
		case "종료":
			System.exit(0);
			default:
			break;
//			if(e.getActionCommand().contentEquals("RED")) {	
//			p1.setBackground(Color.RED);
//			}
//			else if(e.getActionCommand().contentEquals("BLUE")) {	
//				p1.setBackground(Color.BLUE);
//			}
//			else{	
//				setVisible(false);//눈에안보임
//				dispose();//UI 다파괴
//				System.exit(0);//재활용안됨
		}

		}
	}
	
	

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


public class Test02 {
	public static void main(String[] args) {
		new UI_2();
	}

}


class UI_2 extends Frame{//extends Frame{
	//Frame f1;
	Button red,blue,exit;
	Panel p1;
	 
	UI_2(){
		//f1 = new Frame("awt UI Test ~~");
		super("awt UI Test ~~");//생성자 첫줄 super
		p1 = new Panel();
		p1.add(red = new Button("RED"));
		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("EXIT"));
		add(p1,BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);//기본적인 UI구조
		
		
		red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
					p1.setBackground(Color.RED);
				}
				});
		blue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
					p1.setBackground(Color.BLUE);
				}
				});
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setVisible(false);//눈에안보임
				dispose();//UI 다파괴
				System.exit(0);//재활용안됨
				}
				});
		
		
		//f1.addWindowListener(new WindowEventP());
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);//눈에안보임
				dispose();//UI 다파괴
				System.exit(0);//재활용안됨
			}
		});
		
		//Listener 모두 인터페이스
	
		
	}
}


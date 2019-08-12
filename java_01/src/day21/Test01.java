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


public class Test01 {
	public static void main(String[] args) {
		new UI_1();
	}

}


class UI_1 {//extends Frame{
	Frame f1;
	Button red,blue,exit;
	Panel p1;
	 
	UI_1(){
		f1 = new Frame("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new Button("RED"));
		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("EXIT"));
		f1.add(p1,BorderLayout.SOUTH);
		
		f1.setSize(300, 300);
		f1.setVisible(true);//기본적인 UI구조
		
		
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
				f1.setVisible(false);//눈에안보임
				f1.dispose();//UI 다파괴
				System.exit(0);//재활용안됨
				}
				});
		
		
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
}
	class WindowEventP extends WindowAdapter{


		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			//f1.setVisible(false);//눈에안보임
			//f1.dispose();//UI 다파괴
			System.exit(0);
			//재활용됨
		}



	
}

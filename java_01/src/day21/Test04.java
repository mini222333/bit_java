package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Test04 {
	public static void main(String[] args) {
		new UI_4();
	}

}


class UI_4 extends JFrame implements ActionListener {

	JButton red,blue,exit;
	Panel p1;
	 
	UI_4(){
		super("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new JButton("RED"));
		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("종료"));
		add(p1,BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);//기본적인 UI구조
		
		
		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);

		
		
		//f1.addWindowListener(new WindowEventP());
		
//		addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//				setVisible(false);//눈에안보임
//				dispose();//UI 다파괴
//				System.exit(0);//재활용안됨
//			}
//		});
//		
		//Listener 모두 인터페이스
	//=JFrame 편한거써라
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
	
	

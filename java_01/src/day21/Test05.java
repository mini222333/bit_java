package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Test05 {
	public static void main(String[] args) {
		new UI_5().createUI();
	}

}


class UI_5 extends JFrame implements ActionListener {

	JButton red,blue,exit;
	TextField msg;
	TextArea output;
	
	Panel p1,p2;
	 
	void createUI() {
		super.setTitle("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new JButton("RED"));
		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("종료"));
		add(p1,BorderLayout.SOUTH);
		
		p2 = new Panel();
		//p2.setLayout(new GridLayout(1, 2));
		p2.add(new JLabel("메세지창"));
		p2.add(msg = new TextField(20));
		add(p2,BorderLayout.NORTH);
		
		add(output = new TextArea(15, 40));
		output.setFont(new Font(null, 1, 20));
		
		
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
		
		
		msg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.append(msg.getText()+"\n");
				msg.setText("");
			}
		});
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
	
	

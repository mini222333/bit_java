package day21;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.stream.Stream;



public class Test06 {

	public static void main(String[] args) {
		new DrawImg();

	}

}

class DrawImg extends Frame{
	Image im;
	
	DrawImg(){
		super.setTitle("DrawImg");
		im = Toolkit.getDefaultToolkit().getImage("c://img/noah.jpg");
		
		String[] fontlist = Toolkit.getDefaultToolkit().getFontList();//지금ㄴㄴ
		Stream.of(fontlist).forEach(i -> System.out.println(i));
		setSize(500, 500);
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		repaint();//외우기 페인트메소드 호출
		
		this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			setVisible(false);//눈에안보임
			dispose();//UI 다파괴
			System.exit(0);//재활용안됨
		}
	});
		
		repaint();//외우기 페인트메소드 호출
	}
	
	
	public void paint(Graphics g) {
		g.drawImage(im,20,20,this);
		
	}
	
}

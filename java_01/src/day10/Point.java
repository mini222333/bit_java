package day10;

public class Point {
		int x;
		int y;
		
		public Point() {
			super();//기본생성자 체크 풀기
		}
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		//파라미터 있는 생성자 체크

		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		public void print() {
			System.out.printf("point(x:%2d,y:%2d)%n",x,y);
		}
		

	}


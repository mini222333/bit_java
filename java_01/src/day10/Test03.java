package day10;

public class Test03 {

	public static void main(String[] args) {
             Time t1 = new Time(13,20,20);
             
	}
	}
	
	class Time{
		int hour;
		int minute;
		int second;
		
		
		public Time() {}
		
		
		
		
		
		public Time(int hour, int minute, int second) {
			//super();//생성자 함수 부모의  기본 생성자 함수를 호출하는 문장 지워도 돌아감
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}





		public int getHour() {
			return hour;
		}
		public void setHour(int hour) {
			this.hour = hour;
		}
		public int getMinute() {
			return minute;
		}
		public void setMinute(int minute) {
			this.minute = minute;
		}
		public int getSecond() {
			return second;
		}
		public void setSecond(int second) {
			this.second = second;
		}
		
		
	}



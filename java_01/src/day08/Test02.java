package day08;

public class Test02 {
	public static void main(String[] args) {
        Student[] students = {//배열 무조건 for루프
        		new Student("홍길동", 2019001, 90, 99, 71),
        		new Student("김길동", 2019007, 99, 79, 72),
        		new Student("최길동", 2019041, 91, 89, 73),
        		new Student("박길동", 2019021, 69, 92, 77),
        		new Student("강길동", 2019011, 59, 90, 41)
                //구조체 데이터만 들어가있음
        
        
        };
        
        for(Student data :students) {
        	if(data.getGrade() == 'D')//골라서 등급 출력
        	data.print();
        }
        
	}

}

//기능
class Student{
	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;

	public Student() {}
	public Student(String name,int number,int kor, int eng, int math) {
		this.name = name;//어싸인
		this.number = number;
		//this.kor =kor;
		setKor(kor);//유효성검증
		//this.eng = eng;
		setEng(eng);
		//this.math = math;
		setMath(math);
		//setGradeProcess();
	}
	
	public Student(String data ) {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		
		//유효성검증
		//if(!(kor>= 0&& kor<=100)) {
			//System.out.println(kor+"=>점수가 유효하지 않습니다.");
		//return;
		//}
	      if(checkJumsu(kor)) return;
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
	      if(checkJumsu(eng)) return;
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
        if(checkJumsu(math)) return;
		this.math = math;
	}

	public char getGrade() {
		this.setGradeProcess();
		return grade;
	}

	private void setGradeProcess() {//private 걸면 다른 클래스에서 사용 불가능
		double avg = (kor+eng+math)/3.;
		this.grade = avg>=90 ? 'a':(avg>=80?'B':(avg>=70?'C':(avg>=60?'D':'F')));
	}

	public void print() {
		System.out.printf("%s,%.2f,%s %n",name,kor+eng+math/3.,this.getGrade());//%.2f 소수점이하두자리

	}
	private boolean checkJumsu(int num) {
		boolean flag = true;//초기값
		if(!(num>= 0&& num<=100)) {
		System.out.println(num+"=>점수가 유효하지 않습니다.");
	    flag = false;//이때만 false
		}
			return flag;
		}
		
	}
	


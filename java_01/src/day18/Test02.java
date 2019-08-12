package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	
	public static void main(String[] args) {
		Student[] s = new Student[10];
		Student[] sss= {
				new Student("홍순이", 88, 99),
		        new Student("차순이", 82, 93),
		        new Student("고순이", 80, 91),
		        new Student("홍길동", 80, 91)
		};
		Arrays.sort(sss);//배열 sort
		
		List<Student> list = new ArrayList<Student>();//내부에 Student[] 만들어서 관리해줌
		//ArrayList 클래스 List 부모 ArrayList 자식 vector등으로 바인딩 가능 Student 타입
		list.add(new Student("홍순이", 88, 99));
		list.add(new Student("차순이", 82, 93));
		list.add(new Student("고순이", 80, 91));
		
		//System.out.println(list);
		//이터레이터로 순회 포루프x
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {//조건식오고블락 
                Student data = it.next();
                if(data.getAvg()>=90)
				System.out.println("전원출력");
		
		}
		System.out.println(list.contains(new Student("고순이", 80, 91)));//equals() 오버라이딩 되어있어야함 아니면 false
	
	//C U R D 대부분의 애플리케이션은 curd 기반으로 요구사항에 알맞게 동작 등록수정삭제목록보기         
		//홍길동 90 90 등록
      Student s1 = new Student("홍길동", 90, 90);
      boolean flag = list.add(s1);
      
      if(flag) System.out.println(s1+" 등록되었습니다.");
      else System.out.println(s1+" 등록되었습니다.");
      
        //홍길동 찾아서 100 100 수정
        it = list.iterator();//이터레이터는 다시 쓰려면 재어싸인해줘야함
         while (it.hasNext()) {
			Student data = it.next();
			if(data.name.equals("홍길동")) {//이 조건에 만족하면.한학생만 //같은이름 구분 프라이머리키
			data.ko=100;
			data.math=100;
			data.setAvg();
			System.out.println(data+" 수정되었습니다");
			}
         }
	
         //s1 삭제처리
         System.out.println(" *** 학생"+ s1 +"정보삭제 ***");
         it = list.iterator();
         while (it.hasNext()) {
			Student data = it.next();
			if(data.equals(s1)) {
				it.remove();
			System.out.println(s1+" 삭제되었습니다.");
        }
         }

         Collections.sort((List<Student>) list); //Collect Sort 수행
         //스튜던트클래스가 sort할 능력이 없어서 에러.밑에서 상속해줘야함
         
         //list 목록 출력
         System.out.println(" *** 학생 List 정보 출력 *** ");
         it = list.iterator();
         while (it.hasNext()) {
			Student data = it.next();
			System.out.println(data);
		}
	}

}
class Student extends Object implements Comparable<Student>{//스트링은 comparable 인터페이스를 상속받아서 구현 가능함
	//스튜던트는 x 상속받아야함
	
	String name;
	int ko;
	int math;
	double avg;
	
	public Student() {
		super();
	}
	public Student(String name, int ko, int math) {//avg는 계산해야해서 뺌
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
		setAvg();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = (ko+math)/2.;//계산해야함
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ko=" + ko + ", math=" + math + ", avg=" + avg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {//오버라이딩
		//return ko - o.ko;비교
		//return (int)(avg - o.avg);//캐스팅 .리턴값이 양수면 오름차순
		return name.compareTo(o.name);//이미오버라이딩되어있음 스트링은 빼기못씀
		
		
	}
}

	

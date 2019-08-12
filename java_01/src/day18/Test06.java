package day18;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {
	public static void main(String[] args) {//트리=sort하겠다는뜻 트리셋 정렬 
		
	Set<Employee> set = new TreeSet<Employee>();
	boolean flag = set.add(new Employee(2017001, "홍씨", "영업부"));
	if(flag) System.out.println("등록되었습니다.");
	flag = set.add(new Employee(2017001, "홍씨", "영업부"));
	if(!flag) System.out.println("이미 존재하는 데이터입니다.");//true
	
	set.add(new Employee(2017002, "김씨", "마케팅부"));
	set.add(new Employee(2017003, "박씨", "기술부"));
	
	//이터레이터로 셋에있는목록출력
	System.out.println(" 사원목록 ");
	Iterator<Employee> it = set.iterator();
	while (it.hasNext()) {
	Employee data = it.next();//데이터넘겨받음
    System.out.println(data.toString());
	}
	System.out.println();
	//2017003 사번의 사원을 검색 출력하세요
	
    it = set.iterator();
    System.out.println("검색 결과입니다. ");
    while (it.hasNext()) {
    	Employee data = it.next();
    	if(data.number == 2017003) {
    	System.out.println(data);
    	}
    }
	}
}

package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test04 {
	public static void main(String[] args) {
		// HashMap 구조를 이용하여 Employee 객체관리 
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();//Integer 사번으로 구분
		//Employee[] emp = {
		//new Employee(2017002, "김씨", "마케팅부")
		//};
		map.put(2017002, new Employee( 2017002, "김씨", "마케팅부"));
		map.put(2017009, new Employee( 2017009, "김씨", "마케팅부"));
		map.put(2017012, new Employee( 2017012, "홍씨", "마케팅부"));
		map.put(2018002, new Employee( 2018002, "박씨", "마케팅부"));
		map.put(2019002, new Employee( 2019002, "김씨", "영업부"));
		
		//사원조회 사번을 입력하세요 2018002
		System.out.println("2018002 사번의 사원 조회내역");
		System.out.println(map.get(2018002));
		
		//마케팅부 사원 목록 출력
		System.out.println("마케팅부 사원 목록 출력");
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer num = it.next();
					Employee emp = map.get(num);
					if(emp.dept.equals("마케팅부")) {
						System.out.println(emp);
						//위에 get은 키값을 알고있어서 사용가능 마케팅부는 키값 뽑아내야함
					}
		}
		System.out.println("2018002 사번의 사원 삭제(퇴사처리)");
		System.out.println("삭제 정보 : "+map.remove(2018002));//삭제되는 데이터정보 리턴타입
		System.out.println("2018002 사원 정보=> "+map.get(2018002));
     	// 삭제.퇴사한사원의사번기준삭제 2018002
	}
	
}
	
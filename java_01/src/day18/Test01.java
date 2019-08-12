package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		
		String[] names1 = {"이순신","김순신","박순신","김순신"};
		System.out.println(Arrays.toString(names1));
		//System.out.println(names1);//(주소값찍힘
		Arrays.sort(names1);//배열 sort
		System.out.println(Arrays.toString(names1));
		
	//String [] names1 = new String[100]; 
   // int index=0;
    //names1[100] = "~~~";
		System.out.println("=============================");
    List<String> list = new ArrayList<String>();//인덱스신경x 사이즈에 대한 걱정 없이 쓸수있음 오버라이딩됨
    list.add("김길동");
    list.add("고길동");
    list.add("홍길동");
    list.add("최길동");
    list.add("박길동");
    list.add("고길동");
    list.add("이길동");
    System.out.println(list);//중복허용
    Collections.sort(list); //Collect Sort 수행.클래스
	System.out.println(list);
	List<String> list2 = new ArrayList<String>(list.subList(1, 4));
	System.out.println(list2);
	
	Object[] obj = list.toArray();
	System.out.println("obj => "+Arrays.toString(obj)); //Object[] type
	
	String[] obj2 = new String[list.size()];
	list.toArray(obj2);
	System.out.println("obj2=> "+Arrays.toString(obj2)); //String[] type
	
	String[] sss = {"111","999","777","333"};
	List<String> sslist = new ArrayList<String>(Arrays.asList(sss));
	System.out.println(sslist);//배열이 arraylist로 형변환
	
	System.out.println(" ==== list 다루기 ====");
	System.out.println(list);
	System.out.println(list.contains("홍길동"));//true
	
	for(int i=0;i<list.size(); i++) {
		System.out.println(list.get(i).charAt(0)+"**");//스트링.스트링에서 제공ㅎㅏ는것 쓸수있음ㄴ 인덱스기반루프
	}//셋구조는 위치인덱스x 이방법으로 접근 불가능
	for(String data:list) {
		System.out.print(data+"  ");
	}//리스트
	System.out.println();
	Iterator<String> it = list.listIterator();//앞으로 포루프 안쓰고 이터레이터로 순회.while
	while(it.hasNext()) {//조건식오고블락 
		String data = it.next();
		if(data.equals("고길동")) {
			System.out.println("고길동 삭제 되었습니다.");
			it.remove();
		}
		
	}
	System.out.println(list);
	}

}

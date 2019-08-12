package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {	//해쉬맵 특정키값에 바인딩된 데이터를 꺼내주는 속도 매우 빠름
		Map<String, String> map = new HashMap<String, String>();
		//키값 밸류값 <object,object>모든데이터타입을다사용할수있다는뜻 다운캐스팅 불편하니 스트링
		//키값 중복불허 키값 넣고 밸류값 넣음 풋을 이용해서 집어넣음 꺼낼땐 겟
		map.put("java01", "1234");
		map.put("java02", "1234");
		map.put("admin", "admin");
		for(int i=0;i<30;i++) {
		map.put("test"+i, (int)(Math.random()*3)+"aa");
	}
		//System.out.println(map);
		System.out.println("admin=> pw? "+map.get("admin"));//admin의 밸류값
		System.out.println("java01=> pw? "+map.get("java01"));
		System.out.println("java09=> pw? "+map.get("java09"));
		//키가 존재하지않으면 null나옴
		System.out.println("test01=> pw? "+map.get("test1"));
		System.out.println("===========================");
		
		Set<String> keynames = map.keySet();//리턴타입 set
		Iterator<String> it = keynames.iterator();//iterator while
	    while (it.hasNext()) {
	    	String key = it.next();
	    	System.out.println("ID : "+key+" ,PW : "+ map.get(key));
	    }
		
	
	}

}

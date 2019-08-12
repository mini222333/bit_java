package day17;

import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

public class Test03 {
	public static void main(String[] args) {
		
		//List list = new ArrayList();//object[]
		List list = new Vector();//object[]
		list.add("hello");
		list.add("java");
		list.add(200);
		list.add(new Date());
		list.add(new Book("Spring",50000));
		System.out.println(list);
		for(int i=0; i<list.size();i++)
		System.out.println(list.get(i));//Object
		
		
	}

}

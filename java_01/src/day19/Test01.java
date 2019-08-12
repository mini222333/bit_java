package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<100;i++) {
		stack.push(""+i);//스트링처리
			
		}
		System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0; i<100;i++) {
			queue.offer(i);//스택 푸시로 집어넣음 큐는 오퍼
		}
		System.out.println(queue.poll());//꺼냄
		
	//스택은 배열 링크드리스트는 ?기반으로 동작 배열x
		
	}

}

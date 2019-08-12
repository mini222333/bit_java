package day24;

public class MyStack {

		int[] stack;
		int top = 0;
		public MyStack(){
			stack = new int[10];
		}
		public MyStack(int size) {
			if(size < 0)
			stack = new int[10];
			else
				stack = new int[size]; //스택 차곡차곡 쌓아서 맨위부터 나옴
		}
		
		boolean isEmpty() {
			return top == 0 ? true:false; //비어있는지 알려주는 메소드
		}
		
		boolean isFull() {
			return top == stack.length ? true:false;
		}

		 public synchronized void push(int data) {//푸시메소드
		if(isFull()) {
			System.out.println("stack is full ...");
			
		}
		stack[top] = data;
		top++;
		System.out.println("push =>"+data);
		notifyAll();
		}

	 public synchronized int top() {
		  if(isEmpty()) return -1;
		  return stack[top-1];
	  }
	  
	  public synchronized int pop() {
		  if(isEmpty()) { //return -1;
		  try {
			  wait();
		  }catch (InterruptedException e) {
			  e.printStackTrace();
		  }
		  }
		  int data = stack[--top];
		  System.out.println("                       pop=>"+data);
		  notifyAll();
		  return data;
	  
	  
	  }
	}


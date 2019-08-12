package day18_ex;


public class MyStack<E> {//오브젝트는 안됨 //타입 결정 못할때 //마이스택에 제네릭 적용해서 구조 바꿔봄
	
	E[] stack;
	int top = 0;
	
	public MyStack(){
		stack = (E[]) new Object[10];
	}
	MyStack(int size) {
		if(size < 0)
		stack = (E[]) new Object[10];
		else
			stack = (E[]) new Object[size]; //스택 차곡차곡 쌓아서 맨위부터 나옴
	}
	
	public boolean isEmpty() {
		return top == 0 ? true:false; //비어있는지 알려주는 메소드
	}
	
	public boolean isFull() {
		return top == stack.length ? true:false;
	}

	public void push(E data) {//푸시메소드
	if(isFull()) {
		System.out.println("stack is full ...");
		
	}
	stack[top] = data;
	top++;
	}

	public E top() {
	  if(isEmpty()) return null;
	  return stack[top-1];
  }
  
	public E pop() {
	  if(isEmpty()) return null;
	  return stack[--top];//내가 찾는 데이터가 없으면 보통 -1을 넣어준다.
  }


}



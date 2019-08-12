package day19;

public class Node<E>{
	E data;
	Node<E> next;
	//그 다음 데이터 얘기해줌 null이면 그 다음 데이터 없음
	//이런식으로 데이터 관리된다까지 알아두기
	public Node(E data, Node<E> next) {//링크드리스트는 노드기반

		this.data = data;
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	

}

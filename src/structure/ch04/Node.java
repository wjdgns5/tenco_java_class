package structure.ch04;

public class Node {

	private String data;
	
	// 자기 자신을 참조하는 것
	
	// 자기 참조 관계
	// 정의: 자기 참조는 객체가 자신과 같은 타입의 다른 객체를 가리키는 경우를 말한다.
	// 용도: 연결 리스트(Linked list) 트리(Tree)구조에 많이 활용된다.
	public Node next; // 자기 참조 

	public Node() {
		data = null;
		next = null;
	} // 기본 생성자

	public Node(String data) {
		this.data = data;
		next = null;
	} // 기본 생성자 (오버로딩)

	public Node(String data, Node link) {
		this.data = data;
		next = link;
	} // 기본 생성자 (오버로딩)

	public String getData() {
		return data;
	} // getter

} // end of class

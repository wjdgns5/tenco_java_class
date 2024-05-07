package structure;

public class MyArrayStack {

	int top; // 스택의 최상위 요소를 가리킴
	TencointArray arrayStack; // 포함관계 , 컴포지션

	public MyArrayStack() {
		top = 0; // 스택 포인터 초기화
		arrayStack = new TencointArray(); // 배열칸 10개 생성 됨

	}

	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new TencointArray(size);
	}

	// 스택의 크기(요소갯수)를 반환
	public int getSize() {
		return top;
	}

	// 스택이 비어있는지 확인
	public boolean isEmpty() {
		return top == 0;
	}

	// 스택의 요소가 가득 찼는지 확인 메서드를 만들어 보자.
	public boolean isFull() {
		return top == arrayStack.ARRAY_SIZE;
	}

	// 스택의 모든 요소를 출력하는 기능
	public void printAll() {
		arrayStack.printAll();
	}

	// 스택에 데이터를 추가하는 기능
	public void push(int data) {
		// 방어적 코드 작성
		if (isFull()) {
			System.out.println("메모리가 가득 ");
			return; // 실행의 제어 멈춤
		}
		arrayStack.addElement(data);
		top++;

	}

	// 스택에서 데이터를 제거하고 반환하는 메서드
	public int pop() {
		// 방어적 코드 꺼낼 데이터가 없다면
		if (top == 0) {
			System.out.println("stack is empty");
		}
		int temp = peek(); // temp에 peak() 사용하여 최상위 데이터를 꺼낸다. 데이터가 삭제되지는 않음
		System.out.println("LOG  1 : " + (top - 1));
		arrayStack.removeElement(top - 1); // top은 개수
		top--;
		return temp;
	}

	// 스택의 최상위 요소를 반환하지만 제거는 하지 않음
	public int peek() {
		// 방어적 코드 꺼낼 데이터가 없다면
		if (top == 0) {
			return TencointArray.ERROR_NUM;
		}
		return arrayStack.getElement(top - 1);
	}

	// 코드 테스트
	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack();
		stack.push(100);
		stack.push(200);
		stack.push(300);

		// 전체 출력
		// stack.printAll();

		stack.pop(); // 버그 해결
		// --> pop 제거된 요소를 반환 할 수 있도록 코드를 수정 해 주세요.
		System.out.println("----------------");
		// stack.printAll();
		System.out.println(stack.peek());
		System.out.println("----------------");
		stack.printAll();

	} // end of main

}

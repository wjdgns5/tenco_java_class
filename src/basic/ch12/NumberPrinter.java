package basic.ch12;

// 번호를 뽑아 주는 기계
public class NumberPrinter {
	
	// 멤버 변수
	private int id;
	// static 을 사용
	// static 을 사용하면 Method Area 로 이동한다.
	// 속도는 Method Area 가 Heap 보다 빠르다. 
	
//	private int waitNumber; // 멤버 변수
//	static 변수 --> 	Method Area
//  waitNumber 먼저 올라감
	public static int waitNumber; // Method Area
	
	
	public NumberPrinter(int id) {
		this.id = id;
		waitNumber = 1;
	} // 생성자
	
	// 기능 -- 번호표를 출력 한다.
	public void printWaitNumber() {
		
		System.out.println(id +" 번에 기기의 대기 순번은 " + waitNumber);
		waitNumber++;
	} // 메서드 
}

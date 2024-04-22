package basic.ch12;

public class NumberPrintTest {

	public static void main(String[] args) {
		
		NumberPrinter n1 = new NumberPrinter(1); // 왼쪽 기기
		NumberPrinter n2 = new NumberPrinter(2); // 오른쪽 기기
		
		n1.printWaitNumber(); // 고객 1
		n1.printWaitNumber(); // 고객 2
		n1.printWaitNumber(); // 고객 3
		n1.printWaitNumber(); // 고객 4
		
		n2.printWaitNumber(); // 고객 5
		n2.printWaitNumber(); // 고객 6
	
	} // end of main

}

package structure;

public class MainTest1 {

	public static void main(String[] args) {

		TencointArray tencointArray = new TencointArray();

		tencointArray.addElement(100);
		tencointArray.addElement(200);
		tencointArray.addElement(300);
		tencointArray.addElement(400);
		tencointArray.addElement(500);
		tencointArray.addElement(600);
		tencointArray.addElement(700);

		 tencointArray.insertElement(3, 50); // 테스트 이후에 수정 - todo

		//tencointArray.printAll();
		// System.out.println(tencointArray.getElement(4));
		System.out.println("-----------------------");
		//System.out.println(tencointArray.getCountSize());
		System.out.println("-----------------------");
		//System.out.println(tencointArray.isEmpty());
		System.out.println("-----------------------");
		//tencointArray.removeAll();
		tencointArray.printAll();
		// tencointArray.getElement(4);

	}

}

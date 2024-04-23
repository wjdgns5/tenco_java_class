package basic.ch18;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new Computer();
		CPU cpu1 = new CPU();
		cpu1.setName("AMD");
		computer.setCPU(cpu1);

		// 우리 컴퓨터에 장착 되어있는 CPU 이름
		// 출력하고 싶다면??
		System.out.println(computer.getCPU().getName());
	}

}

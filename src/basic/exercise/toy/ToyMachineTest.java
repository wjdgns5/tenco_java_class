package basic.exercise.toy;

public class ToyMachineTest {

	public static void main(String[] args) {

		product lion1 = new lion("사자1");

		product bear1 = new bear("곰1");

		product air1 = new airpods("에어팟1");

		toyMachine machine = new toyMachine();

		product[] product = new product[9];

		product[0] = lion1;
		product[1] = bear1;
		product[2] = air1;
		product[3] = lion1;
		product[4] = lion1;
		product[5] = lion1;
		product[6] = bear1;
		product[7] = air1;
		product[8] = air1;
		
		
		
		

		boolean bl = true;
		while (bl) {
			machine.Start();
			for (int i = 0; i < product.length; i++) {
				if (product[i] != null && product[i] instanceof lion) {
					System.out.println(product[i].name);
				} else if (product[i] != null && product[i] instanceof bear) {
					System.out.println(product[i].name);
				} else if (product[i] != null && product[i] instanceof airpods) {
					System.out.println(product[i].name);
				} else if (product[i] == null ){
					machine.Stop();
				}
			}
			bl = false;
		} // end fo while

	}

}

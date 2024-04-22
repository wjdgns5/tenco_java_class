package basic.ch12;

public class classAccount {

	public static void main(String[] args) {
		
		Back back1 = new Back();
		Back back2 = new Back();
		Back back3 = new Back();
		
		System.out.println(back1.GetCode());
		back2.SetMoney(11);
		
		back1.setBankName("하나은행");
		
		back1.getBankName();
		back2.getBankName();
		back3.getBankName();
	}

}

package quiz05;

public class MainClass {

	public static void main(String[] args) {

		MyAccount myAcc = new MyAccount("홍길동" , "1234", 100000000);
		
		myAcc.deposit();
		myAcc.withDraw();
		
		int bal = myAcc.getbalance();
		System.out.println(myAcc.name + "님의 출금 후 계좌 잔액은:" + bal + "원입니다.");
	}

	
}
package quiz05;
import java.util.*;
public class Account {
	String name;
	String password;
	int balance;
	Scanner scan = new Scanner(System.in);
	Account(){
		
	}
	Account(String n, String pw, int bal){
		name = n;
		password = pw;
		balance = bal;
	}
	
	void deposit() {
		System.out.println("입금 할 금액 입력:");
		int a = scan.nextInt();
		balance += a;
	}
	
	void withDraw() {
		System.out.println("출금 할 금액 입력:");
		int b = scan.nextInt();
		balance -= b;
	}
	
	int getbalance() {
		
		return balance;
	}

}

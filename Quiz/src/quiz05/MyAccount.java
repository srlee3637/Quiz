package quiz05;
import java.util.*;
public class MyAccount extends Account {
	/*
	철수는 Account를 상속받는 나의계좌를 만드려고 한다.
	기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.

	Account를 상속받고
	withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
	금액을 감소시키려고 한다.
	또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
	withDraw() 메서드를 오버라이딩 해주세요.

	 */
	MyAccount(){
		
	}
	MyAccount(String n, String pw, int bal){
		name = n;
		password = pw;
		balance = bal;
	}
	void withDraw() {
		Scanner scan = new Scanner(System.in);
		int c = 0;
		while(true) {
			
			if(c == 5) {
				System.out.println("가까운 영업점을 방문하세요");
				break;
			}
			System.out.println("비밀번호:");
			String pwCh = scan.next();

			if(password.equals(pwCh)) {
				System.out.println("현재 잔고:" + balance +"원");
				System.out.println("출금 할 금액 입력:");
				int b = scan.nextInt();
				if(balance >= b ) {
					balance -= b;
				}else if(balance < b) {
					System.out.println("잔액 부족 충전하세요");
				}
				break;
			}else {
				c++;
				System.out.println("비밀번호 틀림 다시 입력하세요");
			}
			
			
		}
	}
	
	
	void deposit() {
		System.out.println("입금 할 금액 입력:");
		int a = scan.nextInt();
		balance += a;
	}
}

package quiz12;

import java.util.Arrays;

public class MyCart {
	/*
	철수는 TV객체, Radio객체, Computer객체를 전달받아서 계산하는 Cart클래스를 만드려고한다.
	Product클래스는 부모클래스 이다.
	Tv, Radio, Computer는 자식클래스 이다.
	Product클래스에는 필요한 변수가 선언되어 있고 getter, setter가 생성되어 있다.
	*/
	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0;
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
	}
	
	/*
	 * 3. buy(모든 상품을 받도록 선언)
	 * ************객체의 getter메서드의 활용*************
	 * 가진돈과 전달된 물건객체의 가격을 비교해서 돈이 적으면 "금액부족" 출력후에 종료하세요.
	 * 가진돈이 충분하면 물건의 가격을 money에서 차감하고 add(상품) 메서드를 호출합니다.
     */ 
	
	public void buy(Product p) {
		int a = p.getPrice();
		if(a > money) {
			System.out.println("금액부족");
			return;
		}else {
			money -= a;
			add(p);
		}
	}
	
	/*
	 * 4. add(모든 상품을 받도록 선언)
	 * *************배열의 복사**************
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품(매개변수)을 장바구니(배열)에 담는다.
	 * 
	 * info()메서드 호출
	 */
	
	private void add(Product p) {
		
		if(i < cart.length) {
			cart[i] = p;
			i++;
		}
		else{
			
			Product[] cart1 = new Product[i * 2];
			System.arraycopy(cart, 0, cart1,0, i);
			
			cart = cart1;
			cart[i] = p;
			i++;
			
		}
		
		info();
		
//		if(i >= cart.length) { //배열이 가득참
//			Product[] arr = new Product[cart.length * 2];
//			for(int j = 0; j < cart.length; j++) {
//				arr[j] = cart[j]; //배열복사
//			}
//			
//			cart = arr; //배열 변경
//		}
//		cart[i] = p; //배열에 추가
//		i++;
//		
//		info();
	}
	/*
	 * 5.info()
	 * - 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * - 남은금액 출력
	 * 출력예시: TV TV Computer Radio ......
	 * 		  남은금액: 500
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	
	public void info() {
		
		for(Product p : cart) {
			if(p==null)break;
			
			System.out.print(p.getName() + " ");
			
		}
		System.out.println();
		System.out.println("남은 금액: " + money);
		
//		for(int j = 0; j < this.i; j++) {
//			Product p = cart[j];
//			System.out.print(p.getName() + " ");
//		}
//		System.out.println("\n남은금액:" + money);
		
	}
	
	
}

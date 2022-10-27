package quiz02;

public class Coffee {

	String menu;
	int price;
	int count;
	int sum;
	boolean bool;
	
	Coffee(){
		System.out.println(bool);
	}
	
	Coffee(String m, int p, int c){
		menu = m;
		price = p;
		count = c;
	}
	
	void count() {
		System.out.println(menu + "를 " + count + "잔 구매함");
	}
	
	int priceSum() {
		
		sum = price * count;
		
		return sum;
	}
	
	
}

package quiz12;

public class MainClass {

	public static void main(String[] args) {
		MyCart my = new MyCart(10000);
		Radio r = new Radio();
		Tv t = new Tv();
		Computer c = new Computer();
		Product[] p = {r, t,c};
		
		my.buy(r);
		my.buy(t);
		my.buy(c);
		my.buy(c);
		my.buy(t);

		
	}

}

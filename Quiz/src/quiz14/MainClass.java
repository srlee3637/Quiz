package quiz14;

public class MainClass {

	public static void main(String[] args) {
		
		
		Marine m3 = new Marine(); 
		m3.move(10, 20);
		m3.location();
		m3.stop();
		System.out.println( Marine.armor );
		System.out.println( Marine.attack );
		
		Marine m = new Marine();
		Tank t = new Tank();
		DropShip d = new DropShip();
		
		m.location();
		t.location();
		t.changeMode();
		d.location();
		
		t.changeMode();
		m.move(4, 2);
		t.move(4, 2);
		d.move(4, 2);
		
		m.location();
		t.location();
		d.location();
		
		m.stop();
		t.stop();
		d.stop();
		
		d.pick(t);
		d.pick(m);
		d.pick(m);
		d.pick(m);
		d.pick(m);
		
		d.pick(m);
		
		DropShip d1 = new DropShip();
		d1.pick(m);
		d1.pick(m);
		d1.pick(m);
		d1.pick(m);
		d1.pick(m);
		d1.pick(m);
		d1.pick(m);
		d1.pick(m);
		d1.pick(m);

		
		
		
	}

	

}

package quiz04;

public class MainClass {

	public static void main(String[] args) {

		Warrior wa = new Warrior("힘전사");
		
		Wizard  wi= new Wizard("마나법사");
		
		wa.info();
		wi.info();
		System.out.println();
		wa.bash();
		wa.info();
		System.out.println();
		wi.iceArrow();
		wi.info();
		wa.info();
		
		
	}
	
	

}

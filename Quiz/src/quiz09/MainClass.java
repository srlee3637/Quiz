package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp s = new SuperSonicAp("F1");
		
		s.takeOff();//상속
		s.fly();//오버라이딩
		s.flyMode = 1;
		s.fly();//오버라이딩
		s.land();
		
		System.out.println(s.info());
	}

}

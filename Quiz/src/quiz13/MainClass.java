package quiz13;

public class MainClass {

	public static void main(String[] args) {

		Shape s = new Rect("사각형",10);
		System.out.println(s.getName());
		System.out.println("넓이: " + s.getArea());
		System.out.println();
		Shape s1 = new Circle("원", 10);
		System.out.println(s1.getName());
		System.out.println("넓이: " + s1.getArea());
		
	}

}

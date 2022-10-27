package quiz13;

public class Circle extends Shape {
	//원은 생성될 때 이름과, 반지름의 길이를 받도록 처리하고,
	//getArea()는 원의 넓이를 계산하도록 오버라이딩 처리
	//main에서 확인
	private int radius;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
		
	}
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

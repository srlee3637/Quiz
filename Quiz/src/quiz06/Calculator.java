package quiz06;

public class Calculator {

	int result;
	double pi;
	
	
	Calculator(){
		
	}
	
	int add(int a){
		result += a;
		return result;
	}
	
	double circle(int r) {
		pi = 3.14;
		return r * r * pi;
	}
	
}

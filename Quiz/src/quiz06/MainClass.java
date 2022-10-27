package quiz06;
import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calculator cal = new Calculator();
		Computer com = new Computer();
		
		
		System.out.println("반지름의 길이를 입력:");
		int r = scan.nextInt();
		System.out.println("반지름이 "+ r +"인 원의 넓이는");
		System.out.println(cal.circle(r));
		System.out.println("반지름의 길이의 총합:" + cal.add(r));
		System.out.println("반지름의 길이를 입력:");
		int r1 = scan.nextInt();
		System.out.println("반지름이 "+ r1 +"인 원의 넓이는");
		System.out.println(cal.circle(r1));
		System.out.println("반지름의 길이의 총합:" + cal.add(r1));
		
		System.out.println();
		System.out.println("반지름이 "+ r +"인 원의 넓이는");
		System.out.println(com.circle(r));
		System.out.println();
		System.out.println("반지름이 "+ r1 +"인 원의 넓이는");
		System.out.println(com.circle(r1));
		System.out.println();
		
		System.out.println("정사각형 한 변의 길이 입력:");
		double a = scan.nextDouble();
		System.out.println("길이가 " + a +"인 정사각형의 넓이는" + com.rect(a));
		System.out.println("직사각형 나머지 변의 길이 입력:");
		double b = scan.nextDouble();
		System.out.println("길이가 " + a + "와 " + b 
				+"인 직사각형의 넓이는" + com.rect(a,b));
		
		System.out.println("직육면체 나머지 변의 길이 입력:");
		double c = scan.nextDouble();
		System.out.println("길이가 " + a + "와 " + b + "와 " + c
				+"인 직육면체의 부피는" + com.rect(a,b,c));
		
		
		
	}
}

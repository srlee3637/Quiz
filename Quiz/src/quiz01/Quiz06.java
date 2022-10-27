package quiz01;
import java.util.*;
public class Quiz06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수1>");
		int a = s.nextInt();
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String s1 = s.next();
		System.out.print("정수2>");
		int b = s.nextInt();
		
		switch (s1) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		default:
			System.out.println(a/b);
			break;
		}
	}

}

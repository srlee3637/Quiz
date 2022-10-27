package quiz01;
import java.util.*;
public class Quiz22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		method1();
		String result = method2("안녕");
		System.out.println(result);
		
		double result2 = method3(1,2,3);
		System.out.println(result2);
		
		System.out.println("숫자입력>");
		int a = scan.nextInt();
		String result3  = method4(a);
		System.out.println(result3);
		
		System.out.println("복사할 문자 입력>");
		String str1 = scan.next();
		System.out.println("반복할 숫자 입력>");
		int b = scan.nextInt();
		method5(str1, b);
		
		System.out.println("숫자 입력>");
		int num1 = scan.nextInt();
		System.out.println("숫자 입력>");
		int num2 = scan.nextInt();
		int result4 = maxNum(num1, num2);
		System.out.println(result4);
		
		System.out.println("숫자 입력>");
		int num3 = scan.nextInt();
		int result5 = abs(num3);
		System.out.println(result5);
		
		String str = java(5);
		System.out.println(str);
		
		String str2 = java(9);
		System.out.println(str2);
		
		System.out.println(sum(5));
		System.out.println(sum(6));
		
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String str) {
		
		return str;
	}
	
	static double method3(int a, int b, double d) {
		
		return a + b + d;
	}
	
	static String method4(int a) {
		
		if(a % 2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}
		
	}
	
	static void method5(String str, int a) {
		for(int i = 0; i < a; i++ )
		{
			System.out.println(str);
		}
	}
	
	static int maxNum(int a, int b) {
		
		int max = a > b ?  a : b;
		
		return max;
		
	}
	
	static int abs(int a) {
		
		int abs = a >= 0 ? a : -a  ;
		
		return abs;
	}
	
	static String java(int a) {
		String str = "";
		
		for(int i = 1; i <= a; i++) {
			
			if(i % 2 == 0) {
				str += "바";
			}else {
				str += "자";
			}
		}
		
		return str; 
	}


	//n의 약수를 모두 더한 값을 리턴하는 함수
	static int sum(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	
}

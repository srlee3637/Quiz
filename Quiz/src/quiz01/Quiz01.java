package quiz01;

public class Quiz01 
{

	public static void main(String[] args) 
	{
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65


		System.out.println(y += 10 - x++); // 13
		System.out.println(x+=2); // 5
		System.out.println( !('A' <= c && c <='Z') )
		; //false
		System.out.println('C'-c); // 2
		System.out.println(c+1); // 66
		System.out.println(c); // A

		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c);  // C


		/*
		 * 3항 연산자
		 * -피 연산자가 3개인 연산자를 말한다.
		 * 조건식? 연산식1:연산식2
		 * 조건식의 결과값이 참이면 연산식1, 거짓이면 연산식2 
		 */

	}	

	public static int S()
	{
		int a = 12;
		int b = 13;
		return a+b;

	}

	public static double P()
	{
		double a = 3.14;
		double b = 2.31;
		return a+b;

	}







	
}

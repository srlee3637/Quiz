package quiz16;

import java.util.Scanner;

public class Calculator {
//	static Scanner sc = new Scanner(System.in);
	
//	public static void main(String[] args) {
//		
//		
//		try {
//			System.out.println(Calculator.input());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//	        sc.close();
//		}
//	}
	
//	public static int input() throws Exception {
//
//		/*
//		 * 1. 스캐너로 정수 2개를 입력 받는다
//		 * 2. 입력된 값이 정수라면 합계를 반환한다.
//		 * 3. 예외가 발생될 수 있는 상황이라면 throw를 이용해서 메서드를 종료하고 예외 메시지를 전달
//		 * 4. scan.close() 는 finally문장에서 사용
//		 */
//		
//		if(!sc.hasNextInt()) {
//			throw new Exception("숫자를 입력하세요");
//			//예외 강제생성- 예외를 생성하면 예외처리 구문이 필요합니다
//			
//		}
//		int num1 = sc.nextInt();
//		
//		if(!sc.hasNextInt()) {
//			throw new Exception("숫자를 입력하세요");
//			//예외 강제생성- 예외를 생성하면 예외처리 구문이 필요합니다
//			
//		}
	
//		int num2 = sc.nextInt();	
//		
//		
//
//		return num1 + num2;
//	}
	
	
	public static int input() throws Exception {
		/*
		 * 1. 스캐너로 정수 2개를 입력을 받습니다.
		 * 2. 입력된 값이 정수라면 합계를 반환합니다.
		 * 3. 예외가 발생될 수 있는 상황이라면 throw를 이용해서 메서드를 종료하고 예외 메시지를 전달해주면 됩니다
		 * 4. scan.close() 는 finally문장에서 사용하세요
		 */
		//Scanner scan = new Scanner(System.in);
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			return num1 + num2;
			
		} catch (Exception e) {
			throw new Exception("숫자로 입력하세요"); //예외생성
		}finally {
			scan.close();
		}

	}
	
}

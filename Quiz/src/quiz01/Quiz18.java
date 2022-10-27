package quiz01;
import java.util.*;
public class Quiz18 {
	/*
	 * 랜덤한 덧셈 문제를 내는 프로그램
	 * 반복이 실행될때마다 1~100사이의 랜덤한 덧셈 구문이 출력된다.
	 * 0을 받으면 프로그램 종료
	 * 프로그램이 종료되면 정답횟수, 오답횟수를 출력
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num =1;
		int correct = 0;
		int wrong = 0;
		while(num != 0) {
			int ran = (int)(Math.random() * 100) +1;
			int ran1= (int)(Math.random() * 100) +1;
			int sum = ran + ran1;
			System.out.println(ran + " + " + ran1 + " =  ?");
			System.out.println("문제를 그만 푸시려면 0을 입력하세요");
			System.out.print(">");
			
			num = sc.nextInt();
			if(num == sum) {
				System.out.println("정답입니다");
				correct++;
			}
			
			else if(num != sum && num !=0) {
				System.out.println("틀렸는데요?");
				wrong++;
			}
		}
		System.out.println("프로그램 정상 종료");
		System.out.println("정답: " + correct);
		System.out.println("오답: " + wrong);
		sc.close();
		
	}

}

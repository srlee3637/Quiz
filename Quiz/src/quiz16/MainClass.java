package quiz16;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * up down게임
		 * 1~100까지 임의 숫자를 1 번 생성
		 * 반복문 안에서 스캐너를 이용해서 정답을 입력 받고
		 * 랜덤수가 입력받은 값보다 작으면 "더 큰수를 입력하세요"
		 * 랜덤수가 입력받은 값보다 크면 "더 작은 수를 입력하세요"
		 * 정답이라면 시도횟수: x회를 출력하고 종료
		 */



		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*100) + 1;
		int count = 0;
		while(true) {
			try {



				System.out.println("정답입력>");
				int x = Integer.parseInt(sc.nextLine());
				count++;

				if(num == x) {

					System.out.println("정답입니다");
					System.out.println("시도횟수:" + count);
					break;
				}

				else if(num > x) {
					System.out.println("더 큰 수를 입력하세요");

				}

				else {
					System.out.println("더 작은 수를 입력하세요");

				}
			}
			catch (Exception e) {
				System.out.println("숫자로 입력하세요");
				//sc.nextLine();
				count++;
			}

			



		}

	}
}


package quiz01;
import java.util.*;
public class Quiz16 {

	public static void main(String[] args) {

		/*
		 * 정수형태로 입력을 2개 받습니다
		 * 첫번째 = 가로 길이, 두번째 = 세로 길이
		 * 
		 * 입력받은 가로, 세로 길이의 사각형을 출력하면 됩니다.
		 * 단, 윤곽만 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("가로>");
		int a = sc.nextInt();
		System.out.print("세로>");
		int b = sc.nextInt();
	
		
		
		for(int i = 0; i < b; i++) {

			for(int j = 0; j < a; j++) {
				if(j == 0 || j == a-1 ||i == 0 || i == b-1) {
					System.out.print("* ");
				}else System.out.print("  ");
			}

			System.out.println();
		}

	}

}

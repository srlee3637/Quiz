package quiz01;
import java.util.*;
public class Quiz07 {

	public static void main(String[] args) {
//		int a = 1;
//		while(a<=20){
//			System.out.println(a + "번 학생의 출석을 체크");
//			a++;
//		}
		
		/*
		 * 정수를 입력받아서
		 * 입력받은 값에 대한 구구단을 출력
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하세요>");
		int a = s.nextInt();
		System.out.println("구구단:" + a + "단");
		int i = 1;
		while(i<10) {
			System.out.println(a + " x " + i + " = " + a*i);
			i++;
		}
	}

}


package quiz01;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수 3개를 각각입력 받는다
		 * 같은 정수는 없다고 가정
		 * 
		 * 가장 큰 값, 중간 값, 가장 작은 값 구분해서 출력
		 */

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int max = 0;
		int min = 0;
		int mid = 0;
		if(a>b && a>c){
			max = a;
			if(b>c) {
				mid = b;
				min = c;
			}
			else {
				mid = c;
				min = b;
			}
		}
		else if(b>a && b>c){
			max = b;
			if(a>c) {
				mid = a;
				min = c;
			}
			else {
				mid = c;
				min = a;
			}
		}else {
			max = c;
			if(a>b) {
				mid = a;
				min = b;
			}
			else {
				mid = b;
				min = a;
			}
			
		}
		
		System.out.println("max:"+ max);
		System.out.println("mid:"+ mid);
		System.out.println("min:"+ min);
		s.close();
	}
}
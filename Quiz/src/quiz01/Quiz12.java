package quiz01;
import java.util.*;
public class Quiz12 {

	public static void main(String[] args) {
		/*
		 * for~~~
		 * 1. 7~100 까지의 정수 중의 7의 배수 가로로
		 * 2. 1~200 까지의 정수 중의 9의 배수의 개수를 출력
		 * 3. 50~100 까지 두 수 사이의 합
		 * 4. char 변수를 활용해서 A ~ Z까지 출력 A = 65, Z = 90
		 * 5. 어떤 수를 입력받아서 입력 받은 수의 구구단 출력
		 */
		int a = seven();
		System.out.println();
		a = nine();
		System.out.println();
		a = sum();
		System.out.println();
		a = alphabet();
		System.out.println();
		a = multiple();
		
	}



	public static int seven() {


		for(int i = 7; i < 100; i+=7){
				System.out.print(i + " ");
		}
		return 0;

	}


	public static int nine() {

		int count = 0;
		for(int i = 1; i <= 200; i++){
			if(i%9==0) {
				count++;
			}
		}
		System.out.print(count);
		return 0;

	}
	
	
	public static int sum() {

		int sum = 0;
		for(int i = 50; i <= 100; i++){
			sum+=i;
		}
		System.out.print(sum);
		return 0;

	}
	
	public static int alphabet() {

		
		for(int i = 65; i <= 90; i++){
			System.out.print((char)i + " ");
		}
		return 0;

	}
	
	public static int multiple() {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++){
			System.out.println(num + " * " + i + " = " + num * i);
		}
		return 0;

	}

}

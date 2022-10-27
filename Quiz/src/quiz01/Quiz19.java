package quiz01;
import java.util.*;

public class Quiz19 {

	public static void main(String[] args) {

		/*
		 * 사람수(정수)를 입력 받는다.
		 * 입력 받은 사람수 만큼 랜덤한 배열을 생성해서 중복되지 않게 랜덤 값을 저장
		 * 랜덤값의 크기는  1 <= x <= 사람수 
		 * 
		 * 중복되지 않는 배열이 생성 되었다면, ○문자를 이용해서 배열의 크기를 출력
		 * 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있다.
		 * 제대로 선택된 좌석이면 자리 번호를 공개하고 출력
		 * 제대로 선택되지 않은 좌석이면 다시 선택을 출력
		 */


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] table = new int[N];

		int i = 0;

		while(i<N) {

			table[i] = (int)(Math.random()*N) + 1;

			for(int j = 0; j < i; j++) {
				if(table[j] == table[i]) {
					i--;
				}
			}

			i++;


		}

		System.out.println(Arrays.toString(table));

		int [] arr = new int[N];
		String[] str = new String[N];
		boolean[] bool = new boolean[N];
		for(int k = 1; k <= N; k++) {
			arr[k-1] = k;
			str[k-1] = "○";
			bool[k-1] = true;
		}
		int m = 0;
		while(m <=N) {
			System.out.println("-----------------좌석 선택 프로그램-------------------------");
			for(int l = 0; l < N; l++) {
				System.out.print(arr[l]+"  ");
			}
			System.out.println();
			for(int l = 0; l < N; l++) {
				System.out.print(str[l] + "  ");
			}
			System.out.println();

			if(m==N) {
				System.out.println("종료되었습니다");
				break;
			}
			int n = scan.nextInt();


			if(n > N || n <= 0) {
				m--;
				System.out.println("제대로 선택하실래요?");
			}
			
			else {
				
				for(int a = 0; a < N; a++) {
					
					if(!bool[n-1]) {
						
						System.out.println("이미 입력된 값입니다.");
						m--;
						break;
					}
					
					if(n-1 == a) {
						
						str[a] = "●";
						bool[a] = false;
						System.out.println("자리번호를 공개합니다:" + table[a]);
						break;
						
					}

				}
				
			}
			m++;
			
		}

		scan.close();
	}

}




//
//import java.util.*;
//
//public class Quiz19 {
//
//	public static void main(String[] args) {
//		
//		/*
//		 * 1. 사람수(정수)를 입력을 받습니다.
//		 * 2. 입력받은 사람수 만큼 랜덤한 배열을 생성해서 중복되지 않게 랜덤값을 저장
//		 * 
//		 * 랜덤값 크기 1 <= x <= 사람수
//		 * 
//		 * 3. 중복되지 않는 배열이 생성 되었다면, ○문자를 이용해서 배열의 크기를 출력 (ㅁ 한자 9)
//		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
//		 * 5. 제대로 선택된 좌석이면 자리번호를 공개하고 출력.
//		 * 	  제대로 선택되지 않은 좌석이면 다시 선택을 출력.
//		 * 
//		 */
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("배정할 좌석의 크기를 지정하세요>");
//		int size = scan.nextInt();
//		
//		
//		int[] arr = new int[size];
// 		int index = 0;
// 		
//		start:while(true) {
//			if(index == size) break; //순서가 꽉차면 탈출
//			
//			int seat = (int)(Math.random() * size) + 1; //1~21까지 랜덤수 발생
//			//중복검사(랜덤값과 배열의 index번째가 동일한게 있다면 다시 처음부터
//			for(int i = 0; i < index; i++) { 
//				if( seat == arr[i]) {
//					continue start;
//				} 
//			}
//			arr[index] = seat; //랜덤값 추가
//			index++;		   //배열순서 증가
//		}
//
//
// 		while(true) {
// 			System.out.println("-----------------------좌석 선택 프로그램-----------------------");
// 			for(int i = 0; i < arr.length; i++) {
// 				System.out.printf("%-3d", i+1);
// 			}
// 			System.out.println();
// 			
// 			for(int i = 0; i < arr.length; i++) {
// 				if(arr[i] == 0) 
// 					System.out.printf("%-3s", "●");
// 				else 
// 					System.out.printf("%-3s", "○");
// 			}
// 			System.out.println();
// 			 			
// 			System.out.print("좌석 선택>");
// 			int seat = scan.nextInt();
// 			
// 			/*
// 			try {
//				System.out.println(3);
//				Thread.sleep(1000);
//				System.out.println(2);
//				Thread.sleep(1000);
//				System.out.println(1);
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				System.out.println("선택중 에러발생");
//			}
// 			*/
// 			
// 			if(arr[seat-1] == 0 ) 
// 				System.out.println("제대로 선택하실래요?");
// 			else {
// 				System.out.println("자리번호를 공개합니다:" + arr[seat-1]);
// 				arr[seat-1] = 0;
// 			}
// 			
// 			
// 			try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				System.out.println("선택중 에러발생");
//			}
// 		}
//		
//		
//	}
//}


package quiz01;
import java.util.*;
public class Quiz11 {

	public static void main(String[] args) {
		/*
		 * 첫행의 입력값은 배열의 크기가 된다.
		 * 배열의 크기만큼 반복을 돌면서, 입력받은 수들을 배열에 순서대로 저장
		 * 5
		 * 10 20 30 40 50
		 * arr = {10, 20, 30, 40, 50}
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		int i = 0;
		while(i < n) {
			arr[i] = sc.nextInt();
			
			i++;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	

}

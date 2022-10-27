package quiz01;
import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1000, 500, 100, 50, 10};
		int money = sc.nextInt();
		int i = 0;
		int sum = 0;
		while(i<arr.length) {
			sum =  money / arr[i];
			System.out.println(arr[i] + "원:" + sum );
			money = money - sum * arr[i];
			i++;
			
		}
	}

}

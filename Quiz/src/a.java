import java.util.Arrays;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		int ran = 2*n - 1;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= ran; j++) {
				if(i==n-1) {
					System.out.print(num);
					num++;
					if(num>9) {
						num = 0;
					}
				}else {
					if((int)Math.abs(n-j) == i) {
						System.out.print(num);
						num++;
						if(num>9) {
							num = 0;
						}
					}else {
						System.out.print(" ");

					}
				}
			}
			System.out.println();
		}
	}
}





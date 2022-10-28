import java.util.Scanner;

public class PatternMake {
	static int num;
	public static void num() {
		System.out.print(num);
		num++;
		if(num>9) {
			num = 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ran = 2*n - 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= ran; j++) {
				if(i==n-1) {
					num();
				}else {
					if((int)Math.abs(n-j) == i) {
						num();
					}else {
						System.out.print(" ");

					}
				}
			}
			System.out.println();
		}
	}

}

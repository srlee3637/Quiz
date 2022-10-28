import java.util.Arrays;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		int n = 15; 
		int answer = 0;
		int j = 1;
		while(j <= n){
			int sum = 0;
			int i = j;
			while(sum <= n){
				sum+=i;
				i++;
				if(sum == n){
					answer++;
				}
			}
			j++;
		}
		System.out.println(answer);

	}
}





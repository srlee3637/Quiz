package quiz01;
import java.util.*;
public class Quiz09 {

	public static void main(String[] args) {
		/*
		 * 두 수 입력 받는다
		 * 두 수 사이의 합 구한다
		 * 10 13 -> 10 11 12 13
		 * 13 10 -> 10 11 12 13
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("두수를 입력하세요>");
		int a = s.nextInt();
		int b = s.nextInt();
		int sum = 0;
		
		int max = a > b ? a : b ; //항상 큰수
		int min = a > b ? b : a ;
		
		while(min <= max) {
			sum+=min;
			min++;
		}
		
		System.out.println("두 수 사이의 합:" + sum);
	}
}
		
//		if(a==b){
//			sum = a;
//		}
//		else if(a<b) {
//			c=b;
//			while(a!=b){
//				sum += a;
//				a++;
//			}
//			sum = sum+c;
//		}	
//
//		else {
//			c=a;
//			while(a!=b){
//				sum += b;
//				b++;
//			}
//			sum = sum + c;
//
//		}
//		System.out.println("두 수 사이의 합:" + sum);
//		
//		
//		c = Math.abs(a-b);
//		while(i<c+1) {
//		if(a<b){
//				sum+=a;
//				a++;
//			}else {
//				sum+=b;
//				b++;
//			}
//			i++;
//		}
//		System.out.println("두 수 사이의 합:" + sum);
//		
//		
//		if(a==b) {
//			sum = a;
//		}else {sum =(int) ((a+b) * (double)((Math.abs(a-b)+1)/2));
//		}
//		System.out.println("두 수 사이의 합:" + sum);
//	}
//	





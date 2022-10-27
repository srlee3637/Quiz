package quiz01;
import java.util.*;
public class Quiz08 {

	public static void main(String[] args) {
		
		/*
		 * 1~100까지 정수 중에 3의 배수이거나, 4의 배수일 경우 가로로 출력
		 * 1~200까지 정수 중에서 6의 배수의 합계
		 * 1~100까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 개수
		 * 1000의 약수의 개수(나누어 떨어지는 수)
		 */
		int a = Solution();
		//System.out.println(a);
		int b= Solution2();
		//System.out.println(a);
		int c= Solution3();
		//System.out.println(a);
		int d= Solution4();
		//System.out.println(a);
		
	}
	
	public static int Solution(){
		int i =1;
		while(i<=100) {
			if(i % 3 == 0 ||i % 4 == 0){
				System.out.print(i + " ");
			}
			i++;
		}
		return 0;
		
	}
	
	public static int Solution2(){
		int i =1;
		int sum = 0;
		while(i<=200) {
			if(i % 3 == 0 && i % 2 == 0){
				sum +=i;
				
			}
			i++;
			
		}
		
		return sum;
		
	}
	
	public static int Solution3(){
		int i =1;
		int count = 0;
		while(i<=100) {
			if(i % 4 == 0 && !(i % 8 == 0)){
				 count++;
				
			}
			i++;
			
		}
		
		return count;
		
	}
	
	public static int Solution4(){
		int i =1;
		int count = 0;
		while(i<=1000) {
			if(1000%i ==0){
				 count++;
				
			}
			i++;
			
		}
		
		return count;
		
	}
}

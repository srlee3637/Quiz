package quiz01;
import java.util.Scanner;
public class Quiz03 {

	public static void main(String[] args) {
		//정수를 하나 입력 받는다.
		//이 정수가 짝수인지, 홀수인지 if문 통해서 출력
		Scanner s = new Scanner(System.in);
		System.out.print("아무 정수나 입력하시오>");
		int a = s.nextInt();
		
		s.close();
	
		if(a%2==1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
	}
}

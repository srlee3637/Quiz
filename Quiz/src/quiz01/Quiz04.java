package quiz01;
import java.util.*;
public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수를 하나 입력 받는다.
		 * 입력 받은 값이 -인지, 홀수인지, 짝수인지, 음수인지 구별하는 else if문
		 */
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("정수를 입력하세요" + "\n>");
			int a = s.nextInt();

			if(a<0){
				System.out.printf("%d은 음수입니다\n",a);
			} else if(a==0){
				System.out.print("0입니다\n");
			} else if(a%2==0) {
				System.out.printf("%d은 짝수입니다\n",a);
			} else {
				System.out.printf("%d은 홀수입니다\n",a);
			}
		}
	}


}

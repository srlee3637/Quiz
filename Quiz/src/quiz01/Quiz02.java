package quiz01;
import java.util.Scanner;
public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키가 140이상이고, 나이가 8세 이상이라면 탑승가능, 아니라면 탑승 불가능
		Scanner s = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키(실수)>");
		double h =s.nextDouble();
		System.out.print("나이(정수)>");
		int a = s.nextInt();
		
		s.close();
		
		if(h>=140.0 && a>=8 ){
			System.out.println("놀이기기구 탑승이 가능합니다.");
		}
		else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
		
		
		
	}

}

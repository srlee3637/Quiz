package quiz01;
import java.util.*;
public class Quiz20 {

	public static void main(String[] args) {
		
		/*
		 *  첫번째 입력받은 값을 한글자씩 나누어서 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		String d = scan.next();
		String[] e = d.split("");
		char [] f = d.toCharArray();
		
		for(int i = 0; i < d.length(); i++) {
			System.out.print(d.charAt(i) +" ");
			
		}
		System.out.println();
		for(int i = 0; i < d.length(); i++) {
			System.out.print(e[i] +" ");
			
		}
		System.out.println();
		for(int i = 0; i < d.length(); i++) {
			System.out.print(f[i] +" ");
			
		}
		
      
		System.out.println();
		System.out.println("------------------------------------------");
		
		/*
		 * 두 문자열을 입력 받는다
		 * 첫 입력에 알파벳이 주어진다
		 * 두번째 입력에는 알파벳으로 만들어진 문자열이 주어진다
		 * -> B
		 * -> SDFSDGBBBSDWSAEWG
		 * 
		 * 첫번째 입력된 알파벳이 두번째 입력에 몇개 포함되어 있는지 출력
		 */
		
		
		String a = scan.next();
		String b = scan.next();
		String[] c =b.split("");
		int count = 0;
		
		for(int i = 0; i < b.length(); i++) {
			if(c[i].equals(a)) {
				
				count++;
				
			}
		}
		
		System.out.println(count);
		scan.close();
	}

}

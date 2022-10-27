import java.util.Arrays;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		String[] s = S.split("");
		Arrays.sort(s);
		String ans = "";
		for(int i = 0; i < 9; i++) {
			String i1 = "" + i;
			
			if(!i1.equals(s[i])) {
				ans = i1;
				break;
			}
		}
		
		if(ans.equals("")) {
			ans = "9";
		}
		
		System.out.println(ans);
		

	}

	

}





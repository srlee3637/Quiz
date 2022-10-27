package quiz01;
import java.util.Arrays;

public class Quiz23 {

	public static void main(String[] args) {
		char[] c = {'a', 'b', 'c'};
		int[] a = {1, 2, 3, 4, 5};
		String str1 = "abcdef";
		String str2 = "ghijkl";
		
		String str = method6(c);
		System.out.println(str);
		
		int sum = method7(a);
		System.out.println(sum);
		
		String[] str3 = method8(str1,str2);
		System.out.println(Arrays.toString(str3));
		
		
	}
	
	//char 배열의 요소를 문자열로 모두 붙여서 리턴
	static String method6(char[] c) {
		
		String str = "";
		
		for(int i = 0; i < c.length; i++) {
			str += c[i];
		}
		
		return str;
	}
	
	//배열의 요소의 합을 리턴
	static int method7(int[] arr) {
		
		int sum = 0;
		
		for(int a : arr) {
			
			sum += a;
		}
		
		return sum;
	}
	
	//매개 변수를 배열에 저장하여 배열 리턴
	static String[] method8(String str1, String str2) {
		
		String[] str =  {str1, str2};
		
		return str;
	}
	
	

}

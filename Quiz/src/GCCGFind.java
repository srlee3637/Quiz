import java.util.Scanner;
public class GCCGFind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String msg = "GCCGABCGCCGCCGBACGCCGCA";
		for(int i = 0; i < msg.length(); i++) {
			if(msg.charAt(i) == 'G') {
				int j = i;
				int k = i+4;
				String s = ""; 
				
				while(j < k && k < msg.length()) {
					s += msg.charAt(j);
					j++;
					if(s.equals("GCCG")) {
						System.out.print(i + " ");
						i = i+3;
					}else {
						continue;
					}

				}
			}
		}
	}
}


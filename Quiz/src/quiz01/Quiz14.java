package quiz01;
import java.util.*;

public class Quiz14 {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			System.out.println("구구단:" + i + "단");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println("--------------------");
		}
	}

}


package quiz01;
import java.util.*;
import java.io.*;
public class Quiz15 {



	/*
	 * 힌트 출력은 가로 or 세로로만 가능하다
	 * 정렬은 \t  -> 8칸 띄어쓰기
	 */

	public static void main(String[] args) {
		for(int i = 1; i < 10; i+=3) {

			for(int j = 1; j < 10; j++) {
				System.out.print((i) + " x " + j + " = " + i * j +"\t");
				System.out.print((i+1) + " x " + j + " = " + (i+1) * j +"\t");
				System.out.print((i+2) + " x " + j + " = " +  (i+2) * j +"\t");
				System.out.println();
			}
			System.out.println();
		}
	
		

	}





}

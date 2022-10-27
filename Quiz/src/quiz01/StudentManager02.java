package quiz01;
import java.util.Scanner;

public class StudentManager02 {
		
	public static void main(String[] args) {
		/*
		index를 이동해서 회원정보를 출력하는 프로그램 입니다.
		index의 시작은 -1에서 시작하고
		입력이 될떄마다 count를 증가시켜주면 됩니다.
		*/
		Scanner scan = new Scanner(System.in);
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];
		
		//현재 고객수가 몇명이 저장 되었는지 알기 위한 변수 count선언
		int count = 0;
		//index를 조정할 변수 선언
		int index = -1;
	
		x:while(true) {
			
			System.out.println("[Info]-고객수:" + count + ", 현재위치:" + index);
			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴입력>");
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("==========고객정보 입력을 시작합니다==========");
				/*
				이름, 성별, 나이 를 입력받아서 각각 배열에 저장
				사람 수를 증가 시킨다.
				*/
				System.out.print("이름>");
				nameList[count] = scan.next();
				System.out.print("성별>");
				genderList[count] = scan.next();
				System.out.print("나이>");
				ageList[count] = scan.nextInt();
				count++;
				
				System.out.println("=======================================");
				
				break;
			case 2:
				System.out.println("==========이전 고객정보를 출력합니다==========");
				/*
				 * index가 0이하라면 "이전 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 이전고객 정보를 출력하면 됩니다.
				 */
				if(index <= 0) {
					System.out.println("이전 고객정보가 없습니다");
				} else {
					index--;
					System.out.print("다음정보(이름)>" + nameList[index] + "\n");
					System.out.print("다음정보(성별)>" + genderList[index] + "\n");
					System.out.print("다음정보(나이)>" + ageList[index] + "\n");
				}
				
				
				System.out.println("=======================================");
				
				break;
			case 3:
				System.out.println("=========다음 고객정보를 출력합니다===========");
				/* index를 다음으로 이동하고 다음고객정보를 출력합니다.
				 * 다음 고객정보를 출력할 수 없는 조건을 생각해서 "다음 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 다음고객 정보를 출력하면 됩니다.
				 */
				
				if(index >= count - 1) { //count 2일때, 인덱스는 0에 있어야 다음이 있다
					System.out.println("다음 정보가 없습니다");
				} else {
					index++;
					System.out.print("다음정보(이름)>" + nameList[index] + "\n");
					System.out.print("다음정보(성별)>" + genderList[index] + "\n");
					System.out.print("다음정보(나이)>" + ageList[index] + "\n");
					
				}
				
				
				System.out.println("=======================================");
								
				break;
			case 4:
				System.out.println("=========현재 고객정보를 출력합니다===========");
				/* 현재 index의 위치의 고객정보를 출력합니다.
				 * 현재정보를 출력할수 있는 조건을 생각해서 현재 정보를 출력하면 됩니다.
				 * 그렇지 않으면 "현재 고객정보가 없습니다" 를 출력하면 됩니다
				 * 
				 */
				if(index >= 0 && index < count) { 
					System.out.print("현재정보(이름)>" + nameList[index] + "\n");
					System.out.print("현재정보(성별)>" + genderList[index] + "\n");
					System.out.print("현재정보(나이)>" + ageList[index] + "\n");
				} else {
					System.out.println("현재정보가 없습니다");
				}
				
				System.out.println("=======================================");

				
				break;
			case 5:
				System.out.println("=========현재 고객정보를 수정합니다============");
				/* 현재 index의 위치의 고객정보를 수정합니다.
				 * 현재정보를 출력할수 있는 조건을 생각해서 
				 * 스캐너를 통해서 순서대로 이름, 성별, 나이를 입력받아서 배열의 값을 수정하세요. 
				 * 
				 * 그렇지 않으면 "수정할 데이터가 없습니다" 를 출력하면 됩니다
				 */
				if(index >= 0 && index < count) { 
					System.out.print("현재정보("+ nameList[index] +")>");
					nameList[index] = scan.next();
					System.out.print("현재정보("+  genderList[index] +")>");
					genderList[index] = scan.next();
					System.out.print("현재정보("+ ageList[index] +")>");
					ageList[index] = scan.nextInt();
					
				} else {
					System.out.println("현재위치에 수정할 정보가 없습니다");
				}
				System.out.println("=======================================");
				
				break;
			case 6:
				System.out.println("=========현재 고객정보를 삭제합니다============");
				/* 현재 index의 위치의 고객정보를 삭제합니다.
				 * 현재정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index부터 ~~뒤에 있는 배열요소를 당겨와서 덮어 씌웁니다.
				 * 고객수 를 감소시킵니다.
				 * 
				 * 그렇지 않으면 "삭제할 데이터가 존재하지 않습니다" 를 출력하면 됩니다
				 * 
				 */
				if(index >= 0 && index < count) { 
					for(int i = index; i < count - 1; i++) {
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1];
						ageList[i] = ageList[i+1];
					}
					count--; //사람수 감소
				} else {
					System.out.println("현재 위치에 삭제할 정보가 없습니다");
				}
				break;
				
			case 7:
				System.out.println("프로그램을 종료합니다");
				/* 
				 * 무한루프를 완전히 탈출 
				 */
				scan.close();
				break x; //while문 탈출
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");
				
				break;
			}
		
		}
	}



}

package quiz02;

public class MainClass {
	
	public static void main(String[] args) {
		/*
		 * Person클래스를 파일로 정의
		 * 
		 * 멤버변수는 int age, String name
		 * 메서드 info() : String - 멤버변수를 문자열로 더해서 반환 
		 * 
		 * 메인에서는 Person 객체를 2개 생성해서 각각 확인
		 */
		
		Person per1 = new Person();
		per1.age =  1;
		per1.name = "사람1";
		System.out.println(per1.info());
		
		Person per2 = new Person();
		per2.age =  2;
		per2.name = "사람2";
		System.out.println(per2.info());
	
		Person per3 = new Person(3, "사람3");
		System.out.println(per3.info());
		
		///////////////////////////////
		//멤버변수, 메서드 , 생성자를 사용해서
		//현실에 찾아볼 수 있는 물건 생각해서 표현
		//생성해서 사용
		System.out.println();
		Coffee cof = new Coffee();
		Coffee cof1 = new Coffee("카페 라떼" , 4000, 5);
		Coffee cof2 = new Coffee("아이스 아메리카노" , 3000, 3);
		Coffee cof3 = new Coffee("아이스 초코" , 4500, 2);
		cof1.count();
		System.out.println(cof1.priceSum() + "원 입니다");
		cof2.count();
		System.out.println(cof2.priceSum() + "원 입니다");
		cof3.count();
		System.out.println(cof3.priceSum() + "원 입니다");
		
		System.out.println("총 가격은 " + add(cof3.sum, add(cof1.sum, cof2.sum))
		+ "원 입니다");
		
		
		
		
	}
	static int total = 0;
	static int add(int a , int b) {
		
		total = a + b;
		
		return total;
	}

}

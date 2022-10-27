package quiz02;

public class Person {
	int age;
	String name;
	
	
	//프로그래머가 생성자를 인위적으로 생성하면, 기본 생성자를 자동 생성 하지 않는다. 
	//생성자를 만들면 꼭 기본 생성자도 만들어줘야한다.
	//name, age를 매개 변수로 받는 생성자(초기화)
	
	Person(){	
	}
	
	Person(int ageI, String nameI) {
		age = ageI;
		name = nameI;
	}
	
	String info() {
		
		String ans ="나이:" + age + " 이름:" + name;
		
		return ans;
	}
}

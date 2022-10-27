package quiz10;
import java.util.*;
public class User {
	
	Scanner scan = new Scanner(System.in);
	
	
	private String name;
	private int age;
	private int rrn;
	
	public User() {
	}

	public User(String name, int age, int rrn) {
		super();
		this.name = name;
		this.age = age;
		this.rrn = rrn;
	}
	
	void info() {
		System.out.println("이름: " + name  + " 나이: " + age + " rrn: " + rrn );
	}

	public String getName() {
		name = scan.next();
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		age = scan.nextInt();
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRrn() {
		rrn = scan.nextInt();
		return rrn;
	}

	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	
	
}

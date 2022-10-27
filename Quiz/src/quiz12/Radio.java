package quiz12;

public class Radio extends Product {

	//Radio의 생성자는 기본생성자로 만들고, super를 통해서 가격 500원, 이름은 radio로 저장
	//get, set메서드는 자동으로 상속됩니다
	
	Radio(){
		super(500, "radio");
	}
	
	
}

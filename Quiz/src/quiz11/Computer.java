package quiz11;

public class Computer {
	
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	KeyBoard keyboard;
	Mouse mouse;
	Monitor monitor;
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	Computer(){
		keyboard = new KeyBoard();
		mouse = new Mouse();
		monitor = new Monitor();
	}
	

	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	public Computer(KeyBoard keyboard, Monitor monitor, Mouse mouse) {
		this.keyboard = keyboard;
		this.monitor = monitor;
		this.mouse = mouse;
	}
	
	
	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		keyboard.info(); 
		mouse.info();  
		monitor.info();
	}
	
	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(KeyBoard keyboard) {
		this.keyboard = keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}	
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}

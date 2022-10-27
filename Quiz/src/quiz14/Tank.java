package quiz14;

public class Tank extends Unit {

	
	static int mode;
	public Tank() {
		super(100);
	}
	
	void location() {
		System.out.println("Tank 현재 위치: ( " + x + " , " + y + " )"  );

	}
	void move(int x, int y) {
		System.out.println("Tank 좌표로 이동합니다.");

		this.x = x;
		this.y = y;
	}
	void stop(){
		System.out.println("Tank Stop");
	}
	void changeMode() {
		if(mode == 0) {
			System.out.println("시저모드로 변경합니다.");
			mode = 1;
		}else {
			System.out.println("일반모드로 변경합니다.");
			mode = 0;
		}
	}
}

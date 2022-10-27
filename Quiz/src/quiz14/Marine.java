package quiz14;

public class Marine extends Unit {
	
	public static int attack = 6;
	public static int armor = 0;
	
	public Marine() {
		super(40);
	}
	void location() {
		System.out.println("Marine 현재 위치: ( " + x + " , " + y + " )"  );
	}
	void move(int x, int y) {
		System.out.println("Marine 좌표로 이동합니다.");
		this.x = x;
		this.y = y;
	}
	void stop(){
		System.out.println("Marine Stop");
	}
}

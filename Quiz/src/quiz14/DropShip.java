package quiz14;

public class DropShip extends Unit {
	
	static Unit[] unit = new Unit[8];
	int i = 0;
	int countT;
	int countM;
	public DropShip() {
		super(150);
	}
	
	
	void location() {
		System.out.println("Dropship 현재 위치: ( " + x + " , " + y + " )"  );
	}
	void move(int x, int y) {
		System.out.println("DropShip 좌표로 이동합니다.");

		this.x = x;
		this.y = y;
	}
	void stop(){
		System.out.println("DropShip Stop");
	}
	public void pick(Unit u) {
		if(i < 8) {
			if(u instanceof Tank){
				unit[i] = u;
				i+=4;
				countT++;
				System.out.println("탱크 " + countT+" 대 탑승완료");
				System.out.println("마린 " + countM+" 명 탑승완료");
				System.out.println();
			}else if(u instanceof Marine) {
				unit[i] = u;
				i++;
				countM++;
				System.out.println("탱크 " + countT+" 대 탑승완료");
				System.out.println("마린 " + countM+" 명 탑승완료");
				System.out.println();
			}
		}else {
			System.err.println("드랍쉽 공간 없음");
			System.out.println();
		}
		
	}
}

package quiz14;

public abstract class Unit {
	
	
	int x = 0;
	int y = 0;
	int hp;
	public Unit(int hp) {
		this.hp = hp;
	}
	abstract void location();
	abstract void move(int x, int y); 
	abstract void stop();
}

package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		com.computerInfo();
		
		Monitor mon = com.getMonitor();
		mon.info();
	}

}

package quiz16;

public class MainClass2 {

	public static void main(String[] args) {

		try {
			System.out.println(Calculator.input());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}

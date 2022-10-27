package quiz15;

public class BugsMusic implements SongList {
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */
	private String[] list = new String[100];
	public int i = 0;
	private int count = 0;
	@Override
	public void insertList(String song) {
		list[i] = song;
		i++;
	}
	@Override
	public void playList() {
		int a = (int)(Math.random()* i);
		System.out.println(list[a]);
		System.out.println("곡 목록 출력");
		for(int j = 0; j < list.length; j++ ) {
			System.out.println(list[j]);
			if(list[j]==(null)) {
				break;
			}
		}
		
	}
	@Override
	public int playLength() {
		count = i;
		return count;
	}
	
	
}

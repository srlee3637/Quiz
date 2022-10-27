import java.util.*;
public class Main{
	public static int src[][] ; 
	public static boolean checked[];; 
	public static int n;
	public static int m;
	public static int v;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();


		src = new int[1001][1001]; 
		checked = new boolean[1001]; 

		if(m == 0) {
			System.out.println(1);
		}
		else {
			for(int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				src[a][b] = src[b][a] = 1;
			}

			bfs();
		}

	}





	public static void bfs() {

		int count = 0;
		for(int i = 0; i <= n; i++) {
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(i); 
			checked[i] = true;
			int count1 = 0;

			while(!q.isEmpty()) {

				int ans = q.poll();
				for(int j = 1; j <= n; j++) {
					if(src[ans][j] == 1 && checked[j] == false) {
						q.add(j);
						checked[j] = true;
						count1++;

					}

				}

			}
			if(count1 != 0) {

				count++;
			}
		}

		System.out.println(count);
	}


}

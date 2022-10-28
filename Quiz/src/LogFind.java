import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
/*
 * 1) Traffic의 합
 * 2) IP별 접속 횟수
 * 3) IP별 트래픽의 합 
 */
public class LogFind {

	public static void main(String[] args) {
		int i = 0;
		long totalTraffic = 0L;
		try {
			BufferedReader br = new BufferedReader(new FileReader("log.txt"));
			Map<String, Object> map = new TreeMap<>();
			Map<String, Object> map1 = new TreeMap<>();
			while(true) {
				
				String line = br.readLine();
		
				if(line == null) {
					break;
				}
				
				
				String[] ar = line.split(" ");
				long traffic = ar[ar.length-1].equals("-")||ar[ar.length-1].equals("\"-\"")? 
						0 : Long.parseLong(ar[ar.length-1]);
				totalTraffic += traffic;
				String key = ar[0];
				//2번 문제
				long val = map.containsKey(key) ? (long) map.get(key) : 0;
				map.put(key, ++val);
				//3번 문제
				long sum = ar[ar.length-1].equals("-")||ar[ar.length-1].equals("\"-\"") ? 
						0 : Long.parseLong(ar[ar.length-1]);
				long val1 = map1.containsKey(key) ? (long) map1.get(key) + sum : 0;
				map1.put(key, val1);
				i++;
			}
			System.out.println(totalTraffic);
			System.out.println(map);//2번
			System.out.println(map1);//3번
			br.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}

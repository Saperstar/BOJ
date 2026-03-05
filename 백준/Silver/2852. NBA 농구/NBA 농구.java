import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Integer, Integer> map = new HashMap<>();		//각 팀별 점수
		
		int N = Integer.parseInt(br.readLine());
		String[][] info = new String[N + 1][2];
		info[N][0] = "48:00";
		info[N][1] = "48:00";
		int[] score = new int[2];
		int[] wintime = new int[2];
		for(int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			info[i][0] = line[0];
			info[i][1] = line[1];
		}
		for(int i = 0; i < N; i++) {
			map.put(Integer.parseInt(info[i][0]), map.getOrDefault(Integer.parseInt(info[i][0]), 0) + 1);
			if(map.getOrDefault(1, 0) > map.getOrDefault(2, 0)) {
				wintime[0] += timedif(info[i][1], info[i+1][1]);
			} else if(map.getOrDefault(1, 0) < map.getOrDefault(2, 0)) {
				wintime[1] += timedif(info[i][1], info[i+1][1]);
			}
		}
		int min1, sec1, min2, sec2;
		min1 = wintime[0]/60;
		sec1 = wintime[0]%60;
		min2 = wintime[1]/60;
		sec2 = wintime[1]%60;
		String smin1, smin2, ssec1, ssec2;
		if(min1 < 10) smin1 = "0" + min1;
		else smin1 = "" + min1;
		if(min2 < 10) smin2 = "0" + min2;
		else smin2 = "" + min2;
		if(sec1 < 10) ssec1 = "0" + sec1;
		else ssec1 = "" + sec1;
		if(sec2 < 10) ssec2 = "0" + sec2;
		else ssec2 = "" + sec2;
		bw.write(smin1 + ":" + ssec1 + "\n" + smin2 + ":" + ssec2);
		bw.flush();
		
		
		

	}
	public static int timedif(String T1, String T2) {
		int h1, h2, m1, m2;
		int ans;
		int time1 = 0, time2 = 0;
		String[] times = T1.split(":");
		h1 = Integer.parseInt(times[0]);
		m1 = Integer.parseInt(times[1]);
		times = T2.split(":");
		h2 = Integer.parseInt(times[0]);
		m2 = Integer.parseInt(times[1]);
		time1 = 60 * h1 + m1;
		time2 = 60 * h2 + m2;
		ans = time2 - time1;
		return ans;
		
		
		
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line;
		int ans;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			ans = 0;
			Deque<int[]> dq = new ArrayDeque<>(); 
			line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int M = Integer.parseInt(line[1]);
			line = br.readLine().split(" ");
			for(int k = 0; k < N; k++) {
				int num = Integer.parseInt(line[k]);
				int isTarget = (k == M) ? 1 : 0;
				dq.offer(new int[] {num, isTarget});
			}
			while(true) {
				int[] front = dq.peek();
					if(dq.stream().anyMatch(n -> n[0] > front[0]) && front[1] != 1) {
						dq.offer(dq.poll());
					} else if(dq.stream().anyMatch(n -> n[0] <= front[0] && front[1] != 1)){
						dq.poll();
						ans++;
					}
					else if(dq.stream().anyMatch(n -> n[0] > front[0]) && front[1] == 1) {
						dq.offer(dq.poll());
					} else if(dq.stream().anyMatch(n -> n[0] <= front[0]) && front[1] == 1) {
						ans++;
						bw.write(ans + "\n");
						break;
					}
			}
		}
		bw.flush();
			
		
		

	}

}

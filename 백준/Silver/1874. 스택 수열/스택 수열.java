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
		StringBuilder sb = new StringBuilder();
		Deque<Integer> dq = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		int now = 1, ans = 0;
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		while(ans < N) {
			if(now <= nums[ans]) {
				dq.push(now);
				now++;
				sb.append("+\n");
			} else if(dq.peek() == nums[ans]) {
				dq.pop();
				ans++;
				sb.append("-\n");
			}
			else {
			bw.write("NO");
			break;
			}
			if(ans == N){
				bw.write(sb.toString());
				break;
			}
			
		}
		bw.flush();
			

	}

}

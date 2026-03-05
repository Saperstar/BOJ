import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] lines = br.readLine().split(" ");
		int K = Integer.parseInt(lines[0]);
		int N = Integer.parseInt(lines[1]);
		int[] lans = new int[K];
		long min = 1, max = 1, mid = 1, ans = 0;
		long tem;
		for(int i = 0; i < K; i++) {
			lans[i] = Integer.parseInt(br.readLine());
			if(max < lans[i]) max = lans[i];
		}
		while(min <= max) {
			mid = (max + min) / 2; 
			tem = 0;
			for(int k = 0; k < K; k++) {
				tem += lans[k] / mid;
			}
			if(tem >= N) {
				ans = mid;
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		bw.write(ans + "");
		bw.flush();
		

	}

}


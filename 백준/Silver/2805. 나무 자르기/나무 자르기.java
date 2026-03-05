import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		line = br.readLine().split(" ");
		int[] tree = new int[N];
		int l = 0;
		for(String k : line) {
			tree[l] = Integer.parseInt(k);
			l++;
		}
		Arrays.sort(tree);
		int min = 0;
		int mid = tree[0];
		int max = tree[N-1];
		long sum = 0;
		int caled;
		int ans = 0;
		
		for(int i = 0; i < 32; i++) {
			for(int k = 0; k < N; k++) {
				caled = tree[k] - mid;
				if(caled > 0) {
					sum += caled;
				}
			}
			if(sum >= M) {
				ans = mid;
				min = mid + 1;
				mid = (min + max) / 2;
			} else {
				max = mid - 1;
				mid = (min + max) / 2;
			}
			sum = 0;
			
		}
		bw.write(ans + "");
		
		bw.flush();
		
		
		

	}

}

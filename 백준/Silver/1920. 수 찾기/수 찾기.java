import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		String line = br.readLine();
		String[] lines = line.split(" ");
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(lines[i]);
		}
		HashSet<Integer> set = new HashSet<>();
		for(int num : A) {
			set.add(num);
		}
		
		int M = Integer.parseInt(br.readLine());
		line = br.readLine();
		lines = line.split(" ");
		int[] nums = new int[M];
		for(int i = 0; i < M; i++) {
			nums[i] = Integer.parseInt(lines[i]);
		}
		for(int x : nums) {
			if(set.contains(x)) bw.write(1 + "\n");
			else 				bw.write(0 + "\n");
		}
		
		bw.flush();

	}

}
	

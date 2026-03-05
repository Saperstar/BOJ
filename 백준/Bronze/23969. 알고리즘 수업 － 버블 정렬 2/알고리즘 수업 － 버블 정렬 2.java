import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int[] nums = new int[N]; 
		int K = Integer.parseInt(lines[1]);
		line = br.readLine();
		lines = line.split(" ");
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(lines[i]);
		}
		int i = 0;
		int ifLooping = 0;
		int changed = 0;
		while(true) {
			if(nums[i] > nums[i+1]) {
				swap(nums, i, i+1);
				changed++;
			}
			
			if(changed == K) break;
			
			if(i == N-2) i = 0;
			else i++;
			ifLooping++;
			if(ifLooping >= 100000000) {
				System.out.println("-1");
				return;
			}
		}
		for(int ans : nums) {
			bw.write(ans + " ");
		}
		bw.flush();
		
		
	}
	
	public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}


}


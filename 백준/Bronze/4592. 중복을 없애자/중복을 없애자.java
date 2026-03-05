import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] line = br.readLine().split(" ");
			int[] nums = new int[line.length];
			for(int i = 0; i < line.length; i++) {
				nums[i] = Integer.parseInt(line[i]);
			}
			if(nums[0] == 0 && line.length == 1) break;
			
			for(int i = 1; i < nums[0] + 1; i++) {
				if(i == 1) bw.write(nums[i] + " ");
				else {
					if(nums[i-1] != nums[i]) bw.write(nums[i] + " ");
				}
			}
			bw.write("$\n");
		}
		
		
		
		bw.flush();
	}

}
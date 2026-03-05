import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int sum = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String line = br.readLine();
			String[] nums = line.split(" ");
			int a = Integer.valueOf(nums[0]);
			int b = Integer.valueOf(nums[1]);
			int sum = a + b;
			bw.write(sum + "\n");
			if(a == 0 && b == 0) break;
			
			bw.flush();
		}
		
		

	}
	

}

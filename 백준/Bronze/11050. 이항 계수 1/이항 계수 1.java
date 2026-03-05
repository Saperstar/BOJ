import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static int sum = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		String[] nums = line.split(" ");
		int sum = 0;
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		sum = fac(a) / (fac(b) * fac(a - b));
		
		bw.write(sum + "\n");
		
		bw.flush();
		

	}
	
	public static int fac(int k) {
		if(k == 0) return 1;
		int hap = 1;
		for(int i = 1; i <= k; i++) {
			hap *= i;
		}
		return hap;
	}

}

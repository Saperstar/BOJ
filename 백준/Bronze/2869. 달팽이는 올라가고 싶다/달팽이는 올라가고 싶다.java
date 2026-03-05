import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int sum = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] nums = line.split(" ");
		int A = Integer.valueOf(nums[0]);
		int B = Integer.valueOf(nums[1]);
		int V = Integer.valueOf(nums[2]);
		int day = 1 + (V - A) / (A - B);
		int height = A + (day - 1) * (A - B);
		if(height < V) day++; 
		
		System.out.println(day);
		

	}

}

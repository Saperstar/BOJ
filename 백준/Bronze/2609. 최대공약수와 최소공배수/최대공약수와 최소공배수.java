import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" "); 
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int ans1 = GCD(a,b);
		int ans2 = a * b / ans1;
		System.out.println(ans1);
		System.out.println(ans2);
		
	}
	
	public static int GCD(int j, int k) {
		if(j < k) {
			int X = k % j;
			if(X == 0) return j;
			else return GCD(X, j);
		}
		else if(j > k) {
			int X = j % k;
			if(X == 0) return k;
			else return GCD(X, k);
		}
		return j;
	}

}

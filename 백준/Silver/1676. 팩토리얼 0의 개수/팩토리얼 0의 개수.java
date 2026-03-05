import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		BigInteger fac = BigInteger.ONE;
		int ans = 0;
		for(int i = N; i > 0; i--) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		String num = String.valueOf(fac);
		int numLength = num.length();
		String[] nums = num.split("");
		for(int i = numLength - 1; i > 0; i--) {
			if(nums[i].equals("0")) ans++;
			else break;
		}
		bw.write(ans + "");
		bw.flush();
		

	}

}

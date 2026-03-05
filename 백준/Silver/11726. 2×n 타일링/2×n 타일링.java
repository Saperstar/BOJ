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
		
		BigInteger one = BigInteger.ONE;
		BigInteger[] fibo = new BigInteger[1000];
		fibo[0] = one;
		fibo[1] = one.add(one);
		for(int i = 2; i < 1000; i++) {
			fibo[i] = fibo[i-2].add(fibo[i-1]);
		}
		int n = Integer.parseInt(br.readLine());
		BigInteger slash = BigInteger.valueOf(10007);
		bw.write(fibo[n-1].mod(slash) + "");
		bw.flush();
		
		

	}

}

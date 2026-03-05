import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long k = 1;
		int N = Integer.parseInt(br.readLine());
		int lineNum = 0;
		String line = br.readLine();
		long ans = 1 + line.charAt(0) - 'a';
		for(int i = 1; i < N; i++) {
			lineNum = 1 + line.charAt(i) - 'a';
			ans += (lineNum * 31 * k);
			k = (k * 31) % 1234567891;
		}
		System.out.println(ans % 1234567891);
		
	}

}

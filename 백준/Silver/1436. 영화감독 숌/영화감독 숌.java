import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int combo6 = 0;
		int num = 665;
		int currentN = 0;
		int ans = 0;
		while(true) {
			num++;
			String stringNum = String.valueOf(num);
			for(int i = 0; i < stringNum.length(); i++) {
				if(i > 0 && stringNum.charAt(i) == '6' && stringNum.charAt(i) == (stringNum.charAt(i-1))) {
					combo6++;
				}
				else combo6 = 0;
				if(combo6 == 2) {
					currentN++;
					ans = num;
					break;
				}
			}
			if(currentN == N) break;
		}
		System.out.println(ans);
		
		

	}

}

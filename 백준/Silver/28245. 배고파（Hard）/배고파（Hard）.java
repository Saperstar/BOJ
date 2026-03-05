import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static int[] ans = new int[2];
	public static long[] dap = new long[3721];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Long.parseLong((br.readLine()));
		dapji();
		Arrays.sort(dap);
		for(int i = 0; i < n; i++) {
			ans = new int[2];
			boolean can = false;
			long m = Long.parseLong(br.readLine());
			long sibal = m, sibal2 = m;
			if(m < 2) {
				can = true;
			} else {
				can = isCan(m);
			}
			if(can == false) {
				long small = m;
				for(int j = 0; j < dap.length; j++) {
					if(small > Math.abs(dap[j] - m)) {
						small = Math.abs(dap[j] - m);
						sibal = dap[j];
					} else if(small == Math.abs(dap[j]) - m) {
						sibal2 = dap[j];
					}
					if(sibal != m && sibal2 != m) {
						sibal = (sibal > sibal2 ? sibal2 : sibal);
						j = dap.length;
					}
						
				}
				isCan(sibal);
			}
			bw.write(ans[0] + " " + ans[1] + "\n");
		}
		bw.flush();

	}
	
	public static boolean isCan(long num) {
		
		for(int i = 0; i < 60; i++) {
			for(int k = 0; k < 60; k++) {
				long sum = (1L << i) + (1L << k);
				if(sum == num && i <= k) {
					ans[0] = i;
					ans[1] = k;
					return true;
				}
				if((1L << k) > num) k = 60;
			}
			if((1L << i) > num) i = 60;
		}
		return false;
		
	}
	public static void dapji() {
		int j = 0;
		for(int i = 0; i < 61; i++) {
			for(int k = 0; k < 61; k++) {
				if(i <= k) {
					dap[j] = (1L << i) + (1L << k);
					j++;
				}
			}
		}
		
	}

}

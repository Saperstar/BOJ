import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] lines = new String[N];
		for(int i = 0; i < N; i++) lines[i] = br.readLine();
		Arrays.sort(lines, (x, y) -> {
			int result1 = x.length() - y.length();
			int result2 = 0, result3 = 0;;
			if(result1 == 0) {
				int xHap = -1, yHap = -1;
				for(int i = 0; i < x.length(); i++) if(Character.isDigit(x.charAt(i))) xHap += x.charAt(i)-'0';
				for(int i = 0; i < y.length(); i++) if(Character.isDigit(y.charAt(i))) yHap += y.charAt(i)-'0';
				result2 = xHap - yHap;
			}
			if(result2 == 0) result3 = x.compareTo(y);
			
			if(result1 != 0) return result1;
			else if(result2 != 0) return result2;
			else return result3;
		});
		
		for(String s : lines) bw.write(s + "\n");
		bw.flush();
		
		
		
	}
	
	

}

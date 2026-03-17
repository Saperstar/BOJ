import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int c = Integer.parseInt(line[1]) + 1;
		int r = Integer.parseInt(line[2]) + 1;
		
		//몇사분면인지 확인하는 코드 생성
		int[] whereMap = new int[N];
		int temN = N;
		int start = 2;
		for(int i = 0; i < N; i++) {
			whereMap[i] = where(temN, r, c);
			temN--;
			start = whereMap[i];
			switch(start) {
			case 1:
				r = r - (int)(Math.pow(2, temN));
				break;
			case 2:
				
				break;
			case 3:
				c = c - (int)(Math.pow(2, temN));
				break;
			case 4:
				r = r - (int)(Math.pow(2, temN));
				c = c - (int)(Math.pow(2, temN));
				break;
			}
		}
		//몇사분면에 속하는지 whereMap에 저장함
		int ans = 0;
		temN = N;
		for(int i : whereMap) {
			temN--;
			int powed = (int)(Math.pow(2, temN) * Math.pow(2, temN));
			switch(i) {
			case 1:
				ans += powed;
				break;
			case 2:
				
				break;
			case 3:
				ans += powed * 2;
				break;
			case 4:
				ans += powed * 3;
				break;
			}
		}
		bw.write(ans + "");
		bw.flush();
		
	}
	
	public static int where(int nn, int rr, int cc) {
		
		boolean is14 = false;
		boolean is34 = false;
		if(rr > (int)Math.pow(2, nn - 1)) is14 = true;
		if(cc > (int)Math.pow(2, nn - 1)) is34 = true;
		
		if(is14 && is34) return 4;
		if(!is14 && is34) return 3;
		if(is14 && !is34) return 1;
		if(!is14 && !is34) return 2;
		else return -1;
	}

}

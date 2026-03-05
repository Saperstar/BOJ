import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int[][] gaechu;
	public static int found = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int ans = 0;
			String[] line = br.readLine().split(" ");
			int M = Integer.parseInt(line[0]);
			int N = Integer.parseInt(line[1]);
			int K = Integer.parseInt(line[2]);
			gaechu = new int[M][N];
			int[][] xy = new int[K][2];
			for(int k = 0; k < K; k++) {
				line = br.readLine().split(" ");
				int X = Integer.parseInt(line[0]);
				int Y = Integer.parseInt(line[1]);
				gaechu[X][Y] = 1;
				xy[k][0] = X;
				xy[k][1] = Y;
			}
			
			for(int k = 0; k < K; k++) {
				if(gaechu[xy[k][0]][xy[k][1]] == 1) {
					find(xy[k][0] ,xy[k][1] , 0);
					ans++;
				}
			}
			bw.write(ans + "\n");
			
		}
		bw.flush();

	}
	
	public static void find(int a, int b, int dir) {			//dir은 default : 0; up : 1; left : 2;
																//right : 3; down : 4임
		gaechu[a][b] = 0;
		int tf = 2;
		try { tf = gaechu[a][b-1]; 
		if(tf == 1 && dir != 4) find(a, b-1, 1);
		if(tf == 0) {}
		} catch(Exception e	) {}
		
		try { tf = gaechu[a-1][b]; 
		if(tf == 1 && dir != 3) find(a-1, b, 2);
		if(tf == 0) {}
		} catch(Exception e	) {}
		
		try { tf = gaechu[a+1][b]; 
		if(tf == 1 && dir != 2) find(a+1, b, 3);
		if(tf == 0) {}
		} catch(Exception e	) {}
		
		try { tf = gaechu[a][b+1]; 
		if(tf == 1 && dir != 1) find(a, b+1, 4);
		if(tf == 0) {}
		} catch(Exception e	) {}
		
		
	}

}

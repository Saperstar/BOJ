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
		
		String[] lines = br.readLine().split(" ");
		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		int[][] map = new int[N][N];
		int[][] ansMap = new int[N][N];
		for(int i = 0; i < N; i++) {
			lines = br.readLine().split(" ");
			for(int k = 0; k < N; k++) {
				map[i][k] = Integer.parseInt(lines[k]);
			}
		}
		ansMap[0][0] = map[0][0];
		for(int i = 1; i < N; i++) ansMap[0][i] = ansMap[0][i-1] + map[0][i];
		for(int i = 1; i < N; i++) ansMap[i][0] = ansMap[i-1][0] + map[i][0];
		for(int i = 1; i < N; i++) {
			for(int k = 1; k < N; k++) {
				ansMap[i][k] = ansMap[i-1][k] + ansMap[i][k-1] - ansMap[i-1][k-1] + map[i][k];
			}
		}
		
		for(int i = 0; i < M; i++) {
			lines = br.readLine().split(" ");
			int x1 = Integer.parseInt(lines[0])-1;
			int y1 = Integer.parseInt(lines[1])-1;
			int x2 = Integer.parseInt(lines[2])-1;
			int y2 = Integer.parseInt(lines[3])-1;
			int ans = 0;
			if(x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0) ans = ansMap[0][0];
			else if(x1 == 0 && y1 == 0) ans = ansMap[x2][y2];
			else if(x1 == 0 && x2 == 0) ans = ansMap[0][y2] - ansMap[0][y1 - 1];
			else if(y1 == 0 && y2 == 0) ans = ansMap[x2][0] - ansMap[x1 - 1][0];
			else if(x1 == 0) ans = ansMap[x2][y2] - ansMap[x2][y1 - 1];
			else if(y1 == 0) ans = ansMap[x2][y2] - ansMap[x1 - 1][y2];
			else ans = ansMap[x2][y2] - ansMap[x1-1][y2] - ansMap[x2][y1-1] + ansMap[x1-1][y1-1];
			bw.write(ans + "\n");
			
		}

		
		bw.flush();
	}
	
	

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		String[] lines = line.split(" ");
		int ans1 = 0, ans2 = 0;
		int ans = Integer.MAX_VALUE;
		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		char[][] board = new char[N][M];
		for(int i = 0; i < N; i++) {
			line = br.readLine();
			for(int k = 0; k < M; k++) {
				board[i][k] = line.charAt(k); 
			}
			
		}
		for(int x = 0; x <= N - 8; x++) {
			for(int y = 0; y <= M - 8; y++) {
				ans1 = 0;
				ans2 = 0;
				for(int i = x; i < x + 8; i++) {
					boolean isiODD = (i % 2 != 0);
					for(int k = y; k < y + 8; k++) {
						boolean iskODD = (k % 2 != 0);
						
						//i가 홀수일 때
						if(isiODD) {
							//k가 홀수일 때
							if(iskODD) {
								if(board[i][k] == 'W') {
									ans1++;
								}
								else if(board[i][k] == 'B') {
									ans2++;
								}
							}
							//k가 짝수일 때
							else {
								if(board[i][k] == 'W') {
									ans2++;
								}
								else if(board[i][k] == 'B') {
									ans1++;
								}
								
							}
							
						}
						
						//i가 짝수일 때
						else {
							//k가 홀수일 때
							if(iskODD) {
								if(board[i][k] == 'W') {
									ans2++;
								}
								else if(board[i][k] == 'B') {
									ans1++;
								}
							}
							//k가 짝수일 때
							else {
								if(board[i][k] == 'W') {
									ans1++;
								}
								else if(board[i][k] == 'B') {
									ans2++;
								}
								
							}
							
						}
					}
				}
				ans = Math.min(ans, Math.min(ans1, ans2));

				
				
			}
		}
		
		
		
		
		
		bw.write(ans + "");
		bw.flush();

		

	}

}
	

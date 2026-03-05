/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int ans = 0;
		String[] line = br.readLine().split(" ");
		int K = Integer.parseInt(line[0]);
		int N = Integer.parseInt(line[1]);
		int[] Ns = new int[N];
		boolean[][] cal = new boolean[N][N];
		for(int i = 0; i < K; i++){
		    line = br.readLine().split(" ");
		    for(int k = 0; k < N; k++){
		        Ns[k] = Integer.parseInt(line[k]);
		    }
		    for(int k = 0; k < N-1; k++){
		        for(int j = k+1; j < N; j++){
		            cal[Ns[k] - 1][Ns[j] - 1] = true;
		        }
		    }
		}
		for(int i = 0; i < N; i++){
		    for(int k = 0; k < N; k++){
		        if(cal[i][k] == true && cal[k][i] == false) ans++;
		    }
		}
		bw.write(ans + "");
        
		bw.flush();
	}
}

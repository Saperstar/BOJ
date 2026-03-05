/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<Integer, Integer> playerGrade = new HashMap<>();
		
		int ans = 0;
		String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        int[] qGrade = new int[N];
        int[] num = new int[M];
        line = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            qGrade[i] = Integer.parseInt(line[i]);
        }
        
        for(int k = 0; k < M; k++){
            int grade = 0;
            line = br.readLine().split(" ");
            for(int i = 0; i < N; i++){
                if(line[i+1].equals("O")) grade += qGrade[i];
            }
            playerGrade.put(Integer.parseInt(line[0]), grade);
            num[k] = Integer.parseInt(line[0]);
        }
        Arrays.sort(num);
        int max = 0;
        for(int i = 0; i < M; i++){
            if(playerGrade.get(num[i]) > max) max = playerGrade.get(num[i]);
        }
        for(int i = M-1; i >= 0; i--){
            if(playerGrade.get(num[i]) == max) ans = num[i];
        }
        bw.write(ans + " " + max);
        
		bw.flush();
	}
}

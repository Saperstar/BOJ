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
		int N = Integer.parseInt(br.readLine());
		int hapA = 0;
		int hapB = 0;
        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split(" ");
            hapA += Integer.parseInt(line[0]);
            hapB += Integer.parseInt(line[1]);
            bw.write(hapA-hapB + "\n");
        }
        
		bw.flush();
	}
}

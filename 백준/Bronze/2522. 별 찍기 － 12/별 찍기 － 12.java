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
	    int a = N-1;
	    int b = 1;
		for(int i = 0; i < N; i++){
		    for(int k = 0; k < a; k++){
		        bw.write(" ");
		    }
		    for(int k = 0; k < b; k++){
		        bw.write("*");
		    }
		    a--;
		    b++;
		    bw.write("\n");
		}
		a = 1;
		b = N-1;
		for(int i = 0; i < N-1; i++){
		    for(int k = 0; k < a; k++){
		        bw.write(" ");
		    }
		    for(int k = 0; k < b; k++){
		        bw.write("*");
		    }
		    a++;
		    b--;
		    bw.write("\n");
		}
		bw.flush();
	}
}
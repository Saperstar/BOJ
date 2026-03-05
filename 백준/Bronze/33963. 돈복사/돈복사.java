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
		String N = br.readLine();
        int money = Integer.parseInt(N);
        int NLength = N.length();
        int max = 1;
        for(int i = 0; i < NLength; i++){
            max *= 10;
        }
        while(money < max){
            money *= 2;
            ans++;
        }
        bw.write(ans-1 + "");
        
		bw.flush();
	}
}

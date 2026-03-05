/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.NoSuchElementException;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int num[] = new int[N];
	    int ans = 0;
	    

	    for(int i=0; i<N; i++){
	        int x = sc.nextInt();
	        num[i] = x;
	    }
	    int v = sc.nextInt();
	    
	    for(int i=0; i<N; i++){
	        if(num[i] == v){
	            ans++;
	        }
	    }
	    System.out.println(ans);
		
    }
}

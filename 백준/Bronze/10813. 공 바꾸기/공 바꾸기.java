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
	    int M = sc.nextInt();
	    int num[] = new int[N];
	    int i2 = 0;
	    
	    for(int x=0; x<N; x++){
	        num[x] = x+1;
	    }

	    for(int x=0; x<M; x++){
	        int i = sc.nextInt();
	        int j = sc.nextInt();
	        i2 = num[i-1];
	        num[i-1] = num[j-1];
	        num[j-1] = i2;
	    }
	    for(int x=0; x<N; x++){
	        System.out.print(num[x]+" ");
	    }
	    
        
    }
}

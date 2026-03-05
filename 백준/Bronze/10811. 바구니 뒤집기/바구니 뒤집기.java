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
	    int numcopy[] = new int[N];
	    
	    for(int x=0; x<N; x++){
	        num[x] = x+1;
	    }
	    for(int x=0; x<N; x++){
	        numcopy[x] = num[x];
	    }
        
	    for(int x=0; x<M; x++){
	        int i = sc.nextInt();
	        int j = sc.nextInt();
	        float tlqkf = (j-i+1);
	        for(int y=0; y<tlqkf; y++){
	            num[i-1] = numcopy[j-1];
	            i++;
	            j--;
	        }
	        for(int y=0; y<N; y++){
	        numcopy[y] = num[y];
	        }
	    }
	    for(int x=0; x<N; x++){
	        System.out.print(num[x]+" ");
	    }
	    
        
    }
}

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
	    int min;
	    int max;
	    

	    for(int i=0; i<N; i++){
	        int inp = sc.nextInt();
	        num[i] = inp;
	    }
	    int Xmin = num[0];
	    int Xmax = num[0];
	    
	    for(int i=0; i<N; i++){
	        if(num[i] <= Xmin){
	            Xmin = num[i];
	        }
	        if(num[i] >= Xmax){
	            Xmax = num[i];
	        }
	    }
		System.out.println(Xmin+" "+Xmax);
    }
}

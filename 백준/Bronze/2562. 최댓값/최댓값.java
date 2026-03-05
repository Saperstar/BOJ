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
	    
	    int num[] = new int[9];
	    

	    for(int i=0; i<9; i++){
	        int inp = sc.nextInt();
	        num[i] = inp;
	    }
	    int Xmax = num[0];
	    int where = 0;
	    
	    for(int i=0; i<9; i++){
	        if(num[i] >= Xmax){
	            Xmax = num[i];
	            where = i;
	        }
	    }
		System.out.println(Xmax);
		System.out.println(where+1);
    }
}

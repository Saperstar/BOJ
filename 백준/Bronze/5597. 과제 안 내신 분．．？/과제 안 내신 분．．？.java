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
	    
	    //int N = sc.nextInt();
	    //int M = sc.nextInt();
	    int num[] = new int[30];
	    
	    for(int x=0; x<30; x++){
	        num[x] = x+1;
	    }

	    for(int x=0; x<28; x++){
	        int i = sc.nextInt();
	        num[i-1] = 0;
	    }
	    for(int x=0; x<30; x++){
	        if(num[x] != 0){
	            System.out.println(num[x]);
	        }
	    }
	    
        
    }
}

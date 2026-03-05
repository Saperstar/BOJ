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
	    int num[] = new int[10];
	    int skajwl[] = new int[42];
	    int ans = 0;
	    
	    /*for(int x=0; x<30; x++){
	        num[x] = x+1;
	    }
        */
        
	    for(int x=0; x<10; x++){
	        int i = sc.nextInt();
	        int k = i%42;
	        skajwl[k] = 1;
	    }
	    for(int x=0; x<42; x++){
	        if(skajwl[x] == 1){
	            ans++;
	        }
	    }
	    
	    System.out.println(ans);
        
    }
}

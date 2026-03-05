/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m>=45){
		    m = m-45;
		}
		else{
		    m = m+15;
		    if(h==0){
		        h=23;
		    }
		    else{
		        h--;
		    }
		}
		
		System.out.println(h+" "+m);
    }
}

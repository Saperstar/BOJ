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
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
		    int R = sc.nextInt();
		    String P1 = sc.nextLine();
		    for(int j=1; j<P1.length(); j++){
		        for(int k=0; k<R; k++){
		            System.out.print(P1.charAt(j));
		        }

		    }
		    System.out.println("");
		}

	}
}

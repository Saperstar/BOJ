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
        int num = 2*N-1;
        for(int k=1; k<N+1; k++){
            for(int i=N; i>k; i--){
                System.out.print(" ");
            }
            for(int i=0; i<(2*k-1); i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=1; k<N+1; k++){
            for(int i=k; i>0; i--){
                System.out.print(" ");
            }
            for(int i=0; i<(2*(N-k)-1); i++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

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
		
		int Q1 = sc.nextInt();
		int Q2 = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = Q1%10;      //일의자리
		c = Q1/100;     //백의자리
		b = (Q1-(100*c)-a)/10;
		int Q1_ = 100*a + 10*b + c;
		
		a = Q2%10;
		c = Q2/100;
		b = (Q2-(100*c)-a)/10;
		int Q2_ = 100*a + 10*b + c;
		
		if(Q1_<Q2_){
		    System.out.println(Q2_);
		}
		else{
		    System.out.println(Q1_);
	    }
    }
}

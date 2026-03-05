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
		int num=0;
		while(sc.hasNextLine()){
		    String text = sc.nextLine();
		    
		    System.out.println(text);
		    num++;
		    if(num==100){
		        break;
		    }
		}
		

    }
}

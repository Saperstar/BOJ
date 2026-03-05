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

		//String Word = sc.nextLine();
		int T = sc.nextInt();
		sc.nextLine();
		String[] Wordarr = new String[T];
		for(int i=0; i<T; i++){
		    String Word = sc.nextLine();
		    String X = Word.charAt(0)+""+Word.charAt(Word.length()-1);
		    Wordarr[i] = X;
		}
		for(int i=0; i<T; i++){
		    System.out.println(Wordarr[i]);
		}
		
	}
}

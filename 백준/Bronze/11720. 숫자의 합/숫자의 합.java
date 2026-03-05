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
		
        int sum = 0;
		int N = sc.nextInt();
		sc.nextLine();
		int num[] = new int[N];

        String S = sc.nextLine();
        for(int i=0; i<N; i++){
            num[i] = Character.getNumericValue(S.charAt(i));
        }
        for(int i=0; i<N; i++){
            sum += num[i];
        }
        System.out.println(sum);
	}
}

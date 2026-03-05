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
		
		int X = -1;
		char str[] = new char[100];

        String S = sc.nextLine();
        for(int i=0; i<S.length(); i++){
            str[i] = S.charAt(i);
        }
        for(int i=97; i<123; i++){
            for(int j=0; j<S.length(); j++){
                if((int)str[j] == i){
                    X = j;
                    break;
                }
            }
            System.out.print(X+" ");
            X = -1;
        }
	}
}

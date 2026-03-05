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
    public static int timeis(char a){
        int b = a;
        if(b>=65 && b<=67){
            b = 3;
        }
        else if(b<71){
            b = 4;
        }
        else if(b<74){
            b = 5;
        }
        else if(b<77){
            b = 6;
        }
        else if(b<80){
            b = 7;
        }
        else if(b<84){
            b = 8;
        }
        else if(b<87){
            b = 9;
        }
        else if(b<91){
            b = 10;
        }
        else{
            //do nothing
        }
        
        return b;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		int time = 0;
		int testnum = 0;
		for(int i=0; i<text.length(); i++){
		    testnum = timeis(text.charAt(i));
		    time += testnum;
		}
		System.out.println(time);
		
		
		



    }
}

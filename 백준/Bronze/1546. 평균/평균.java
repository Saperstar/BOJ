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
		
		float avg;
		float sum = 0;
		float max = 0;
		int N = sc.nextInt();
		float arr[] = new float[N];
		float gradearr[] = new float[N];
		
		for(int i=0; i<N; i++){
		    float grade = sc.nextInt();
		    sum = sum + grade;
		    gradearr[i] = grade;
		}
		for(int i=0; i<N; i++){
		    if(gradearr[i] > max){
		        max = gradearr[i];
		    }
		}
        avg = (sum*100)/(max*N);
        System.out.println(avg);
	}
}

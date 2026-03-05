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
		
		int answer = 0;
		int boomtime = 210;
		int curtime = 0;
		int k = sc.nextInt();			//시작번호
		int n = sc.nextInt();			//문제의 개수
		for(int i = 0; i < n; i++) {	//문제만큼 반복
			int t = sc.nextInt();		//시간 입력받기
			String ans = sc.next();	//대답 입력받기
			curtime += t;				//폭발시간계산
			if(curtime > boomtime) {
				answer = k;
				boomtime = 9999;
			}
			switch(ans) {
    			case "T":					//정답일 경우
    				k++;
    				break;
    			case "N":				//오답 or 스킵일 경우
    				break;
    			case "P":
    			    break;
			}
			if(k == 9){
			    k = 1;
			}
		}
		System.out.println(answer);
		
		sc.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input;
		sc.nextLine();
		for(int i = 0; i < N; i++) {
			int isVPS = 0;
			input = sc.nextLine();
			for(int k = 0; k < input.length(); k++) {
				switch(input.charAt(k)) {
				case '(':
					isVPS++;
					break;
				case ')':
					isVPS--;
					break;
				}
				if(isVPS < 0) isVPS = -100;
			}
			if(isVPS == 0) System.out.println("YES");
			else System.out.println("NO");
		}
		
		sc.close();
		
		
		
	}

}
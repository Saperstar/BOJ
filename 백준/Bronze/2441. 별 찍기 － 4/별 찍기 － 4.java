import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = N; i > 0; i--) {
			for(int k = 0; k < i; k++) {
				System.out.print('*');
			}
			System.out.println();
			for(int k = 0; k <= N - i; k++) {
				System.out.print(" ");
			}
		}
		
		sc.close();
		
		
		
	}

}
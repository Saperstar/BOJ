import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 1;
		for(int i = 1; i <= N; i++) {
			if(N == 0) {
				System.out.println("1");
				break;
			}
			else {
				ans = ans * i;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}


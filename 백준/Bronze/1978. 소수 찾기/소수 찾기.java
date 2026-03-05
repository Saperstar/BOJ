import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < N; i++) {
			boolean isCan = true;
			int num = sc.nextInt();
			for(int k = 2; k < num; k++) {
				if(num % k == 0) {
					isCan = false;
					break;
				}
			}
			if(num == 1) isCan = false;
			if(isCan) ans++;
		}
		System.out.println(ans);
		
		sc.close();
		
		
		
	}

}
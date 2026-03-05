import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = n;
		for(int i = 0; i < m; i++) {
			int usedData = sc.nextInt();
			ans += (n - usedData);
		}
		System.out.println(ans);
		
		sc.close();
		
	}

}

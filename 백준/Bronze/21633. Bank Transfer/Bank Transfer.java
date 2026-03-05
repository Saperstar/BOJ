import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double ans = 25 + n/100;
		if(ans < 100) ans = 100;
		else if(ans > 2000) ans = 2000;
		System.out.printf("%.2f%n", ans);
		
		sc.close();
		
	}

}

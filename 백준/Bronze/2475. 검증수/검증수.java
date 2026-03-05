import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sumnumz = 0;
		for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sumnumz += num[i] * num[i];
		}
		int ans = sumnumz % 10;
		System.out.println(ans);
		

		
		sc.close();
	}

}


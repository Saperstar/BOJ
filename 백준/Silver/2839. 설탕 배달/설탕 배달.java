import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int time = (int)n/5 + 1;
		int ans5 = 0, ans3 = 0;
		boolean can = false;
		for(int i = time; i >= 0; i--) {
			if((n - (5 * i)) % 3 == 0 && (n - (5 * i)) >= 0) {
				ans5 = i;
				ans3 = (n - (5 * i)) / 3;
				can = true;
				break;
			}
		}
		if(can) System.out.println(ans5 + ans3);
		else System.out.println("-1");
		
		sc.close();
		
		
		
	}

}

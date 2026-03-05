import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int[] big = new int[1];
			while(true) {
				if(big[0] < num) big[0] = num;
				if(num == 1) break;
				
				if(num % 2 == 0) num /= 2;
				else num = (num * 3) + 1;
			}
			System.out.println(big[0]);
			
		}
		
		sc.close();
		
	}

}

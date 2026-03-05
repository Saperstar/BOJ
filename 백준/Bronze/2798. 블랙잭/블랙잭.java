import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] card = new int[N];
		int num = 0;
		int max = 0;
		int M = sc.nextInt();
		for(int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					num = card[i] + card[j] + card[k];
					if(num <= M && num > max) max = num;
				}
			}
		}
		System.out.println(max);
		
		sc.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] size = new int[6];
		int TAns = 0, PAns = 0;
		for(int i = 0; i < 6; i++) {
			size[i] = sc.nextInt();
		}
		int T = sc.nextInt();
		int P = sc.nextInt();
		for(int i = 0; i < 6; i++) {
			TAns += size[i] / T;
			if(size[i] % T != 0) TAns++;
		}
		System.out.println(TAns);
		
		System.out.println(N/P + " " + (N%P));
		
		
		sc.close();
	}

}

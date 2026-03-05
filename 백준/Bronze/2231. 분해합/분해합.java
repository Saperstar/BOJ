import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		for(int i = N - 81; i <= N; i++) {
			int iSum = i;
			String strI = String.valueOf(i);
			for(int k = 0; k < strI.length(); k++) {
				iSum += Character.getNumericValue(strI.charAt(k));
			}
			if(iSum == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

}

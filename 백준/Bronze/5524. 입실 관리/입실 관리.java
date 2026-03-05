import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String name = sc.nextLine();
			String lowerName = name.toLowerCase();
			System.out.println(lowerName);
			
		}
		
		sc.close();
		
	}

}

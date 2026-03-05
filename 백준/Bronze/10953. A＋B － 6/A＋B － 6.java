import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String inputNum = sc.nextLine();
			String[] nums = inputNum.split(",");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			System.out.println(a + b);
			
		}
		
		sc.close();
		
	}

}

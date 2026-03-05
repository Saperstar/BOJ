import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cycle = 0;
		int getA = a;
		while(true) {
			getA = calculate(getA);
			cycle++;
			if(a == getA) break;
		}
		System.out.println(cycle);
		
		sc.close();
		
	}

	public static int calculate(int a) {
		int ten = a / 10;
		int one = a % 10;
		int key = 0;
		if(ten + one < 10) {
			key = one * 11 + ten;
		}
		else {
			key = one * 10 + (ten + one) % 10;
		}
		
		return key;
	}
}
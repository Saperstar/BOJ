import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int howLong = line.length();
		int X = 2;
		for(int i=0; i<howLong-1; i++) {
			if(line.charAt(i)==line.charAt(howLong-1)) {
			howLong--;
			//continue
			}
			else {
			System.out.println("0");
			X = 1;
			break;
			}
		}
		if(X==2) {
		System.out.println("1");
		}
		sc.close();
	}

}

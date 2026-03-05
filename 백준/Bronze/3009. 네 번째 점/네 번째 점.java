import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int x1, x2, x3, y1, y2, y3;
		int x4 = 0, y4 = 0;
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		if(x1 == x2) x4 = x3;
		else if(x2 == x3) x4 = x1;
		else if(x3 == x1) x4 = x2;
		if(y1 == y2) y4 = y3;
		else if(y2 == y3) y4 = y1;
		else if(y3 == y1) y4 = y2;
		
		System.out.println(x4 + " " + y4);

		
		
		
		
	}

}
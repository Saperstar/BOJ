import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean cana = false, cand = false, isMixed = false;
		if(a == 1) cana = true;
		else if(a == 8) cand = true;
		else isMixed = true;
		for(int i = 0; i < 7; i++) {
			int b = sc.nextInt();
			if(cana) {
				if(a >= b) cana = false;
			}
			else if(cand) {
				if(a <= b) cand = false;
			}
			a = b;
		}
		if(cana == false && cand == false) isMixed = true; 
		if(cana) System.out.println("ascending");
		if(cand) System.out.println("descending");
		if(isMixed) System.out.println("mixed");
		
		
		sc.close();
	}

}

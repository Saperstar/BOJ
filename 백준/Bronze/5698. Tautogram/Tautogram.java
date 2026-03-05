import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(!sc.hasNextLine()) break;
			String n = sc.nextLine();
			if(n.equals("*")) break;
			n = n.toLowerCase().trim();
			String[] lines = n.split("\\s+");
			boolean isCan = true;
			
			char k = lines[0].charAt(0);
			for(int i = 0; i < lines.length; i++) {
				if(lines[i].charAt(0) != k) {
					isCan = false; 
					break;
				}
			}
			System.out.println(isCan ? "Y" : "N");
		}
		sc.close();
	}

}

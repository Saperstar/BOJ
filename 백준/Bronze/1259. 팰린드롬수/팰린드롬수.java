import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numLine1 = new String[5];
		String[] numLine2 = new String[5];
		while(true) {
			String num = br.readLine();
			if(num.equals("0")) break;
			int k = num.length()-1;
			for(int i = 0; i < num.length(); i++) {
				numLine1[i] = String.valueOf(num.charAt(i));
				numLine2[i] = String.valueOf(num.charAt(k));
				k--;
			}
			if(Arrays.equals(numLine1, numLine2)) System.out.println("yes");
			else System.out.println("no");
			Arrays.fill(numLine1, "0");
			Arrays.fill(numLine2, "0");
			
		}
		
	}

}
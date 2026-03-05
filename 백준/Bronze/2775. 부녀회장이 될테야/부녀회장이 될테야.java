import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int sum = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int i1 = 0; i1 < T; i1++) {
			int k = Integer.parseInt(br.readLine());	//층수
			int n = Integer.parseInt(br.readLine());	//호수
			
			sum = getPeople(k, n);
			System.out.println(sum);
			sum = 0;
		}

	}
	public static int getPeople(int a, int b) {
		if(a == 0) return b;
		else if(b == 0) return sum;
		else return getPeople(a - 1, b) + getPeople(a, b - 1);
	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int M = Integer.parseInt(line[0]);
		int N = Integer.parseInt(line[1]);
		int prime;
		for(int i = M; i <= N; i++) {
			prime = isPrime(i);
			if(prime != -1) bw.write(prime + "\n");
			
		}
		bw.flush();
			
			
		
		

	}
	
	public static int isPrime(int num) {
		if(num < 2) return -1;
		if(num == 2) return num;
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return -1;
		}
		return num;
		
		
	}

}

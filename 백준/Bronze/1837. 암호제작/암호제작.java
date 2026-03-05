import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean isGood = true;
		String input = br.readLine();
		String[] line = input.split(" ");
		BigInteger P = new BigInteger(line[0]);
		BigInteger K = new BigInteger(line[1]);
		for(BigInteger i = BigInteger.TWO; i.compareTo(K) < 0; i = i.add(BigInteger.ONE)) {
			if(P.mod(i).equals(BigInteger.ZERO)) {
				bw.write("BAD " + i + "\n");
				isGood = false;
				break;
			}
		}
		if(isGood) bw.write("GOOD");
		
		
		bw.flush();
		
	}

}

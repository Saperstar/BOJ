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
        
        String[] line = br.readLine().split(" ");
        BigInteger A = new BigInteger(line[0]);
        BigInteger B = new BigInteger(line[1]);
        BigInteger C = new BigInteger(line[2]);

        BigInteger ans = A.modPow(B, C);

        bw.write(ans + "");
        bw.flush();
    }
}

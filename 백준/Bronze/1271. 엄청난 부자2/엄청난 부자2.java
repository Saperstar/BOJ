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
      BigInteger bi1 = new BigInteger(line[0]);
      BigInteger bi2 = new BigInteger(line[1]);
      
      BigInteger ans1 = bi1.divide(bi2);
      BigInteger ans2 = bi1.mod(bi2);
      bw.write(ans1 + "\n" + ans2);
      bw.flush();
      

      
   }
   
   

}


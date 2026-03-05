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
      
      String a = br.readLine();
      String b = br.readLine();
      
      BigInteger bi1 = new BigInteger(a);
      BigInteger bi2 = new BigInteger(b);
      
      bw.write(bi1.add(bi2) + "");
      bw.flush();
      

      
   }
   
   

}


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int d1 = Integer.parseInt(br.readLine());
      int d2 = Integer.parseInt(br.readLine());
      double ans = d1 * 2;
      double cir = (d2 * 2) * 3.141592;
      ans += cir;
      bw.write(ans + "");
      bw.flush();
      
   }
   
}



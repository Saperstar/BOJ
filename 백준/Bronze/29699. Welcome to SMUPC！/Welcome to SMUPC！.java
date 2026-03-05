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
      
      String str =  "WelcomeToSMUPCWelcomeToSMUPC";
      int N = Integer.parseInt(br.readLine());
      int nam = N % 14;
      bw.write(str.charAt(nam + 13) + "");
      bw.flush();
      
   }
   
}



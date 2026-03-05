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
      
      int hap = 0;
      for(int i = 0; i < 5; i++) {
    	  hap += Integer.parseInt(br.readLine());
      }
      bw.write(hap + "");
      bw.flush();
      

      
   }
   
   

}


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
      
      int x = Integer.parseInt(br.readLine());
      int nam = x % 3;
      if(nam == 0) bw.write("S");
      if(nam == 1) bw.write("U");
      if(nam == 2) bw.write("O");
      bw.flush();
      
   }
   
}



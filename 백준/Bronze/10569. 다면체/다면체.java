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
      
      int T = Integer.parseInt(br.readLine());
      for(int i = 0; i < T; i++) {
    	  String[] line = br.readLine().split(" ");
    	  int V = Integer.parseInt(line[0]);
    	  int E = Integer.parseInt(line[1]);
    	  int ans = 2 - V + E;
    	  bw.write(ans + "\n");
      }
      bw.flush();
      
   }
   
}



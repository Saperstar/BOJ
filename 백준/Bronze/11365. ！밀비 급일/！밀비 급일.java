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
      
      while(true) {
    	  String line = br.readLine();
    	  if(line.equals("END")) break;
    	  for(int i = line.length() - 1; i >= 0; i--) {
    		  bw.write(line.charAt(i) + "");
    	  }
    	  bw.write("\n");
      }
      bw.flush();
      
   }
   
}



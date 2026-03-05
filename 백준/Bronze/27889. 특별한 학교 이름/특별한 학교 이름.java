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
      
      String name = br.readLine();
      switch(name) {
      case "NLCS":
    	  bw.write("North London Collegiate School");
    	  break;
      case "BHA":
    	  bw.write("Branksome Hall Asia");
    	  break;
      case "KIS":
    	  bw.write("Korea International School");
	  break;
      case "SJA":
    	  bw.write("St. Johnsbury Academy");
	  break;
      }
      bw.flush();
      
   }
   
}



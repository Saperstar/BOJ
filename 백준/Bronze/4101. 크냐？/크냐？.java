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
    	  String[] line = br.readLine().split(" ");
    	  int a = Integer.parseInt(line[0]);
    	  int b = Integer.parseInt(line[1]);
    	  if(a == 0 && b == 0) break;
    	  if(a > b) bw.write("Yes\n");
    	  else bw.write("No\n");
      }
      bw.flush();
      
   }
   
}


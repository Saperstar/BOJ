import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int N = Integer.parseInt(br.readLine());
      for(int i = 1; i <= N; i++) {
    	  bw.write("Case #" + i + ": ");
    	  String[] line = br.readLine().split(" ");
    	  for(int k = line.length-1; k >= 0; k--) {
    		  bw.write(line[k] + " ");
    	  }
    	  bw.write("\n");
      }
      bw.flush();
      
      
   }
   
}



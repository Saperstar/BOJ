import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int N = Integer.parseInt(br.readLine());
      for(int i = 0; i < N; i++) {
    	  String[] line = br.readLine().split(" ");
    	  line[0] = "god";
    	  for(int k = 0; k < line.length; k++) {
    		  bw.write(line[k] + "");
    	  }
    	  bw.write("\n");
      }
      bw.flush();
      
   }

}


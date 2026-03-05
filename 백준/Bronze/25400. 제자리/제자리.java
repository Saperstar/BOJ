import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int combo = 1;
      int N = Integer.parseInt(br.readLine());
      String[] line = br.readLine().split(" ");
      for(int i = 0; i < line.length; i++) {
    	  if(Integer.parseInt(line[i]) == combo) combo++;
      }
      
      bw.write(N - combo + 1 + "");
      bw.flush();
      

      
   }

}


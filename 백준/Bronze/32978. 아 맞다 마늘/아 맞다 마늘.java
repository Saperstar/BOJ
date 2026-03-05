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
      Set<String> set = new HashSet<>();
      
      int N = Integer.parseInt(br.readLine());
      String[] line = br.readLine().split(" ");
      for(int i = 0; i < N; i++) {
    	  set.add(line[i]);
      }
      line = br.readLine().split(" ");
      for(int i = 0; i < N-1; i++) {
    	  set.remove(line[i]);
      }
      for(String s : set) System.out.println(s);
      
      
   }
   
}



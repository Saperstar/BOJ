import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      Map<String, Integer> map = new HashMap<>();
      
      
      int N = Integer.parseInt(br.readLine());
      for(int i = 0; i < N; i++) {
    	  String[] line = br.readLine().split(" ");
    	  if(map.getOrDefault(line[0], -1) == -1) map.put(line[0], Integer.parseInt(line[1]));
    	  else map.put(line[0], map.get(line[0]) + Integer.parseInt(line[1]));
      }
      boolean isCan = false;
      for(Integer i : map.values()) if(i == 5) isCan = true;
      if(isCan) bw.write("YES");
      else bw.write("NO");
      
      bw.flush();
      
      
   }
   
}



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
      
      int ans = 1;
      int N = Integer.parseInt(br.readLine());
      int[] sticks = new int[N];
      for(int i = 0; i < N; i++) sticks[i] = Integer.parseInt(br.readLine());
      int max = sticks[N-1];
      for(int i = N-1; i >= 0; i--) {
    	  if(sticks[i] > max) {
    		  ans++;
    		  max = sticks[i];
    	  }
      }
      bw.write(ans + "");
      bw.flush();
      
      
   }
   
}



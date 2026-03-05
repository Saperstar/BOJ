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
      
      int N = Integer.parseInt(br.readLine());
      for(int i = 0; i < N; i++) {
    	  String[] line = br.readLine().split(" ");
    	  int A = Integer.parseInt(line[0]);
    	  int B = Integer.parseInt(line[1]);
    	  int X = Integer.parseInt(line[2]);
    	  int W = A * (X - 1) + B;
    	  bw.write(W + "\n");
      }
      bw.flush();
      
   }
   
}



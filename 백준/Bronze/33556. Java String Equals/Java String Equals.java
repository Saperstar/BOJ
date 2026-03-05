import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      String A = br.readLine();
      String B = br.readLine();
      if(A.equals("null")) bw.write("NullPointerException\nNullPointerException");
      else if(B.equals("null")) bw.write("false\nfalse");
      else {
    	  bw.write(A.equals(B) + "\n");
    	  bw.write(A.equalsIgnoreCase(B) + "");
      }
      bw.flush();

      
   }

}


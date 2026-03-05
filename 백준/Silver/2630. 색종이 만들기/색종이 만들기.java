import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

   public static int[][] paper = new int[128][128];
   public static int ans0 = 0;
   public static int ans1 = 0;
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int N = Integer.parseInt(br.readLine());
      for(int i = 0; i < N; i++) {
         String[] line = br.readLine().split(" ");
         for(int k = 0; k < N; k++) {
            paper[i][k] = Integer.parseInt(line[k]);
         }
      }
      divide(0, 0, N);
      
      bw.write(ans0 + "\n" + ans1);
      bw.flush();
   }
   
   public static void divide(int x, int y, int size) {
	  int now = paper[x][y];
	  boolean needTodivide = false;
      for(int i = 0; i < size; i++) {
         for(int k = 0; k < size; k++) {
            if(paper[x+i][y+k] != now) {
            	needTodivide = true;
            }
         }
      }
      if(needTodivide == false) {
    	  switch(now) {
    	  	case 0:
    	  		ans0++;
    	  		break;
    	  	case 1:
    	  		ans1++;
    	  		break;
    	  }
      } else {
    	  divide(x, y, size/2);
    	  divide(x + size/2, y, size/2);
    	  divide(x, y + size/2, size/2);
    	  divide(x + size/2, y + size/2, size/2);
    	  
      }
      
   }

}


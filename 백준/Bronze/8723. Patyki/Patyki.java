import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int ans = 0;
      String[] line = br.readLine().split(" ");
      int[] nums = {Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])};
      Arrays.sort(nums);
      if(nums[0] * nums[0] + nums[1] * nums[1] == nums[2] * nums[2]) ans = 1;
      if(nums[0] == nums[1] && nums[1] == nums[2]) ans = 2;
      bw.write(ans + "");
      bw.flush();
      
   }
   
}



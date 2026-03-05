import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] splitByMinus = br.readLine().split("-");
		int[] caledNums = new int[splitByMinus.length];
		for(int i = 0; i < splitByMinus.length; i++) {
			try {
				String[] splitByPlus = splitByMinus[i].split("\\+");
				for(int k = 0; k < splitByPlus.length; k++) {
					caledNums[i] += Integer.parseInt(splitByPlus[k]);
				}
			} catch(Exception e) {
				caledNums[i] = Integer.parseInt(splitByMinus[i]);
			}
		}
		int ans = caledNums[0];
		for(int i = 1; i < caledNums.length; i++) {
			ans -= caledNums[i];
		}
		bw.write(ans + "");
		bw.flush();
		
		
	}
}

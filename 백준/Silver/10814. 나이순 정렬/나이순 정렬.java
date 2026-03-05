import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[][] members = new String[N][2];
		for(int i = 0; i < N; i++) {
			String line = br.readLine();
			String[] lines = line.split(" ");
			members[i][0] = lines[0];
			members[i][1] = lines[1];
			
		}
		
		Arrays.sort(members, (a, b) -> {
				int ageA = Integer.parseInt(a[0]);
				int ageB = Integer.parseInt(b[0]);
				return (ageA - ageB);
		});
		
		for(int i = 0; i < N; i++) {
			bw.write(members[i][0] + " " + members[i][1] + "\n");
		}
		bw.flush();

	}

}
	

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] Jem = new int[9];
		int[] Sta = new int[9];
		int JScore = 0;
		int SScore = 0;
		boolean ans = false;
		String[] line = br.readLine().split(" ");
		for(int i = 0; i < line.length; i++) {
			Jem[i] = Integer.parseInt(line[i]);
		}
		line = br.readLine().split(" ");
		for(int i = 0; i < line.length; i++) {
			Sta[i] = Integer.parseInt(line[i]);
		}
		for(int i = 0; i < line.length; i++) {
			if(JScore > SScore) ans = true;
			JScore += Jem[i];
			if(JScore > SScore) ans = true;
			SScore += Sta[i];
		}
		if(ans) bw.write("Yes");
		else bw.write("No");
		
		
		bw.flush();
	}

}
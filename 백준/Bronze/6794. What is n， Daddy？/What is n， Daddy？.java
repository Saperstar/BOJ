import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		switch(N) {
		case 1:
			bw.write("1");
			break;
		case 2:
			bw.write("2");
			break;
		case 3:
			bw.write("2");
			break;
		case 4:
			bw.write("3");
			break;
		case 5:
			bw.write("3");
			break;
		case 6:
			bw.write("3");
			break;
		case 7:
			bw.write("2");
			break;
		case 8:
			bw.write("2");
			break;
		case 9:
			bw.write("1");
			break;
		case 10:
			bw.write("1");
			break;
		}
		
		
		bw.flush();
	}

}
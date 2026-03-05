import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			String line = br.readLine();
			char C = line.charAt(line.length() - 1);
			switch(C) {
			case 'a':
				bw.write(line.substring(0, line.length() - 1) + "as\n");
				break;
			case 'i':
				bw.write(line.substring(0, line.length() - 1) + "ios\n");
				break;
			case 'y':
				bw.write(line.substring(0, line.length() - 1) + "ios\n");
				break;
			case 'l':
				bw.write(line.substring(0, line.length() - 1) + "les\n");
				break;
			case 'n':
				bw.write(line.substring(0, line.length() - 1) + "anes\n");
				break;
			case 'e':
				if(line.charAt(line.length() - 2) == 'n') {
					bw.write(line.substring(0, line.length() - 2) + "anes\n");
				}
				else bw.write(line + "us\n");
				break;
			case 'o':
				bw.write(line.substring(0, line.length() - 1) + "os\n");
				break;
			case 'r':
				bw.write(line.substring(0, line.length() - 1) + "res\n");
				break;
			case 't':
				bw.write(line.substring(0, line.length() - 1) + "tas\n");
				break;
			case 'u':
				bw.write(line.substring(0, line.length() - 1) + "us\n");
				break;
			case 'v':
				bw.write(line.substring(0, line.length() - 1) + "ves\n");
				break;
			case 'w':
				bw.write(line.substring(0, line.length() - 1) + "was\n");
				break;
			default:
				bw.write(line + "us\n");
			}
			
		}
			
		bw.flush();

	}


}

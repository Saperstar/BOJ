import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double num;
		double sum = Double.parseDouble(br.readLine());
		while(true) {
			String giho = br.readLine();
			switch(giho) {
				case("+"):
					num = Double.parseDouble(br.readLine());
					sum += num;
					continue;
				case("-"):
					num = Double.parseDouble(br.readLine());
					sum -= num;
					continue;
				case("*"):
					num = Double.parseDouble(br.readLine());
					sum *= num;
					continue;
				case("/"):
					num = Double.parseDouble(br.readLine());
					sum = Math.floor(sum / num);
					continue;
			}
			if(giho.equals("=")) break;
		}		
		bw.write((int)sum + "");
		bw.flush();
	}

}


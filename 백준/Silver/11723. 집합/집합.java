import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<Integer> list = new HashSet<>();
		int num = 0;
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			if(line.length > 1) num = Integer.parseInt(line[1]);
			switch(line[0]) {
			case "add":
				list.add(num);
				break;
			case "remove":
				list.remove(num);
				break;
			case "check":
				if(list.contains(num)) bw.write("1\n");
				else bw.write("0\n");
				break;
			case "toggle":
				if(list.contains(num)) list.remove(num);
				else list.add(num);
				break;
			case "all":
				list.clear();
				for(int k = 1; k < 21; k++) {
					list.add(k);
				}
				break;
			case "empty":
				list.clear();
				break;
			
			}
			
		}
		bw.flush();
		
	}
}

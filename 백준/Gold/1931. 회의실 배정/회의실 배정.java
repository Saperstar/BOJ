import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			row.add(a);
			row.add(b);
			list.add(row);
		}
		
		list.sort((a, b) -> {
		    if (a.get(1).equals(b.get(1))) {
		        return a.get(0).compareTo(b.get(0));
		    }
		    return a.get(1).compareTo(b.get(1));
		});

		int count = 0;
		int lastEnd = 0;

		for (ArrayList<Integer> list1 : list) {
		    if (list1.get(0) >= lastEnd) {
		        count++;
		        lastEnd = list1.get(1);
		    }
		}

		bw.write(count + "");
		bw.flush();

		
	}
	

}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] chair = new String[N];
		String[][] realChair = new String[N][2];
		for(int i = 0; i < N; i++) {
			chair[i] = br.readLine();
			realChair[i][0] = chair[i].substring(0, 1);
			realChair[i][1] = chair[i].substring(1);
		}

        Arrays.sort(realChair, (a, b) -> {
            int alp = a[0].compareTo(b[0]);
            if (alp != 0) return alp;

            return Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
        });
        
        int x = 0;
        
		for(int i = 0; i < 10; i++) {
			for(int k = 0; k < 20; k++) {
				if(x < N && i == (realChair[x][0].charAt(0) - 'A') && k == Integer.parseInt(realChair[x][1]) - 1) {
						bw.write("o");
						x++;
					}
					else {
						bw.write(".");
					}
				}
			bw.write("\n");
		}
		bw.flush();
		
		
		
	}

}

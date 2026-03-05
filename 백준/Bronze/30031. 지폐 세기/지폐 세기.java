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
        int ans = 0;
        for(int i = 0; i < N; i++) {
        		String[] line = br.readLine().split(" ");
        		int temp = Integer.parseInt(line[0]);
        		if(temp == 136) ans += 1000;
        		if(temp == 142) ans += 5000;
        		if(temp == 148) ans += 10000;
        		if(temp == 154) ans += 50000;
        }
        bw.write(ans + "");
        
        bw.flush();
    }

}
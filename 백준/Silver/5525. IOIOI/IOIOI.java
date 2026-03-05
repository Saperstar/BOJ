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
        int M = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int ans = 0;
        int count = 0;

        for (int i = 1; i < M - 1; i++) {
            if (line.charAt(i-1) == 'I' && line.charAt(i) == 'O' && line.charAt(i+1) == 'I') {
                count++;
                if (count >= N) ans++;
                i++;
            } else count = 0;
        }

        bw.write(ans + "");
        bw.flush();
    }

}
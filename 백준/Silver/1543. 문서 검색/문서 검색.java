import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String ans = br.readLine();
        int answer = 0;

        for (int i = 0; i <= line.length() - ans.length(); i++) {
            String sub = line.substring(i, i + ans.length());
            if (sub.equals(ans)) {
                answer++;
                i += ans.length() - 1;
            }
        }

        bw.write(answer + "");
        bw.flush();
    }
}


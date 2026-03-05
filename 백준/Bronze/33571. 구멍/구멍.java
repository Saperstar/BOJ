import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        String S = br.readLine();
        int ans = 0;
        for(int i = 0; i < S.length(); i++) {
        		char nowC = S.charAt(i);
        		if(nowC == 'A' || nowC == 'a' || nowC == 'b' || nowC == 'D' || 
        				nowC == 'd' || nowC == 'e' || nowC == 'g' || nowC == 'O' || 
        				nowC == 'o' || nowC == 'P' || nowC == 'p' || nowC == 'Q' || 
        				nowC == 'q' || nowC == 'R' || nowC == '@') ans++;
        		else if(nowC == 'B') ans += 2;
        }
        bw.write(ans + "");
        bw.flush();
    }

}
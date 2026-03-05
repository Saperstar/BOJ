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
        String[] line = br.readLine().split(" ");
        int hap = 0;
        for(String s : line) hap += Integer.parseInt(s);
        int ansHour = hap + (N - 1) * 8; 
        bw.write(ansHour / 24 + " "	+ ansHour % 24);
        
        bw.flush();
    }

}
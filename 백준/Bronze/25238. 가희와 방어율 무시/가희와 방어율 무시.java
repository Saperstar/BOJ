import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        double a = Integer.parseInt(line[0]);
        double b = Integer.parseInt(line[1]);
        double isBig = a * ((100-b)/100);
        if(isBig < 100) bw.write("1");
        else bw.write("0");
        bw.flush();
    }
}


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int[] ball = new int[4];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ball[0] = -1;
		ball[1] = 0;
		ball[2] = 0;
		ball[3] = 1;
		String line = br.readLine();
		for(int i = 0; i < line.length(); i++) {
			char how = line.charAt(i);
			change(how);
		}
		int ansmin = 0, ansmax = 0;
		for(int i = 0; i < 4; i++) {
			if(ball[i] == -1) ansmin = i+1;
			if(ball[i] == 1) ansmax = i+1;
		}
		bw.write(ansmin + "\n" + ansmax);
		bw.flush();

	}
	
	public static void change(char X) {
		int tem = 0;
		switch(X) {
		case 'A':
			tem = ball[0];
			ball[0] = ball[1];
			ball[1] = tem;
			break;
		case 'B':
			tem = ball[0];
			ball[0] = ball[2];
			ball[2] = tem;
			break;
		case 'C':
			tem = ball[0];
			ball[0] = ball[3];
			ball[3] = tem;
			break;
		case 'D':
			tem = ball[1];
			ball[1] = ball[2];
			ball[2] = tem;
			break;
		case 'E':
			tem = ball[1];
			ball[1] = ball[3];
			ball[3] = tem;
			break;
		case 'F':
			tem = ball[2];
			ball[2] = ball[3];
			ball[3] = tem;
			break;
		}
		
	}

}

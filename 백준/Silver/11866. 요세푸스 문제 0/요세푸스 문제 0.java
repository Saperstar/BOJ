import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deque = new ArrayDeque<>();
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		for(int i = 1; i < N+1; i++) {
			deque.offer(i);
		}
		
		bw.write("<");
		while(deque.size() > 1) {
			for(int i = 0; i < K-1; i++) {
				deque.offer(deque.pop());
			}
			bw.write(deque.pop() + ", ");
			
		}
		bw.write(deque.pop() + ">");
		bw.flush();
		
	}
	

}

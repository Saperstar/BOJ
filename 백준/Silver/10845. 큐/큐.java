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
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			String line = br.readLine();
			switch(line) {
			case "pop" :
				if(deque.size() > 0) bw.write(deque.poll() + "\n");
				else bw.write("-1\n");
				break;
			case "size" :
				bw.write(deque.size() + "\n");
				break;
			case "empty" :
				if(deque.size() == 0) bw.write("1\n");
				else bw.write("0\n");
				break;
			case "front" :
				if(deque.size() > 0) bw.write(deque.peekFirst() + "\n");
				else bw.write("-1\n");
				break;
			case "back" :
				if(deque.size() > 0) bw.write(deque.peekLast() + "\n");
				else bw.write("-1\n");
				break;
			default:
				int num = Integer.parseInt(line.substring(5));
				deque.offer(num);
				break;
			
			
			}
		}
		bw.flush();

	} 

}

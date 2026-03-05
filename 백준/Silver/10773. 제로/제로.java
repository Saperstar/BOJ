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
		
		Deque<Integer> stack = new ArrayDeque<>();
		
		int sum = 0;
		int K = Integer.parseInt(br.readLine());
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) stack.pop();
			else {
				stack.push(num);
			}
			
		}
		while(stack.size() > 0) {
			sum += stack.pop();
		}
		bw.write(sum + "");
		bw.flush();

	}

}
